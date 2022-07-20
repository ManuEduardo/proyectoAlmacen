/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupocuatro.proyectoalmacen.controlador.controladores;
import com.grupocuatro.proyectoalmacen.controlador.Conexion;

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
public class ControladorRetirarStock implements CRUD{
    private final RetirarStock ventanaRetirar;
    private final Retirar modeloRetirar;
    private int idUsuario;
    
    private final Conexion conexionMenu = new Conexion();
    private Connection acceso;
    private PreparedStatement preState;
    private ResultSet resultado;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    public ControladorRetirarStock(Retirar modeloRetirar, RetirarStock ventanaRetirar) {
        this.ventanaRetirar = ventanaRetirar;
        this.modeloRetirar = modeloRetirar;
        listarProductosComboBox();
        this.ventanaRetirar.retirarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonRetirar();
            }
        });
    }

    public void iniciarVentanaRetirar(){
        ventanaRetirar.setVisible(true);
        ventanaRetirar.setTitle("Retirar Producto");
    }


    public void vaciarCampos(){
        ventanaRetirar.cantidadSpinner.setValue(1);
    }
    
    public void botonRetirar(){
        modeloRetirar.establecerDatos((String)ventanaRetirar.productosCombo.getSelectedItem(), (int)ventanaRetirar.cantidadSpinner.getValue());
        if(modeloRetirar.getCantidad()<=0){
            javax.swing.JOptionPane.showMessageDialog(ventanaRetirar,"INGRESE UN VALOR PARA RETIRAR POSITIVO");
            }
        javax.swing.JOptionPane.showMessageDialog(ventanaRetirar,"Ingreso de datos: \n Producto: "+modeloRetirar.getProductoRetirado()+"\n cantidad: "+modeloRetirar.getCantidad());
        retirarStock();
        vaciarCampos();
    }
    
    public void retirarStock(){
        //datos guardados en el modeloRetirar modeloRetirar.getProductoRetirado() modeloRetirar.getCantidad() getIdUsuario()
        String sql = "EXEC RetirarStock ?,?,?,?";
        try{
            acceso = conexionMenu.Conectar();
            preState = acceso.prepareStatement(sql);
            preState.setInt(1,getIdUsuario());
            preState.setString(2,modeloRetirar.getProductoRetirado());
            preState.setInt(3,modeloRetirar.getCantidad());
            preState.setDate(4,modeloRetirar.getSqlFecha());
            resultado = preState.executeQuery();
        } catch(SQLException e){
            System.out.println("Error :"+e);
        }
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
