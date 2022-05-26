/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupocuatro.proyectoalmacen.controlador.controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.grupocuatro.proyectoalmacen.modelo.funcionalidades.Ingresar;
import com.grupocuatro.proyectoalmacen.vista.ventanas.IngresarStock;

/**
 *
 * @author manue
 */
public class ControladorIngresarStock implements ActionListener{
    private final Ingresar modeloIngresar;
    private final IngresarStock ventanaIngresar;

    public ControladorIngresarStock(Ingresar ingresar, IngresarStock ventanaIngresar) {
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
        javax.swing.JOptionPane.showMessageDialog(ventanaIngresar,"Ingreso de datos: \n Nombre: "+modeloIngresar.getProductoIngresado()+"\ncantidad: "+modeloIngresar.getCantidad()+"\nfecha actual"+modeloIngresar.getFechaHoy()+"\nfecha Caducidad"+modeloIngresar.getFechaCaducidad());
    }
    
}
