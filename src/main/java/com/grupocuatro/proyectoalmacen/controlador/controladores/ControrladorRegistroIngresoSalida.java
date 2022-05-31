/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupocuatro.proyectoalmacen.controlador.controladores;
import com.grupocuatro.proyectoalmacen.vista.ventanas.RegistroIngresoSalida;

/**
 *
 * @author manue
 */
public class ControrladorRegistroIngresoSalida {
    private RegistroIngresoSalida ventanaRegistros;

    public ControrladorRegistroIngresoSalida(RegistroIngresoSalida ventanaRegistros) {
        this.ventanaRegistros = new RegistroIngresoSalida();
    }
    
    
    
    public void iniciarVentanasRegistros(){
        ventanaRegistros.setVisible(true);
        ventanaRegistros.setTitle("Registros de Actividad Almacen");
    }
}
