/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupocuatro.proyectoalmacen.controlador.controladores;
import com.grupocuatro.proyectoalmacen.vista.ventanas.crudUsuario.VerUsuarios;

/**
 *
 * @author manue
 */
public class ControladorVerUsuarios {
    private VerUsuarios ventanaUsuarios;

    public ControladorVerUsuarios(VerUsuarios ventanaUsuarios) {
        this.ventanaUsuarios = ventanaUsuarios;
    }
    
    
    public void iniciarVentanaVerUsuarios(){
        ventanaUsuarios.setVisible(true);
        ventanaUsuarios.setTitle("Registros de Actividad Almacen");
    }
    
}
