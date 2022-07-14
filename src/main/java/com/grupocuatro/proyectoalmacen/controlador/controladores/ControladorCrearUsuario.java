package com.grupocuatro.proyectoalmacen.controlador.controladores;
import com.grupocuatro.proyectoalmacen.controlador.Conexion;
import com.grupocuatro.proyectoalmacen.vista.ventanas.crudUsuario.CrearUsuario;
import com.grupocuatro.proyectoalmacen.modelo.usuario.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ControladorCrearUsuario implements CRUD {
    private final CrearUsuario ventanaCrearUsuario;
    
    private final Conexion conexionCrear = new Conexion();
    private Connection acceso;
    private PreparedStatement preState;
    private ResultSet resultado;

    public ControladorCrearUsuario(Usuario usuario, CrearUsuario ventanaCrearUsuario) {
        this.ventanaCrearUsuario = ventanaCrearUsuario;
        listarPreguntasComboBox();
        listarTipoComboBox();
        this.ventanaCrearUsuario.crearButton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearUsuario();
            }
        });
    }
    
    public void iniciarVentanaCrear(){
        ventanaCrearUsuario.setVisible(true);
        ventanaCrearUsuario.setTitle("Crear Usuario");
    }

    public void vaciarCampos(){
        ventanaCrearUsuario.nombreField.setText("Nombre del Usuario");
        ventanaCrearUsuario.contrasenaField.setText("contrasena");
        ventanaCrearUsuario.respuestaField.setText("respuesta");
    }
    
    public final void listarPreguntasComboBox(){
        List<String> listaPreguntas = listar();
        for (int i = 0; i < listaPreguntas.size(); i++) {
            ventanaCrearUsuario.preguntaComboBox.addItem(listaPreguntas.get(i));
        }
    }
    
    public final void listarTipoComboBox(){
        List<String> listaTipo = listar2();
        for (int i = 0; i < listaTipo.size(); i++) {
            ventanaCrearUsuario.tipoUsuarioComboBox.addItem(listaTipo.get(i));
        }
    }
    
    public void crearUsuario(){
        if(verificarCampos()){
            crear();
            ventanaCrearUsuario.setVisible(false);
            ventanaCrearUsuario.dispose();
            vaciarCampos();
        }
    }
    
    public boolean verificarCampos(){
        if("".equals(ventanaCrearUsuario.nombreField.getText().trim())||"Nombre del Usuario".equals(ventanaCrearUsuario.nombreField.getText().trim())){
            javax.swing.JOptionPane.showMessageDialog(ventanaCrearUsuario,"Ingrese el nombre");
            return false;
        }else if("".equals(String.valueOf(ventanaCrearUsuario.contrasenaField.getPassword()).trim())||"contrasena".equals(String.valueOf(ventanaCrearUsuario.contrasenaField.getPassword()).trim())){
            javax.swing.JOptionPane.showMessageDialog(ventanaCrearUsuario,"Ingrese una contraseña");
            return false;
        }else if("".equals(ventanaCrearUsuario.respuestaField.getText())||"respuesta".equals(ventanaCrearUsuario.respuestaField.getText())){
            javax.swing.JOptionPane.showMessageDialog(ventanaCrearUsuario,"Ingrese la respuesta a la pregunta");
            return false;
        }else{
         return true;   
        }
    }
    
    @Override
    public void crear() {
        String sql = "exec CrearUsuario ?,?,?,?,?";
        try{
            acceso = conexionCrear.Conectar();//se conecta
            preState = acceso.prepareStatement(sql);//la coneccion se le carga la consulta
            preState.setString(1, ventanaCrearUsuario.nombreField.getText().trim());
            preState.setString(2, String.valueOf(ventanaCrearUsuario.contrasenaField.getPassword()).trim());
            preState.setString(3, (String)ventanaCrearUsuario.tipoUsuarioComboBox.getSelectedItem());
            preState.setString(4, (String)ventanaCrearUsuario.preguntaComboBox.getSelectedItem());
            preState.setString(5, ventanaCrearUsuario.respuestaField.getText());
            resultado = preState.executeQuery();//a la consulta cargada se ejecuta y accedes a la tabla del resultado, todo esto en la base
        }catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog(ventanaCrearUsuario,"Usuario Creado");
            System.out.println("error: "+e);
            return;
        }
    }

    @Override
    public void eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public List listar2(){
        List<String> listaTipo = new ArrayList<>();
        String sql = "SELECT * FROM tipoUsuario";
        try{
            acceso = conexionCrear.Conectar();
            preState = acceso.prepareStatement(sql);
            resultado = preState.executeQuery();
            while(resultado.next()){
                String tipo;
                tipo = resultado.getString(2);
                listaTipo.add(tipo);
            }
        } catch(SQLException e){
            System.out.println("Error :"+e);
        }
        return listaTipo;
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
}
