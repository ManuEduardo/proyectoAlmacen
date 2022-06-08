/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupocuatro.proyectoalmacen.controlador.controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.grupocuatro.proyectoalmacen.modelo.funcionalidades.Ingresar;
import com.grupocuatro.proyectoalmacen.vista.ventanas.IngresarStock;

import java.util.List;
import com.grupocuatro.proyectoalmacen.controlador.Conexion;
import com.grupocuatro.proyectoalmacen.modelo.producto.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author manue
 */
public class ControladorIngresarStock implements ActionListener, CRUD{
    private final Ingresar modeloIngresar;
    private final IngresarStock ventanaIngresar;
    
    private final Conexion conexionMenu = new Conexion();
    private Connection acceso;
    private PreparedStatement preState;
    private ResultSet resultado;

    public ControladorIngresarStock(Ingresar ingresar, IngresarStock ventanaIngresar) {
        this.modeloIngresar = ingresar;
        this.ventanaIngresar = ventanaIngresar;
        this.ventanaIngresar.ingresarButton.addActionListener(this);
        listarProductosComboBox();
        
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
    
    
    
    public final void listarProductosComboBox(){
        List<Producto> listaProduc = listar();
        for (int i = 0; i < listaProduc.size(); i++) {
            ventanaIngresar.productosCombo.addItem(listaProduc.get(i).getNombreProducto());
        }
    }
    
    @Override
    public List listar() {
        List<Producto> listaProductos = new ArrayList<>();
        String sql = "SELECT * FROM PRODUCTO";
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
    public void eliminar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
