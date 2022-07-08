/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupocuatro.proyectoalmacen.controlador.controladores;

import com.grupocuatro.proyectoalmacen.vista.ventanas.crudUsuario.RecuperarContrasena;
import com.grupocuatro.proyectoalmacen.modelo.usuario.Usuario;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author manue
 */
public abstract class ControladorRecuperarContrasena {
    public final RecuperarContrasena ventanaRecuperarContrasena;
    private final Usuario modeloUsuario;

    public ControladorRecuperarContrasena(RecuperarContrasena ventanaRecuperarContrasena, Usuario modeloUsuario) {
        this.ventanaRecuperarContrasena = ventanaRecuperarContrasena;
        this.modeloUsuario = modeloUsuario;
        this.ventanaRecuperarContrasena.mostrarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                //funcionalidad del boton
                    //falta condicional para salir 
                salir();
            }});
    }
    
    public void IniciarVentanaRecuperar(){
        ventanaRecuperarContrasena.setVisible(true);
        ventanaRecuperarContrasena.setTitle("Recuperar Contraseña");
    }
    
    public abstract void salir();
}
