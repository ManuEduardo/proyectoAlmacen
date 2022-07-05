/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupocuatro.proyectoalmacen.modelo.funcionalidades;
import java.text.ParseException;
import  java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author manue
 */
public class Ingresar {
    //SE CREAN OBJETOS PARA EL USO DE FECHAS
    protected Date fecha = new Date();
    protected Date dateCaducidad = new Date();
    
    SimpleDateFormat fechaFormato = new SimpleDateFormat("dd/MM/yyyy");
    protected String fechaHoy = fechaFormato.format(fecha);
    //Atributos sql de fecha
    private java.sql.Date sqlFecha = new java.sql.Date(fecha.getTime());
    private java.sql.Date sqlFechaCaducidad;
 
    //ATRIBUTOS BASE DE LA CLASE INGRESAS MAS SETS Y GETS
    protected String productoIngresado;
    protected int cantidad;
    protected String fechaCaducidad;
    
    public String getFechaCaducidad() {
        return fechaCaducidad;
    }
    
    public Date getDateCaducidad() {
        return dateCaducidad;
    }

    public String getFechaHoy() {
        return fechaHoy;
    }
    //atributos sql de fechas
    public java.sql.Date getSqlFecha() {
        return sqlFecha;
    }
    public java.sql.Date getSqlFechaCaducidad() {
        return sqlFechaCaducidad;
    }
    
    public String getProductoIngresado() {
        return productoIngresado;
    }

    public void setProductoIngresado(String productoIngresado) {
        this.productoIngresado = productoIngresado;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setFechaCaducidad(int dia,int mes,int anio){
        this.fechaCaducidad = dia + "/" + mes + "/" + anio;
       //NECESITO PASEAR LA FECHA INGRESADA A SQL
        try {
            dateCaducidad = (Date) fechaFormato.parse(fechaCaducidad);
        } catch (ParseException ex) {
            System.out.println(ex);
        }
        
        sqlFechaCaducidad = new java.sql.Date(dateCaducidad.getTime());
    }
    public void establecerDatos(String nombre,int cantidad){
        setProductoIngresado(nombre);
        setCantidad(cantidad);
    }
}
