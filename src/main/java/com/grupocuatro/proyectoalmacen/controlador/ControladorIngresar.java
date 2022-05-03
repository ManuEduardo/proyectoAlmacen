/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupocuatro.proyectoalmacen.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.grupocuatro.proyectoalmacen.modelo.funcionalidades.Ingresar;
import com.grupocuatro.proyectoalmacen.vista.ventanas.IngresarProducto;

/**
 *
 * @author manue
 */
public class ControladorIngresar implements ActionListener{
    private Ingresar modeloIngresar;
    private final IngresarProducto ventanaIngresar;

    public ControladorIngresar(Ingresar ingresar, IngresarProducto ventanaIngresar) {
        this.modeloIngresar = ingresar;
        this.ventanaIngresar = ventanaIngresar;
        this.ventanaIngresar.ingresarButton.addActionListener(this);
        
    }
    public void iniciarVentanaIngresar(){
        ventanaIngresar.setTitle("Ingresar Producto");
        ventanaIngresar.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        modeloIngresar.establecerDatos((String)ventanaIngresar.productosCombo.getSelectedItem(), (int)ventanaIngresar.cantidadSpinner.getValue());
        modeloIngresar.setFechaCaducidad((int)ventanaIngresar.diaSpinner.getValue(), (int)ventanaIngresar.mesSpinner.getValue(), (int)ventanaIngresar.anioSpinner.getValue());
        javax.swing.JOptionPane.showMessageDialog(ventanaIngresar,"Ingreso de datos: \n Nombre: "+modeloIngresar.getNombreIngresado()+"\ncantidad: "+modeloIngresar.getCantidad()+"\nfecha actual"+modeloIngresar.getFechaHoy()+"\nfecha Caducidad"+modeloIngresar.getFechaCaducidad());
    }
    
}
