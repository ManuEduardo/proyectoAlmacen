/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.grupocuatro.proyectoalmacen;
import com.grupocuatro.proyectoalmacen.controlador.ControladorLogin;
import com.grupocuatro.proyectoalmacen.vista.VentanaLogin;
import com.grupocuatro.proyectoalmacen.modelo.funcionalidades.Login;

import com.grupocuatro.proyectoalmacen.modelo.funcionalidades.Ingresar;
import com.grupocuatro.proyectoalmacen.vista.ventanas.IngresarStock;
import com.grupocuatro.proyectoalmacen.controlador.ControladorIngresarStock;

import com.grupocuatro.proyectoalmacen.modelo.funcionalidades.Retirar;
import com.grupocuatro.proyectoalmacen.vista.ventanas.RetirarStock;
import com.grupocuatro.proyectoalmacen.controlador.ControladorRetirarStock;


import com.grupocuatro.proyectoalmacen.modelo.producto.Producto;
import com.grupocuatro.proyectoalmacen.modelo.funcionalidades.Registrar;
import com.grupocuatro.proyectoalmacen.vista.ventanas.RegistroProducto;
import com.grupocuatro.proyectoalmacen.controlador.ControladorRegistroProducto;

import com.grupocuatro.proyectoalmacen.controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class ProyectoAlmacen {

    public static void main(String[] args) {
        System.out.println("Testeo de clases y metodos");
        //Para testear
        //----------------------------------------------------------------------------------------
        VentanaLogin ventanaTest = new VentanaLogin();
        Login loginTest = new Login();
        ControladorLogin test = new ControladorLogin(loginTest,ventanaTest);
        test.IniciarVentanaLogin();
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
        RegistroProducto ventanaRegistro = new RegistroProducto();
        ControladorRegistroProducto  test4 = new ControladorRegistroProducto(ventanaRegistro,registroPrueba);
        //test4.iniciarVentanaRegistrar();
        //----------------------------------------------------------------------------------------
        Conexion testConexion = new Conexion(); //objeto para conectarse
        Connection acceso;
        PreparedStatement preState;
        ResultSet resultado;
        String sql = "Select * from Producto";//consulta sql
        try{
            acceso = testConexion.Conectar();//se conecta
            preState = acceso.prepareStatement(sql);//la coneccion se le carga la consulta
            resultado = preState.executeQuery();//a la consulta cargada se ejecuta y accedes a la tabla del resultado, todo esto en la base
            while(resultado.next()){//se itera en la tabla del resultado se cuenta desde 1
                System.out.println("-----------------------");
                System.out.println(resultado.getInt(1));
                System.out.println(resultado.getString(2));
                System.out.println(resultado.getString(3));
                System.out.println(resultado.getFloat(4));
                System.out.println(resultado.getInt(5));
            }
        }catch(Exception e){
            System.out.println("error: "+e);
        }
        
    }
}