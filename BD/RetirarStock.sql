--PROCEDIMIENTO DEL CUAL ME SIENTO ORGULLOSO
CREATE PROCEDURE RetirarStock(
	@idUsuario int,
	@nombreProducto varchar(30),
	@cantidadPedida int,
	@fecha date
)AS
BEGIN
	BEGIN TRANSACTION;
	SAVE TRANSACTION puntoDeSalvado;
	--DECLARADO DE VARIABLES
	DECLARE @idProducto int;
	SET @idProducto = (select id from Producto where nombre = @nombreProducto);

	DECLARE @cantidadProducto int;
	SET @cantidadProducto = (select SUM(cantidad) as cantidad from almacen where id_producto = @idProducto);

	DECLARE @tabla table(id int,id_producto int,cantidad int,fecha_Caducidad date);
	INSERT INTO @tabla select * from almacen where id_producto = @idProducto order by fecha_Caducidad asc;

	DECLARE @acumulador int;
	SET @acumulador = (select top(1) cantidad from @tabla order by fecha_Caducidad asc);
	declare @Id int;

	BEGIN TRY
		-- CODIGO
		IF @cantidadPedida>@cantidadProducto
			BEGIN
				RAISERROR (
				N'CANTIDAD INGRESADA NO VALIDA.', -- Mensaje de ejemplo
				10, -- Severity,  
				1   -- State
				);
				RETURN
			END
		ELSE IF @cantidadPedida=@cantidadProducto
			BEGIN
				insert into registro(id_usuario,id_producto,operacion,cantidad,fecha) values
					(@idUsuario,@idProducto,'Retiro Stock',@cantidadPedida,@fecha);

				delete from almacen where id_producto = @idProducto;
				RETURN
			END
		ELSE
			BEGIN
				while @acumulador < @cantidadPedida
					BEGIN
						set @Id = (select top(1) id from @tabla order by fecha_Caducidad asc)

						delete from @tabla where id=@Id
						delete from almacen where id = @Id
						
						declare @Cantidad int = (select top(1) cantidad from @tabla order by fecha_Caducidad asc)
						SET @acumulador = @acumulador + @Cantidad
					END

				set @Id = (select top(1) id from @tabla order by fecha_Caducidad asc)

				DECLARE @diferencia int = @acumulador - @cantidadPedida;

				update almacen set cantidad=@diferencia where id = @Id

				insert into registro(id_usuario,id_producto,operacion,cantidad,fecha) values
					(@idUsuario,@idProducto,'Retiro Stock',@cantidadPedida,@fecha);

			END
		-- CODIGO
		COMMIT TRANSACTION;
	END TRY

	BEGIN CATCH
		IF @@TRANCOUNT > 0
		BEGIN
			ROLLBACK TRANSACTION puntoDeSalvado;
		END
	END CATCH

END;

select * from Producto
select * from almacen
select * from registro

EXEC RetirarStock 1,'Manzana',1000, '10-10-2022'
