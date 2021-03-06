USE [BDAlmacen]
GO
/****** Object:  Table [dbo].[pregunta]    Script Date: 19/7/2022 20:26:42 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[pregunta](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[pregunta] [varchar](100) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Usuario]    Script Date: 19/7/2022 20:26:42 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Usuario](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[nombre] [varchar](50) NOT NULL,
	[contrasena] [varchar](50) NOT NULL,
	[id_tipo] [int] NULL,
	[id_pregunta] [int] NULL,
	[respuesta] [varchar](100) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  UserDefinedFunction [dbo].[BuscarContrasena]    Script Date: 19/7/2022 20:26:42 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
create function [dbo].[BuscarContrasena](
	@nombre varchar(20),
	@pregunta varchar(100),
	@respuesta varchar(100)
) returns table
as
return(
	select contrasena from usuario where id = (select id from Usuario where nombre = @nombre and (select pregunta from pregunta where id = id_pregunta) = @pregunta and respuesta = @respuesta)
);
GO
/****** Object:  Table [dbo].[almacen]    Script Date: 19/7/2022 20:26:42 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[almacen](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[id_producto] [int] NOT NULL,
	[cantidad] [int] NULL,
	[fecha_Caducidad] [date] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Producto]    Script Date: 19/7/2022 20:26:42 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Producto](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[nombre] [varchar](50) NOT NULL,
	[descripcion] [varchar](200) NULL,
	[precio] [float] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[registro]    Script Date: 19/7/2022 20:26:42 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[registro](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[id_usuario] [int] NOT NULL,
	[id_producto] [int] NOT NULL,
	[operacion] [char](50) NOT NULL,
	[cantidad] [int] NULL,
	[fecha] [date] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tipoUsuario]    Script Date: 19/7/2022 20:26:42 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tipoUsuario](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[tipo] [char](50) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[almacen] ON 

INSERT [dbo].[almacen] ([id], [id_producto], [cantidad], [fecha_Caducidad]) VALUES (1, 1, 100, CAST(N'2022-12-12' AS Date))
INSERT [dbo].[almacen] ([id], [id_producto], [cantidad], [fecha_Caducidad]) VALUES (2, 2, 25, CAST(N'2022-12-12' AS Date))
INSERT [dbo].[almacen] ([id], [id_producto], [cantidad], [fecha_Caducidad]) VALUES (3, 3, 40, CAST(N'2022-12-12' AS Date))
INSERT [dbo].[almacen] ([id], [id_producto], [cantidad], [fecha_Caducidad]) VALUES (4, 4, 30, CAST(N'2022-12-12' AS Date))
INSERT [dbo].[almacen] ([id], [id_producto], [cantidad], [fecha_Caducidad]) VALUES (5, 5, 10, CAST(N'2023-04-12' AS Date))
INSERT [dbo].[almacen] ([id], [id_producto], [cantidad], [fecha_Caducidad]) VALUES (6, 6, 30, CAST(N'2023-02-28' AS Date))
INSERT [dbo].[almacen] ([id], [id_producto], [cantidad], [fecha_Caducidad]) VALUES (7, 5, 20, CAST(N'2023-03-28' AS Date))
INSERT [dbo].[almacen] ([id], [id_producto], [cantidad], [fecha_Caducidad]) VALUES (8, 2, 15, CAST(N'2022-10-05' AS Date))
INSERT [dbo].[almacen] ([id], [id_producto], [cantidad], [fecha_Caducidad]) VALUES (14, 2, 10, CAST(N'2022-08-22' AS Date))
SET IDENTITY_INSERT [dbo].[almacen] OFF
GO
SET IDENTITY_INSERT [dbo].[pregunta] ON 

INSERT [dbo].[pregunta] ([id], [pregunta]) VALUES (1, N'¿Cual es el nombre de tu primera mascota?')
INSERT [dbo].[pregunta] ([id], [pregunta]) VALUES (2, N'Cual es la pelicula que menos te gusta?')
INSERT [dbo].[pregunta] ([id], [pregunta]) VALUES (3, N'¿En que ciudad naciste?')
INSERT [dbo].[pregunta] ([id], [pregunta]) VALUES (4, N'¿Nombre de tu villano favorito?')
SET IDENTITY_INSERT [dbo].[pregunta] OFF
GO
SET IDENTITY_INSERT [dbo].[Producto] ON 

INSERT [dbo].[Producto] ([id], [nombre], [descripcion], [precio]) VALUES (0, N'Producto Eliminado', N'Este producto a sido eliminado', 0)
INSERT [dbo].[Producto] ([id], [nombre], [descripcion], [precio]) VALUES (1, N'Manzana', N'Manzana roja', 0.2)
INSERT [dbo].[Producto] ([id], [nombre], [descripcion], [precio]) VALUES (2, N'Palta', N'Palta Lambayecana', 1)
INSERT [dbo].[Producto] ([id], [nombre], [descripcion], [precio]) VALUES (3, N'Botella de agua', N'Botella de agua San Luis 625ml', 1.2)
INSERT [dbo].[Producto] ([id], [nombre], [descripcion], [precio]) VALUES (4, N'chifle', N'Chifles piuranos', 2)
INSERT [dbo].[Producto] ([id], [nombre], [descripcion], [precio]) VALUES (5, N'Avena', N'Avena super nutritiva', 5.2)
INSERT [dbo].[Producto] ([id], [nombre], [descripcion], [precio]) VALUES (6, N'Yogurt', N'El mejor yogurt cajamarquino', 3.25)
SET IDENTITY_INSERT [dbo].[Producto] OFF
GO
SET IDENTITY_INSERT [dbo].[registro] ON 

INSERT [dbo].[registro] ([id], [id_usuario], [id_producto], [operacion], [cantidad], [fecha]) VALUES (2, 1, 1, N'ingreso                                           ', 200, CAST(N'2022-05-06' AS Date))
INSERT [dbo].[registro] ([id], [id_usuario], [id_producto], [operacion], [cantidad], [fecha]) VALUES (3, 1, 2, N'ingreso                                           ', 25, CAST(N'2022-05-06' AS Date))
INSERT [dbo].[registro] ([id], [id_usuario], [id_producto], [operacion], [cantidad], [fecha]) VALUES (4, 2, 3, N'ingreso                                           ', 50, CAST(N'2022-05-06' AS Date))
INSERT [dbo].[registro] ([id], [id_usuario], [id_producto], [operacion], [cantidad], [fecha]) VALUES (5, 2, 4, N'ingreso                                           ', 30, CAST(N'2022-06-25' AS Date))
INSERT [dbo].[registro] ([id], [id_usuario], [id_producto], [operacion], [cantidad], [fecha]) VALUES (6, 4, 5, N'Creación Producto                                 ', 0, CAST(N'2022-06-29' AS Date))
INSERT [dbo].[registro] ([id], [id_usuario], [id_producto], [operacion], [cantidad], [fecha]) VALUES (7, 4, 6, N'Creación Producto                                 ', 0, CAST(N'2022-06-29' AS Date))
INSERT [dbo].[registro] ([id], [id_usuario], [id_producto], [operacion], [cantidad], [fecha]) VALUES (11, 4, 5, N'Ingreso                                           ', 10, CAST(N'2022-04-07' AS Date))
INSERT [dbo].[registro] ([id], [id_usuario], [id_producto], [operacion], [cantidad], [fecha]) VALUES (12, 4, 6, N'Ingreso                                           ', 30, CAST(N'2022-07-04' AS Date))
INSERT [dbo].[registro] ([id], [id_usuario], [id_producto], [operacion], [cantidad], [fecha]) VALUES (13, 4, 5, N'Ingreso                                           ', 30, CAST(N'2022-07-04' AS Date))
INSERT [dbo].[registro] ([id], [id_usuario], [id_producto], [operacion], [cantidad], [fecha]) VALUES (14, 4, 2, N'Ingreso                                           ', 15, CAST(N'2022-07-05' AS Date))
INSERT [dbo].[registro] ([id], [id_usuario], [id_producto], [operacion], [cantidad], [fecha]) VALUES (15, 4, 0, N'Creación Producto                                 ', 0, CAST(N'2022-07-05' AS Date))
INSERT [dbo].[registro] ([id], [id_usuario], [id_producto], [operacion], [cantidad], [fecha]) VALUES (16, 4, 0, N'Ingreso                                           ', 1, CAST(N'2022-07-05' AS Date))
INSERT [dbo].[registro] ([id], [id_usuario], [id_producto], [operacion], [cantidad], [fecha]) VALUES (18, 1, 0, N'Ingreso                                           ', 9, CAST(N'2022-07-06' AS Date))
INSERT [dbo].[registro] ([id], [id_usuario], [id_producto], [operacion], [cantidad], [fecha]) VALUES (20, 4, 0, N'Creación Producto                                 ', 0, CAST(N'2022-07-08' AS Date))
INSERT [dbo].[registro] ([id], [id_usuario], [id_producto], [operacion], [cantidad], [fecha]) VALUES (21, 4, 0, N'Ingreso                                           ', 431, CAST(N'2022-07-08' AS Date))
INSERT [dbo].[registro] ([id], [id_usuario], [id_producto], [operacion], [cantidad], [fecha]) VALUES (22, 1, 0, N'Creación Producto                                 ', 0, CAST(N'2022-07-08' AS Date))
INSERT [dbo].[registro] ([id], [id_usuario], [id_producto], [operacion], [cantidad], [fecha]) VALUES (23, 1, 0, N'Ingreso                                           ', 20, CAST(N'2022-07-08' AS Date))
INSERT [dbo].[registro] ([id], [id_usuario], [id_producto], [operacion], [cantidad], [fecha]) VALUES (24, 1, 0, N'Creación Producto                                 ', 0, CAST(N'2022-07-08' AS Date))
INSERT [dbo].[registro] ([id], [id_usuario], [id_producto], [operacion], [cantidad], [fecha]) VALUES (25, 1, 0, N'Ingreso                                           ', 100, CAST(N'2022-07-08' AS Date))
INSERT [dbo].[registro] ([id], [id_usuario], [id_producto], [operacion], [cantidad], [fecha]) VALUES (26, 1, 1, N'Retiro Stock                                      ', 10, CAST(N'2022-10-10' AS Date))
INSERT [dbo].[registro] ([id], [id_usuario], [id_producto], [operacion], [cantidad], [fecha]) VALUES (27, 1, 1, N'Retiro Stock                                      ', 10, CAST(N'2022-10-10' AS Date))
INSERT [dbo].[registro] ([id], [id_usuario], [id_producto], [operacion], [cantidad], [fecha]) VALUES (29, 4, 1, N'Retiro Stock                                      ', 80, CAST(N'2022-07-19' AS Date))
INSERT [dbo].[registro] ([id], [id_usuario], [id_producto], [operacion], [cantidad], [fecha]) VALUES (30, 4, 3, N'Retiro Stock                                      ', 10, CAST(N'2022-07-19' AS Date))
INSERT [dbo].[registro] ([id], [id_usuario], [id_producto], [operacion], [cantidad], [fecha]) VALUES (31, 1, 5, N'Retiro Stock                                      ', 10, CAST(N'2022-07-19' AS Date))
INSERT [dbo].[registro] ([id], [id_usuario], [id_producto], [operacion], [cantidad], [fecha]) VALUES (32, 1, 2, N'Ingreso                                           ', 20, CAST(N'2022-07-19' AS Date))
INSERT [dbo].[registro] ([id], [id_usuario], [id_producto], [operacion], [cantidad], [fecha]) VALUES (33, 1, 2, N'Retiro Stock                                      ', 10, CAST(N'2022-07-19' AS Date))
SET IDENTITY_INSERT [dbo].[registro] OFF
GO
SET IDENTITY_INSERT [dbo].[tipoUsuario] ON 

INSERT [dbo].[tipoUsuario] ([id], [tipo]) VALUES (1, N'Administrador                                     ')
INSERT [dbo].[tipoUsuario] ([id], [tipo]) VALUES (2, N'Empleado                                          ')
INSERT [dbo].[tipoUsuario] ([id], [tipo]) VALUES (3, N'Consultor                                         ')
SET IDENTITY_INSERT [dbo].[tipoUsuario] OFF
GO
SET IDENTITY_INSERT [dbo].[Usuario] ON 

INSERT [dbo].[Usuario] ([id], [nombre], [contrasena], [id_tipo], [id_pregunta], [respuesta]) VALUES (0, N'Usuario Eliminado', N'contrasena', 3, 1, N'respuesta')
INSERT [dbo].[Usuario] ([id], [nombre], [contrasena], [id_tipo], [id_pregunta], [respuesta]) VALUES (1, N'Admin', N'admin', 1, 1, N'admin')
INSERT [dbo].[Usuario] ([id], [nombre], [contrasena], [id_tipo], [id_pregunta], [respuesta]) VALUES (2, N'Pedro', N'pedrito', 2, 2, N'after')
INSERT [dbo].[Usuario] ([id], [nombre], [contrasena], [id_tipo], [id_pregunta], [respuesta]) VALUES (3, N'Odin', N'loki', 3, 3, N'chiclayo')
INSERT [dbo].[Usuario] ([id], [nombre], [contrasena], [id_tipo], [id_pregunta], [respuesta]) VALUES (4, N'Manuel', N'manu', 1, 4, N'Darth Vader')
SET IDENTITY_INSERT [dbo].[Usuario] OFF
GO
ALTER TABLE [dbo].[almacen]  WITH CHECK ADD FOREIGN KEY([id_producto])
REFERENCES [dbo].[Producto] ([id])
GO
ALTER TABLE [dbo].[registro]  WITH CHECK ADD FOREIGN KEY([id_producto])
REFERENCES [dbo].[Producto] ([id])
GO
ALTER TABLE [dbo].[registro]  WITH CHECK ADD FOREIGN KEY([id_usuario])
REFERENCES [dbo].[Usuario] ([id])
GO
ALTER TABLE [dbo].[Usuario]  WITH CHECK ADD FOREIGN KEY([id_tipo])
REFERENCES [dbo].[tipoUsuario] ([id])
GO
ALTER TABLE [dbo].[Usuario]  WITH CHECK ADD  CONSTRAINT [FK_usuario_pregunta] FOREIGN KEY([id_pregunta])
REFERENCES [dbo].[pregunta] ([id])
GO
ALTER TABLE [dbo].[Usuario] CHECK CONSTRAINT [FK_usuario_pregunta]
GO
/****** Object:  StoredProcedure [dbo].[CrearUsuario]    Script Date: 19/7/2022 20:26:42 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
create procedure [dbo].[CrearUsuario](
	@nombre varchar(50),
	@contrasena varchar(50),
	@tipo varchar(50),
	@pregunta varchar(50),
	@respuesta varchar(50)
) as
begin
	declare @idTipo int;
	declare @idPregunta int;

	set @idTipo = (select id from tipoUsuario where @tipo=tipo);
	set @idPregunta = (select id from pregunta where @pregunta=pregunta)

	insert into usuario(nombre,contrasena,id_tipo,id_pregunta,respuesta) 
	values(@nombre,@contrasena,@idTipo,@idPregunta,@respuesta)
end;
GO
/****** Object:  StoredProcedure [dbo].[EliminarProducto]    Script Date: 19/7/2022 20:26:42 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
Create procedure [dbo].[EliminarProducto](
	@idProducto int
) as
begin
	update registro set id_producto = 0 where id_producto = @idProducto;
	delete from almacen where id_producto = @idProducto;
	delete from Producto where id = @idProducto;
end;
GO
/****** Object:  StoredProcedure [dbo].[EliminarUsuario]    Script Date: 19/7/2022 20:26:42 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
create procedure [dbo].[EliminarUsuario](
	@idUsuario int
) as
begin

	update registro set id_usuario = 0 where id_usuario=@idUsuario;
	delete from Usuario where id=@idUsuario;
end;
GO
/****** Object:  StoredProcedure [dbo].[IngresarStock]    Script Date: 19/7/2022 20:26:42 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
create procedure [dbo].[IngresarStock](
	@idUsuario int,
	@nombreProducto varchar(20),
	@cantidad int,
	@fechaCaducidad date,
	@fechaActual date
)as 
begin
	declare @idProducto int;
	set @idProducto = (select id from producto where nombre = @nombreProducto);
	
	insert into almacen(id_producto,cantidad,fecha_Caducidad)
		values (@idProducto,@cantidad,@fechaCaducidad);

	insert into registro(id_usuario,id_producto,operacion,cantidad,fecha)
		values (@idUsuario,@idProducto,'Ingreso',@cantidad,@fechaActual);

end;
GO
/****** Object:  StoredProcedure [dbo].[RegistrarProducto]    Script Date: 19/7/2022 20:26:42 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
create procedure [dbo].[RegistrarProducto](
	@idUsuario int,
	@nombre varchar(50),
	@descripcion varchar(200),
	@precio float,
	@cantidad int,
	@fecha_actual date
) as 
begin
	insert into Producto(nombre,descripcion,precio) values(@nombre,@descripcion,@precio);
	declare @id_producto int;
	set @id_producto = (select max(id) from Producto);
	insert into registro(id_usuario,id_producto,operacion,cantidad,fecha) values(@idUsuario,@id_producto,'Creación Producto',@cantidad,@fecha_actual);
end;
GO
/****** Object:  StoredProcedure [dbo].[RetirarStock]    Script Date: 19/7/2022 20:26:42 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE [dbo].[RetirarStock](
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
GO
