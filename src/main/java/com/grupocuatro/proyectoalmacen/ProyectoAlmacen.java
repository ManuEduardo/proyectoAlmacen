/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.grupocuatro.proyectoalmacen;
import com.grupocuatro.proyectoalmacen.controlador.ControladorLogin;
import com.grupocuatro.proyectoalmacen.vista.VentanaLogin;
import com.grupocuatro.proyectoalmacen.modelo.funcionalidades.Login;

import com.grupocuatro.proyectoalmacen.modelo.funcionalidades.Ingresar;
import com.grupocuatro.proyectoalmacen.vista.ventanas.IngresarProducto;
import com.grupocuatro.proyectoalmacen.controlador.ControladorIngresar;
public class ProyectoAlmacen {

    public static void main(String[] args) {
        System.out.println("Testeo de clases y metodos");
        //Para testear
        VentanaLogin ventanaTest = new VentanaLogin();
        Login loginTest = new Login();
        ControladorLogin test = new ControladorLogin(loginTest,ventanaTest);
        //test.IniciarVentanaLogin();
        IngresarProducto ventanatest2 = new IngresarProducto();
        Ingresar ingresarTest = new Ingresar();
        ControladorIngresar test2 = new ControladorIngresar(ingresarTest,ventanatest2);
        test2.iniciarVentanaIngresar();
    }
}
