/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.grupocuatro.proyectoalmacen;

import com.grupocuatro.proyectoalmacen.modelo.funcionalidades.Ingresar;
import com.grupocuatro.proyectoalmacen.vista.ventanas.IngresarStock;
import com.grupocuatro.proyectoalmacen.controlador.controladores.ControladorIngresarStock;

import com.grupocuatro.proyectoalmacen.modelo.funcionalidades.Retirar;
import com.grupocuatro.proyectoalmacen.vista.ventanas.RetirarStock;
import com.grupocuatro.proyectoalmacen.controlador.controladores.ControladorRetirarStock;


import com.grupocuatro.proyectoalmacen.modelo.producto.Producto;
import com.grupocuatro.proyectoalmacen.modelo.funcionalidades.Registrar;
import com.grupocuatro.proyectoalmacen.vista.ventanas.RegistrarProducto;
import com.grupocuatro.proyectoalmacen.controlador.controladores.ControladorRegistroProducto;

import com.grupocuatro.proyectoalmacen.vista.ventanas.RegistroIngresoSalida;
import com.grupocuatro.proyectoalmacen.controlador.controladores.ControrladorRegistroIngresoSalida;

import com.grupocuatro.proyectoalmacen.vista.ventanas.crudUsuario.VerUsuarios;
import com.grupocuatro.proyectoalmacen.controlador.controladores.ControladorVerUsuarios;

import com.grupocuatro.proyectoalmacen.controlador.LogicaModeloVista;
public class ProyectoAlmacen {

    public static void main(String[] args) {
        System.out.println("Testeo de clases y metodos");
        //Para testear
        //----------------------------------------------------------------------------------------

        //----------------------------------------------------------------------------------------
        
        IngresarStock ventanatest2 = new IngresarStock();
        Ingresar ingresarTest = new Ingresar();
        ControladorIngresarStock test2 = new ControladorIngresarStock(ingresarTest,ventanatest2);
        //test2.iniciarVentanaIngresar();
        //----------------------------------------------------------------------------------------
        RetirarStock ventanatest3 = new RetirarStock();
        Retirar retirarTest = new Retirar ();
        ControladorRetirarStock test3 = new ControladorRetirarStock(retirarTest,ventanatest3);
        //test3.iniciarVentanaRetirar();
        //----------------------------------------------------------------------------------------
        Producto productoPrueba = new Producto();
        Registrar registroPrueba = new Registrar(productoPrueba);
        RegistrarProducto ventanaRegistro = new RegistrarProducto();
        ControladorRegistroProducto  test4 = new ControladorRegistroProducto(registroPrueba,ventanaRegistro);
        //test4.iniciarVentanaRegistrar();
        //----------------------------------------------------------------------------------------
        RegistroIngresoSalida ventanaRegistros = new RegistroIngresoSalida();
        ControrladorRegistroIngresoSalida controladorRegistros = new ControrladorRegistroIngresoSalida(ventanaRegistros);
        //controladorRegistros.iniciarVentanasRegistros();
        //----------------------------------------------------------------------------------------------------------------
        VerUsuarios ventanaVerUusarios = new VerUsuarios();
        ControladorVerUsuarios test5 = new ControladorVerUsuarios(ventanaVerUusarios);
        //test5.iniciarVentanaVerUsuarios();
        //----------------------------------------------------------------------------------------------------------------
        LogicaModeloVista testuwu = new LogicaModeloVista();
        testuwu.app();

    }
}