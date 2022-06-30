/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupocuatro.proyectoalmacen.modelo.funcionalidades;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.grupocuatro.proyectoalmacen.modelo.producto.Producto;
/**
 *
 * @author manue
 */
public class Registrar {
    protected Date fecha = new Date();
    protected SimpleDateFormat fechaFormato = new SimpleDateFormat("dd/MM/YYYY");
    protected String fechaHoy = fechaFormato.format(fecha);
    
    private java.sql.Date sqlFecha = new java.sql.Date(fecha.getTime());
    
    public final Producto productoRegistrado;

    public Registrar(Producto productoRegistrado) {
        this.productoRegistrado = productoRegistrado;
    }

    public java.sql.Date getSqlFecha() {
        return sqlFecha;
    }
    
    public Date getFecha() {
        return fecha;
    }

    public String getFechaHoy() {
        return fechaHoy;
    }
    
    public void establecerDatos(String nombre,String descripcion,float precio){
        productoRegistrado.setNombreProducto(nombre);
        productoRegistrado.setDescripcionProducto(descripcion);
        productoRegistrado.setPrecioProducto(precio);
    }
}
