/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupocuatro.proyectoalmacen.modelo.usuario;

/**
 *
 * @author manue
 */
public class Consultor {
    protected String usuario;
    protected String contrasena;
    protected String tipoUsuario;
    
    protected boolean PermisoVerRegistros = true;
    
    protected boolean PermisoIngresarStock = false;
    protected boolean PermisoRetirarStock = false;
    
    protected boolean PermisoRegistrarProducto = false;
    protected boolean PermisoCrearUsuario = false;

    public Consultor(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.tipoUsuario = "consultor";
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public String getUsuario() {
        return usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public boolean getPermisoVerRegistros() {
        return PermisoVerRegistros;
    }

    public boolean getPermisoIngresarStock() {
        return PermisoIngresarStock;
    }

    public boolean getPermisoRetirarStock() {
        return PermisoRetirarStock;
    }

    public boolean getPermisoRegistrarProducto() {
        return PermisoRegistrarProducto;
    }

    public boolean getPermisoCrearUsuario() {
        return PermisoCrearUsuario;
    }
    
}
