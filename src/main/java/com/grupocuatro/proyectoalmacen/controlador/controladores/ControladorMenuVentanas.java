/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupocuatro.proyectoalmacen.controlador.controladores;
import com.grupocuatro.proyectoalmacen.modelo.funcionalidades.*;
import com.grupocuatro.proyectoalmacen.modelo.producto.Producto;
import com.grupocuatro.proyectoalmacen.vista.ventanas.*;

/**
 *
 * @author manue
 */
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

    public ControladorMenuVentanas() {
        this.controladorIngresar = new ControladorIngresarStock(modeloIngresar,ventanaIngresar);
        this.controladorRegistrar = new ControladorRegistroProducto(modeloRegistrar,ventanaRegistrar);
        this.controladorRetirar = new ControladorRetirarStock(modeloRetirar,ventanaRetirar);
    }
    
    

}
