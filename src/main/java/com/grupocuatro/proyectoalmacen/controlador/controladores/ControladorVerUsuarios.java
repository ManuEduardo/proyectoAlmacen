/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupocuatro.proyectoalmacen.controlador.controladores;
import com.grupocuatro.proyectoalmacen.controlador.Conexion;
import com.grupocuatro.proyectoalmacen.vista.ventanas.crudUsuario.VerUsuarios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//Librerias para listar los usuarios en la ventana
import com.grupocuatro.proyectoalmacen.modelo.usuario.Usuario;
import java.util.List;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author manue
 */
public class ControladorVerUsuarios implements CRUD{
    private VerUsuarios ventanaUsuarios;
    private DefaultTableModel modeloTablaUsuario = new DefaultTableModel();
    
    private final Conexion conexionMenu = new Conexion();
    private Connection acceso;
    private PreparedStatement preState;
    private ResultSet resultado;
    
    public ControladorVerUsuarios(VerUsuarios ventanaUsuarios) {
        this.ventanaUsuarios = ventanaUsuarios;
        listarUsuarios();
    }
    
    
    public void iniciarVentanaVerUsuarios(){
        ventanaUsuarios.setVisible(true);
        ventanaUsuarios.setTitle("Registros de Actividad Almacen");
    }

    public final void listarUsuarios(){
        List<Usuario> listaUsuario = listar();
        modeloTablaUsuario = (DefaultTableModel)ventanaUsuarios.usuariosJTable.getModel();
        Object[] ob = new Object[4];
        for (int i = 0; i < listaUsuario.size(); i++) {
            ob[0] = listaUsuario.get(i).getId();
            ob[1] = listaUsuario.get(i).getUsuario();
            ob[2] = listaUsuario.get(i).getTipoUsuario();
            modeloTablaUsuario.addRow(ob);
            
        }
        ventanaUsuarios.usuariosJTable.setModel(modeloTablaUsuario);
    }
    
    @Override
    public List listar() {
        List<Usuario> listaUsuario = new ArrayList<>();
        String sql = "SELECT * from Usuario";
        try{
            acceso = conexionMenu.Conectar();
            preState = acceso.prepareStatement(sql);
            resultado = preState.executeQuery();
            while(resultado.next()){
                Usuario user = new Usuario();
                user.setId(resultado.getInt(1));
                user.setUsuario(resultado.getString(2));
                user.setContrasena(resultado.getString(3));
                user.setTipoUsuario(resultado.getString(4));
                listaUsuario.add(user);
            }
        } catch(SQLException e){
            System.out.println("Error :"+e);
        }
        return listaUsuario;
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
