/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupocuatro.proyectoalmacen.modelo.funcionalidades;
import  java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author manue
 */
public class Ingresar {
    //SE CREAN OBJETOS PARA EL USO DE FECHAS
    protected Date fecha = new Date();
    protected SimpleDateFormat fechaFormato = new SimpleDateFormat("dd/MM/YYYY");
    protected String fechaHoy = fechaFormato.format(fecha);
 
    //ATRIBUTOS BASE DE LA CLASE INGRESAS MAS SETS Y GETS
    protected String productoIngresado;
    protected int cantidad;
    protected String fechaCaducidad;

    public Date getFecha() {
        return fecha;
    }

    public String getFechaHoy() {
        return fechaHoy;
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

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(int dia,int mes,int anio) {
        this.fechaCaducidad = dia + "/" + mes + "/" + anio;
    }
    public void establecerDatos(String nombre,int cantidad){
        setProductoIngresado(nombre);
        setCantidad(cantidad);
    }
}
