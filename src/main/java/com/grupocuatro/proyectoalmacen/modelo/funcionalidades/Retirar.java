/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupocuatro.proyectoalmacen.modelo.funcionalidades;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/**
 *
 * @author manue
 */
public class Retirar {
    protected Date fecha = new Date();
    protected SimpleDateFormat fechaFormato = new SimpleDateFormat("dd/MM/YYYY");
    protected String fechaHoy = fechaFormato.format(fecha);
        private java.sql.Date sqlFecha = new java.sql.Date(fecha.getTime());
    
    protected String productoRetirado;
    protected int cantidad;

    public java.sql.Date getSqlFecha() {
        return sqlFecha;
    }

    public void setSqlFecha(java.sql.Date sqlFecha) {
        this.sqlFecha = sqlFecha;
    }
    
    public Date getFecha() {
        return fecha;
    }

    public String getFechaHoy() {
        return fechaHoy;
    }

    public String getProductoRetirado() {
        return productoRetirado;
    }

    public void setProductoRetirado(String productoRetirado) {
        this.productoRetirado = productoRetirado;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public void establecerDatos(String producto, int cantidad){
        setProductoRetirado(producto);
        setCantidad(cantidad);
    }
}
