/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupocuatro.proyectoalmacen.controlador;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author manue
 */
public class Conexion {
    Connection conexion;
    String url = "jdbc:sqlserver://localhost:1433;databaseName=BDAlmacen";
    String user = "usuarioSQL";
    String pass = "123";
    public Connection Conectar(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conexion = DriverManager.getConnection(url, user, pass);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"chale "+e.toString());
        }
        return conexion;
    }
    
}
