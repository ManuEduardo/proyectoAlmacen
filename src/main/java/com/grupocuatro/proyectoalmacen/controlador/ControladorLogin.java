/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupocuatro.proyectoalmacen.controlador;
import com.grupocuatro.proyectoalmacen.modelo.funcionalidades.Login;
import com.grupocuatro.proyectoalmacen.vista.VentanaLogin;
/**
 *
 * @author manue
 */
public class ControladorLogin{
    private final Login modeloLogin;
    private final VentanaLogin ventanaLogin;

    public ControladorLogin(Login modeloLogin, VentanaLogin ventanaLogin) {
        this.modeloLogin = modeloLogin;
        this.ventanaLogin = ventanaLogin;
        this.ventanaLogin.entrarBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {entrarBotonMouseClicked(evt);}});
    }
    
    public void IniciarVentanaLogin(){
        ventanaLogin.setVisible(true);
        ventanaLogin.setTitle("Ventana Login");
    }
    
    private void entrarBotonMouseClicked(java.awt.event.MouseEvent evt) {                                         
        modeloLogin.establecerDatos((String)ventanaLogin.usuarioField.getText(), String.valueOf(ventanaLogin.contrasenaField.getPassword()));
        javax.swing.JOptionPane.showMessageDialog(ventanaLogin,"Ingreso de datos: \n Usuario: "+modeloLogin.getUsuario()+"\nContraseña: "+modeloLogin.getContrasena());
    }           
}
