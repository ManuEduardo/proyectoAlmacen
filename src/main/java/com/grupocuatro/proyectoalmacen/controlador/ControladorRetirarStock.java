/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupocuatro.proyectoalmacen.controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.grupocuatro.proyectoalmacen.vista.ventanas.RetirarStock;
import com.grupocuatro.proyectoalmacen.modelo.funcionalidades.Retirar;

/**
 *
 * @author manue
 */
public class ControladorRetirarStock implements ActionListener{
    private final RetirarStock ventanaRetirar;
    private final Retirar modeloRetirar;

    public ControladorRetirarStock(Retirar modeloRetirar, RetirarStock ventanaRetirar) {
        this.ventanaRetirar = ventanaRetirar;
        this.modeloRetirar = modeloRetirar;
        this.ventanaRetirar.retirarButton.addActionListener(this);
    }

    public void iniciarVentanaRetirar(){
        ventanaRetirar.setVisible(true);
        ventanaRetirar.setTitle("Retirar Producto");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        modeloRetirar.establecerDatos((String)ventanaRetirar.productosCombo.getSelectedItem(), (int)ventanaRetirar.cantidadSpinner.getValue());
        javax.swing.JOptionPane.showMessageDialog(ventanaRetirar,"Ingreso de datos: \n Producto: "+modeloRetirar.getProductoRetirado()+"\n cantidad: "+modeloRetirar.getCantidad());
    }
    
}
