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
    
    public final Producto productoRegistrado;

    public Registrar(Producto productoRegistrado) {
        this.productoRegistrado = productoRegistrado;
    }
    
    public Date getFecha() {
        return fecha;
    }

    public String getFechaHoy() {
        return fechaHoy;
    }
    
    public void establecerDatos(String nombre,String descripcion,float precio,int cantidad){
        productoRegistrado.setNombreProducto(nombre);
        productoRegistrado.setDescripcionProducto(descripcion);
        productoRegistrado.setPrecioProducto(precio);
        productoRegistrado.setCantidadProducto(cantidad);
    }
}
