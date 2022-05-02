/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupocuatro.proyectoalmacen.modelo.funcionalidades;
import com.grupocuatro.proyectoalmacen.vista.ventanas.IngresarProducto;
import  java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author manue
 */
public class Ingresar {
    protected Date fecha = new Date();
    protected SimpleDateFormat fechaFormato = new SimpleDateFormat("dd/MM/YYYY");
    protected String fechaHoy = fechaFormato.format(fecha);
    
    protected String nombreIngresado;
    protected int cantidad;

    public Date getFecha() {
        return fecha;
    }

    public String getFechaHoy() {
        return fechaHoy;
    }

    public void setFechaHoy(String fechaHoy) {
        this.fechaHoy = fechaHoy;
    }

    public String getNombreIngresado() {
        return nombreIngresado;
    }

    public void setNombreIngresado(String nombreIngresado) {
        this.nombreIngresado = nombreIngresado;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    //SE OBTENDRIAN LOS DATOS INGRESADOS DE LA VENTANA INGRESAR 
    public void ventana(){
        IngresarProducto ventanaIngresarProducto = new IngresarProducto();
        ventanaIngresarProducto.setVisible(true);
    }
    public void datodButton(){
        
    }
}
