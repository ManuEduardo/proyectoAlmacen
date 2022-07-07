package com.grupocuatro.proyectoalmacen.controlador.controladores;
import com.grupocuatro.proyectoalmacen.vista.ventanas.crudUsuario.CrearUsuario;
import com.grupocuatro.proyectoalmacen.modelo.usuario.Usuario;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorCrearUsuario implements ActionListener {
    private final CrearUsuario ventanaCrearUsuario;
    private final Usuario modeloUsuario;

    public ControladorCrearUsuario(Usuario usuario, CrearUsuario ventanaCrearUsuario) {
        this.modeloUsuario = usuario;
        this.ventanaCrearUsuario = ventanaCrearUsuario;
    }

    public void iniciarVentanaCrear(){
        ventanaCrearUsuario.setVisible(true);
        ventanaCrearUsuario.setTitle("Crear Usuario");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}
