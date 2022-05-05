/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupocuatro.proyectoalmacen.modelo.usuario;

/**
 *
 * @author manue
 */
public class Administrador extends Empleado{

    public Administrador(String usuario, String contrasena) {
        super(usuario, contrasena);
        this.PermisoCrearUsuario = true;
        this.PermisoRegistrarProducto = true;
        this.tipoUsuario = "administrador";
    }
    
    
    
}
