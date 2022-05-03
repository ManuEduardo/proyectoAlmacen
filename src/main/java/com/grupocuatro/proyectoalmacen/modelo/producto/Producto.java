/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupocuatro.proyectoalmacen.modelo.producto;

/**
 *
 * @author manue
 */
public class Producto {
    //SE CREA LA CLASE PRODUCTO Y SE INSTANCIAN GETS AND SETS
    private String nombre;
    private String descripcion;
    private int idCodigo;

    public Producto(String nombre, String descripcion, int idCodigo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.idCodigo = idCodigo;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdCodigo() {
        return idCodigo;
    }

    public void setIdCodigo(int idCodigo) {
        this.idCodigo = idCodigo;
    }
    
}
