/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupocuatro.proyectoalmacen.controlador.controladores;
import com.grupocuatro.proyectoalmacen.controlador.Conexion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.grupocuatro.proyectoalmacen.vista.ventanas.RetirarStock;
import com.grupocuatro.proyectoalmacen.modelo.funcionalidades.Retirar;
import com.grupocuatro.proyectoalmacen.modelo.producto.Producto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author manue
 */
public class ControladorRetirarStock implements ActionListener, CRUD{
    private final RetirarStock ventanaRetirar;
    private final Retirar modeloRetirar;
    
    private final Conexion conexionMenu = new Conexion();
    private Connection acceso;
    private PreparedStatement preState;
    private ResultSet resultado;

    public ControladorRetirarStock(Retirar modeloRetirar, RetirarStock ventanaRetirar) {
        this.ventanaRetirar = ventanaRetirar;
        this.modeloRetirar = modeloRetirar;
        this.ventanaRetirar.retirarButton.addActionListener(this);
        listarProductosComboBox();
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

    public final void listarProductosComboBox(){
        List<Producto> listaProduc = listar();
        for (int i = 0; i < listaProduc.size(); i++) {
            ventanaRetirar.productosCombo.addItem(listaProduc.get(i).getNombreProducto());
        }
    }
    
    @Override
    public List listar() {
        List<Producto> listaProductos = new ArrayList<>();
        String sql = "SELECT * FROM PRODUCTO where id > 0";
        try{
            acceso = conexionMenu.Conectar();
            preState = acceso.prepareStatement(sql);
            resultado = preState.executeQuery();
            while(resultado.next()){
                Producto produc = new Producto();
                produc.setIdProducto(resultado.getInt(1));
                produc.setNombreProducto(resultado.getString(2));
                produc.setDescripcionProducto(resultado.getString(3));
                produc.setPrecioProducto(resultado.getFloat(4));
                listaProductos.add(produc);
            }
        } catch(SQLException e){
            System.out.println("Error :"+e);
        }
        return listaProductos;
    }
    
    @Override
    public void crear() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
