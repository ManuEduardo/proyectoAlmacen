/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupocuatro.proyectoalmacen.controlador.controladores;
import com.grupocuatro.proyectoalmacen.controlador.Conexion;
import com.grupocuatro.proyectoalmacen.modelo.funcionalidades.Login;
import com.grupocuatro.proyectoalmacen.vista.VentanaLogin;

//No se imparta Conexion dado que esta en el mismo paquete
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author manue
 */
public abstract class ControladorLogin{
    private final Login modeloLogin;
    private final VentanaLogin ventanaLogin;
    
    private final Conexion conexionLogin = new Conexion();
    private Connection acceso;
    private PreparedStatement preState;
    private ResultSet resultado;
    private String TipoUsuario = null; 
    private String NombreUsuario = null;

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String NombreUsuario) {
        this.NombreUsuario = NombreUsuario;
    }

    public String getTipoUsuario() {
        return TipoUsuario;
    }

    public void setTipoUsuario(String TipoUsuario) {
        this.TipoUsuario = TipoUsuario;
    }
    
    
    public ControladorLogin(Login modeloLogin, VentanaLogin ventanaLogin) {
        this.modeloLogin = modeloLogin;
        this.ventanaLogin = ventanaLogin;
        this.ventanaLogin.entrarBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {entrarBotonValidador(evt);}});
        //Se establece la coneccion
    }
    
    
    
    //Funcion para mostrar ventana de login
    public void IniciarVentanaLogin(){
        ventanaLogin.setVisible(true);
        ventanaLogin.setTitle("Ventana Login");
    }
  
    

    public abstract  void funcionalidadButtonLogin();
    
    
    //Funcion para validad usuario y entrar a la ventana principal
    private void entrarBotonValidador(java.awt.event.MouseEvent evt) {
        //tValidador de usuario
        String usuarioIngresado = (String)ventanaLogin.usuarioField.getText().trim();
        String contrasenaIngresada = String.valueOf(ventanaLogin.contrasenaField.getPassword()).trim();
        
        if (validadorDeDatos(usuarioIngresado,contrasenaIngresada)){
            funcionalidadButtonLogin();//boton usado en el controlador principal
            //javax.swing.JOptionPane.showMessageDialog(ventanaLogin,"Ingreso de datos: \n Usuario: "+modeloLogin.getUsuario()+"\n Contraseña: "+modeloLogin.getContrasena());
        }else{
            setTipoUsuario(null);
            setNombreUsuario(null);
        }
    }
    
        
    
    //Funcion para validar datos
    public boolean validadorDeDatos(String usuarioIngresado,String contrasenaIngresada){
        //que los datos no esten vacios
        if("".equals(usuarioIngresado)||"".equals(contrasenaIngresada)){
            javax.swing.JOptionPane.showMessageDialog(ventanaLogin,"INGRESE DATOS");
            return false;
        }else if("Ingrese su usuario".equals(usuarioIngresado)||"contrasena".equals(contrasenaIngresada)){
            javax.swing.JOptionPane.showMessageDialog(ventanaLogin,"DATOS INVALIDOS");
            return false;
        }
        
        //Establecer conexion;
        String sql = "Select * from Usuario";
        try{
            acceso = conexionLogin.Conectar();//se conecta
            preState = acceso.prepareStatement(sql);//la coneccion se le carga la consulta
            resultado = preState.executeQuery();//a la consulta cargada se ejecuta y accedes a la tabla del resultado, todo esto en la base
            while(resultado.next()){//se itera en la tabla del resultado se cuenta desde 1S
                if(resultado.getString(2).equals(usuarioIngresado)&&resultado.getString(3).equals(contrasenaIngresada)){
                    modeloLogin.establecerDatos(usuarioIngresado, contrasenaIngresada);
                    //Se establecen datos para el uso de funciones en el menu principal
                    setTipoUsuario(resultado.getString(4));
                    setNombreUsuario(resultado.getString(2));
                    return true;
                }
            }
        }catch(Exception e){
            System.out.println("error: "+e);
            return false;
        }
        //Si no se ejecuta el trycatch
        javax.swing.JOptionPane.showMessageDialog(ventanaLogin,"NO SE HAN ENCONTRADO LOS DATOS");
        return false;
    }
}
