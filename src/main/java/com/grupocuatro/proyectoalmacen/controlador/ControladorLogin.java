/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupocuatro.proyectoalmacen.controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.grupocuatro.proyectoalmacen.modelo.funcionalidades.Login;
import com.grupocuatro.proyectoalmacen.vista.VentanaLogin;
/**
 *
 * @author manue
 */
public class ControladorLogin implements ActionListener{
    private Login modeloLogin;
    private final VentanaLogin ventanaLogin;

    public ControladorLogin(Login modeloLogin, VentanaLogin ventanaLogin) {
        this.modeloLogin = modeloLogin;
        this.ventanaLogin = ventanaLogin;
        this.ventanaLogin.entrarBoton.addActionListener(this);
    }
    
    public void IniciarVentanaLogin(){
        ventanaLogin.setVisible(true);
        ventanaLogin.setTitle("Ventana Login");
    }
    
    public void actionPerformed(ActionEvent e){
        modeloLogin.establecerDatos((String)ventanaLogin.usuarioField.getText(), String.valueOf(ventanaLogin.contrasenaField.getPassword()));
        javax.swing.JOptionPane.showMessageDialog(ventanaLogin,"Ingreso de datos: \n Usuario: "+modeloLogin.getUsuario()+"\nContraseña: "+modeloLogin.getContrasena());
    }
}
