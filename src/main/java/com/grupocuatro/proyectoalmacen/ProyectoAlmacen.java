/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.grupocuatro.proyectoalmacen;

import com.grupocuatro.proyectoalmacen.modelo.usuario.Usuario;
import com.grupocuatro.proyectoalmacen.vista.ventanas.crudUsuario.CrearUsuario;
import com.grupocuatro.proyectoalmacen.controlador.controladores.ControladorCrearUsuario;



import com.grupocuatro.proyectoalmacen.controlador.LogicaModeloVista;
public class ProyectoAlmacen {
    //public static final LogicaModeloVista test = new LogicaModeloVista();
    public static void main(String[] args) {
        //test.app();
        Usuario usuarioUwu = new Usuario();
        CrearUsuario ventanaUwu = new CrearUsuario();
        ControladorCrearUsuario crearuwu = new ControladorCrearUsuario(usuarioUwu,ventanaUwu);
        crearuwu.iniciarVentanaCrear();
            //Proximas funcionalidades
        //-Retirar Stock
        //-Crear Usuarios
        //-Eliminar Producto
        //-Recuperar Contraseña
            //Crear ventanas para recuperar contraseñas
    }
}