/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupocuatro.proyectoalmacen.controlador.controladores;
import com.grupocuatro.proyectoalmacen.modelo.funcionalidades.*;
import com.grupocuatro.proyectoalmacen.modelo.producto.Producto;
import com.grupocuatro.proyectoalmacen.vista.ventanas.*;
import com.grupocuatro.proyectoalmacen.vista.ventanas.crudUsuario.VerUsuarios;

/**
 *
 * @author manue
 */
//ESTA CLASE SOLO ES PARA FACILITAR EL USO DE LOS BOTONES
public class ControladorMenuVentanas {

 
    //faltar agregar mas ventanas
    private Ingresar modeloIngresar = new Ingresar();
    private IngresarStock ventanaIngresar = new IngresarStock();
    public ControladorIngresarStock controladorIngresar;
    
    private Retirar modeloRetirar = new Retirar ();
    private RetirarStock ventanaRetirar = new RetirarStock();
    public ControladorRetirarStock controladorRetirar;
    
    private Producto producto = new Producto();
    private Registrar modeloRegistrar = new Registrar(producto);
    private RegistrarProducto ventanaRegistrar = new RegistrarProducto();
    public ControladorRegistroProducto  controladorRegistrar;
    
    private Registros ventanaRegistros = new Registros();
    public ControrladorRegistroIngresoSalida controladorRegistros;
    
    private VerUsuarios ventanaUsuarios = new VerUsuarios();
    public ControladorVerUsuarios controladorVerUsuarios;
    
    public ControladorVerUsuarios controladorUsuarios;

    public ControladorMenuVentanas() {
        this.controladorIngresar = new ControladorIngresarStock(modeloIngresar,ventanaIngresar);
        this.controladorRegistrar = new ControladorRegistroProducto(modeloRegistrar,ventanaRegistrar);
        this.controladorRetirar = new ControladorRetirarStock(modeloRetirar,ventanaRetirar);
        this.controladorRegistros = new ControrladorRegistroIngresoSalida(ventanaRegistros);
        this.controladorUsuarios = new ControladorVerUsuarios(ventanaUsuarios);
    }
    
    

}
