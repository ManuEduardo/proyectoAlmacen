/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupocuatro.proyectoalmacen.controlador.controladores;

import com.grupocuatro.proyectoalmacen.controlador.Conexion;
import com.grupocuatro.proyectoalmacen.vista.ventanas.crudUsuario.RecuperarContrasena;
import com.grupocuatro.proyectoalmacen.modelo.usuario.Usuario;
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
public abstract class ControladorRecuperarContrasena implements CRUD{
    public final RecuperarContrasena ventanaRecuperarContrasena;
    private final Usuario modeloUsuario;
    
    private final Conexion conexionCrear = new Conexion();
    private Connection acceso;
    private PreparedStatement preState;
    private ResultSet resultado;

    public ControladorRecuperarContrasena(RecuperarContrasena ventanaRecuperarContrasena, Usuario modeloUsuario) {
        this.ventanaRecuperarContrasena = ventanaRecuperarContrasena;
        this.modeloUsuario = modeloUsuario;
        listarPreguntasComboBox();
        this.ventanaRecuperarContrasena.mostrarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verificarCampos(); 
            }});
    }
    
    
    public void IniciarVentanaRecuperar(){
        ventanaRecuperarContrasena.setVisible(true);
        ventanaRecuperarContrasena.setTitle("Recuperar Contraseña");
    }
    
    public final void listarPreguntasComboBox(){
        List<String> listaPreguntas = listar();
        for (int i = 0; i < listaPreguntas.size(); i++) {
            ventanaRecuperarContrasena.preguntaComboBox.addItem(listaPreguntas.get(i));
        }
    }
    
    public abstract void salir();
    
    public void vaciarCampos(){
        ventanaRecuperarContrasena.nombreField.setText("Nombre del Usuario");
        ventanaRecuperarContrasena.respuestaField.setText("respuesta");
    }
    
    public void verificarCampos(){
        String nombre = ventanaRecuperarContrasena.nombreField.getText().trim();
        String pregunta = (String)ventanaRecuperarContrasena.preguntaComboBox.getSelectedItem();
        String respuesta = ventanaRecuperarContrasena.respuestaField.getText().trim();
        
        if("".equals(nombre)||"Nombre del Usuario".equals(nombre)){
            javax.swing.JOptionPane.showMessageDialog(ventanaRecuperarContrasena,"Ingrese un Nombre de Usuario");
            return;
        }else if("".equals(respuesta)||"respuesta".equals(respuesta)){
            javax.swing.JOptionPane.showMessageDialog(ventanaRecuperarContrasena,"Ingrese una respuesta a la pregunta");
            return;
        } else{
            String contrasena = devolderContrasena(nombre,pregunta,respuesta);
            if("".equals(contrasena)){
                javax.swing.JOptionPane.showMessageDialog(ventanaRecuperarContrasena,"No se encontraron los Datos");
            }else{
                javax.swing.JOptionPane.showMessageDialog(ventanaRecuperarContrasena,"LA CONTRASEÑA ES:  "+contrasena);
                salir();
                vaciarCampos();
            }
            
        }
    }
    
    public String devolderContrasena(String nombre, String pregunta, String respuesta){
        String sql = "select * from dbo.BuscarContrasena(?,?,?)";
        try{
            acceso = conexionCrear.Conectar();
            preState = acceso.prepareStatement(sql);
            preState.setString(1, nombre.trim());
            preState.setString(2, pregunta.trim());
            preState.setString(3, respuesta.trim());
            resultado = preState.executeQuery();
            resultado.next();
            return resultado.getString(1);
        } catch(SQLException e){
            System.out.println("Error 2:"+e);
            return "";
        }
    }
    
    @Override
    public List listar() {
        List<String> listaPreguntas = new ArrayList<>();
        String sql = "SELECT * FROM pregunta";
        try{
            acceso = conexionCrear.Conectar();
            preState = acceso.prepareStatement(sql);
            resultado = preState.executeQuery();
            while(resultado.next()){
                String pregunta;
                pregunta = resultado.getString(2);
                listaPreguntas.add(pregunta);
            }
        } catch(SQLException e){
            System.out.println("Error :"+e);
        }
        return listaPreguntas;
    }
    
    @Override
    public void eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public void crear() {
        
    }

    
}
