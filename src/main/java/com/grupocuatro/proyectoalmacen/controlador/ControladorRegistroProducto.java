/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupocuatro.proyectoalmacen.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.grupocuatro.proyectoalmacen.vista.ventanas.RegistroProducto;
import com.grupocuatro.proyectoalmacen.modelo.funcionalidades.Registrar;
/**
 *
 * @author manue
 */
public class ControladorRegistroProducto implements ActionListener{
    //al crear el objeto, el constructor de modeloRegistro debe recibir un objeto producto
    private final RegistroProducto ventanaRegistro;
    private final Registrar modeloRegistro;

    public ControladorRegistroProducto(RegistroProducto ventanaRegistro, Registrar modeloRegistro) {
        this.ventanaRegistro = ventanaRegistro;
        this.modeloRegistro = modeloRegistro;
        this.ventanaRegistro.registrabutton.addActionListener(this);
    }
    
    public void iniciarVentanaRegistrar(){
        ventanaRegistro.setVisible(true);
        ventanaRegistro.setTitle("Registrar Producto");
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        modeloRegistro.establecerDatos((String)ventanaRegistro.nombreField.getText(), ventanaRegistro.descripcionTextArea.getText(), (float)ventanaRegistro.precioSpinner.getValue(), (int)ventanaRegistro.cantidadSpinner1.getValue());
        javax.swing.JOptionPane.showMessageDialog(ventanaRegistro,"Registro de datos: \n Nombre: "+modeloRegistro.productoRegistrado.getNombreProducto()+"\ndescripcion: "+ modeloRegistro.productoRegistrado.getDescripcionProducto()+"\nprecio: "+modeloRegistro.productoRegistrado.getPrecioProducto()+"\ncantidad: "+modeloRegistro.productoRegistrado.getCantidadProducto()+"\nfecha actual: "+modeloRegistro.getFechaHoy());
    }
    
}
