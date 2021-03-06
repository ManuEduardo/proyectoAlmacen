/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupocuatro.proyectoalmacen.controlador;
import com.grupocuatro.proyectoalmacen.controlador.controladores.ControladorMenuPrincipal;
import com.grupocuatro.proyectoalmacen.controlador.controladores.ControladorLogin;
import com.grupocuatro.proyectoalmacen.vista.VentanaLogin;
import com.grupocuatro.proyectoalmacen.modelo.funcionalidades.Login;

import com.grupocuatro.proyectoalmacen.vista.MenuPrincipal;

/**
 *
 * @author manue
 */
public class LogicaModeloVista {
    MenuPrincipal ventanaPrincipal = new MenuPrincipal();
    ControladorMenuPrincipal controladorMenu = new ControladorMenuPrincipal(ventanaPrincipal) {
        @Override
        public void salirbuttonMouseClicked() {
            login.IniciarVentanaLogin();
            controladorMenu.cerrarVentana();
        }
    };
    
    VentanaLogin ventanaLogin = new VentanaLogin();
    Login modeloLogin = new Login();
    String tipoUsuario;
    String nombreUsuario;
    int idUsuario;


    ControladorLogin login = new ControladorLogin(modeloLogin,ventanaLogin) {
        @Override
        public void funcionalidadButtonLogin() {
            tipoUsuario = login.getTipoUsuario();
            nombreUsuario = login.getNombreUsuario();
            idUsuario = login.getIdUsuario();
            controladorMenu.datosLoggeo(nombreUsuario, tipoUsuario,idUsuario);
            controladorMenu.IniciarVentanaMenu();
            ventanaLogin.setVisible(false);
            ventanaLogin.dispose();
        }};
    
    public void app(){
        login.IniciarVentanaLogin();
    }
    
    
}
