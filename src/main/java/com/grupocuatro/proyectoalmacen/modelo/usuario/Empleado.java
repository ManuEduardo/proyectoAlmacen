/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupocuatro.proyectoalmacen.modelo.usuario;

/**
 *
 * @author manue
 */
public class Empleado extends Consultor{
    
    public Empleado(String usuario, String contrasena) {
        super(usuario, contrasena);
        this.tipoUsuario = "empleado";
        this.PermisoRetirarStock = true;
        this.PermisoIngresarStock = true;
    }
    
}
