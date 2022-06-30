/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupocuatro.proyectoalmacen.controlador.controladores;

import com.grupocuatro.proyectoalmacen.controlador.Conexion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.grupocuatro.proyectoalmacen.vista.ventanas.RegistrarProducto;
import com.grupocuatro.proyectoalmacen.modelo.funcionalidades.Registrar;

import com.grupocuatro.proyectoalmacen.modelo.producto.Producto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.List;
/**
 *
 * @author manue
 */
public class ControladorRegistroProducto implements ActionListener, CRUD{
    //al crear el objeto, el constructor de modeloRegistro debe recibir un objeto producto
    private final RegistrarProducto ventanaRegistro;
    private final Registrar modeloRegistro;
    
    private int idUsuario;
    private final Conexion conexionLogin = new Conexion();
    private Connection acceso;
    private PreparedStatement preState;
    private ResultSet resultado;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    

    public ControladorRegistroProducto(Registrar modeloRegistro, RegistrarProducto ventanaRegistro) {
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
        modeloRegistro.establecerDatos((String)ventanaRegistro.nombreField.getText(), ventanaRegistro.descripcionTextArea.getText(), (float)ventanaRegistro.precioSpinner.getValue());
        registrarProducto(modeloRegistro.productoRegistrado);
        
    }
    public void registrarProducto(Producto objeto){
        crear();
        ventanaRegistro.setVisible(false);
        javax.swing.JOptionPane.showMessageDialog(ventanaRegistro,"Se a registrado los datos: \n Nombre: "+objeto.getNombreProducto()+"\ndescripcion: "+ objeto.getDescripcionProducto()+"\nprecio: "+objeto.getPrecioProducto()+"\ncantidad: "+objeto.getCantidadProducto()+"\nfecha actual: "+modeloRegistro.getFechaHoy()+"\nId usuario: "+idUsuario);
        ventanaRegistro.dispose();
    }
    
    @Override
    public void crear() {
        // ejemplo de procedimiento almacenado: EXEC RegistrarProducto 4,'Avena','Avena super nutritiva',5.20,0,'29-06-2022'
        String sql = "EXEC RegistrarProducto ?,?,?,?,0,?";
        try{
            acceso = conexionLogin.Conectar();//se conecta
            preState = acceso.prepareStatement(sql);//la coneccion se le carga la consulta
            preState.setInt(1, idUsuario);
            preState.setString(2, modeloRegistro.productoRegistrado.getNombreProducto());
            preState.setString(3, modeloRegistro.productoRegistrado.getDescripcionProducto());
            preState.setFloat(4, modeloRegistro.productoRegistrado.getPrecioProducto());
            preState.setDate(5, modeloRegistro.getSqlFecha());
            resultado = preState.executeQuery();//a la consulta cargada se ejecuta y accedes a la tabla del resultado, todo esto en la base
        }catch(Exception e){
            System.out.println("error: "+e);
        }
    }

    @Override
    public void eliminar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List listar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
