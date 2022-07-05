/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupocuatro.proyectoalmacen.controlador.controladores;
import com.grupocuatro.proyectoalmacen.controlador.Conexion;
import com.grupocuatro.proyectoalmacen.vista.ventanas.Registros;
import com.grupocuatro.proyectoalmacen.modelo.producto.RegistroIngresoSalida;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//Librerias para listar los productos en la ventana
import java.util.List;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author manue
 */
public class ControrladorRegistroIngresoSalida implements CRUD{
    private Registros ventanaRegistros;
    private DefaultTableModel modeloTablaRegistros = new DefaultTableModel();
    RegistroIngresoSalida registro;

    private final Conexion conexionMenu = new Conexion();
    private Connection acceso;
    private PreparedStatement preState;
    private ResultSet resultado;
    public ControrladorRegistroIngresoSalida(Registros ventanaRegistros) {
        this.ventanaRegistros = new Registros();
        listarRegistros();
        this.ventanaRegistros.actualizarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modeloTablaRegistros.setRowCount(0);
                ventanaRegistros.registrosJTable.setModel(modeloTablaRegistros);
                javax.swing.JOptionPane.showMessageDialog(ventanaRegistros,"Se ha actualizado");
                listarRegistros();
            }
        });
    }
    
    public void iniciarVentanasRegistros(){
        ventanaRegistros.setVisible(true);
        ventanaRegistros.setTitle("Registros de Actividad Almacen");
    }

    public final void listarRegistros(){
        List<RegistroIngresoSalida> listaRegistro = listar();
        modeloTablaRegistros = (DefaultTableModel)ventanaRegistros.registrosJTable.getModel();
        Object[] ob = new Object[7];
        for (int i = 0; i < listaRegistro.size(); i++) {
            ob[0] = listaRegistro.get(i).getId();
            ob[1] = listaRegistro.get(i).getUsuario();
            ob[2] = listaRegistro.get(i).getProducto();
            ob[3] = listaRegistro.get(i).getOperacion();
            ob[4] = listaRegistro.get(i).getCantidad();
            ob[5] = listaRegistro.get(i).getFecha();
            modeloTablaRegistros.addRow(ob);
            
        }
        ventanaRegistros.registrosJTable.setModel(modeloTablaRegistros);
    }
    
    @Override
    public List listar() {
        //ID    RESPONSABLE     PRODUCTO        OPERACION       CANTIDAD        FECHA
        List<RegistroIngresoSalida> listaRegistro = new ArrayList<>();
        String sql = "select id, (select nombre from Usuario where id_usuario = id) as usuario, (select nombre from Producto where id_producto = id ) as producto, operacion, cantidad, fecha from registro";
        try{
            acceso = conexionMenu.Conectar();
            preState = acceso.prepareStatement(sql);
            resultado = preState.executeQuery();
            while(resultado.next()){
                registro = new RegistroIngresoSalida();
                registro.setId(resultado.getInt(1));
                registro.setUsuario(resultado.getString(2));
                registro.setProducto(resultado.getString(3));
                registro.setOperacion((resultado.getString(4)).replace(" ",""));
                registro.setCantidad(resultado.getInt(5));
                registro.setFecha(resultado.getString(6));
                
                listaRegistro.add(registro);
            }
        } catch(SQLException e){
            System.out.println("Error :"+e);
        }
        return listaRegistro;
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
