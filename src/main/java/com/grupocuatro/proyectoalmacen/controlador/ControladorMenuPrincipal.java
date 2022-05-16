/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupocuatro.proyectoalmacen.controlador;
import com.grupocuatro.proyectoalmacen.vista.MenuPrincipal;
import com.grupocuatro.proyectoalmacen.modelo.producto.Producto;
        
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
public class ControladorMenuPrincipal {
    private final MenuPrincipal ventanaMenu;
    private DefaultTableModel modeloTablaProducto = new DefaultTableModel();
    
    private final Conexion conexionMenu = new Conexion();
    private Connection acceso;
    private PreparedStatement preState;
    private ResultSet resultado;

    public ControladorMenuPrincipal(MenuPrincipal ventanaMenu) {
        this.ventanaMenu = ventanaMenu;
    }
    
    
    public void IniciarVentanaMenu(){
        listarProductos();
        ventanaMenu.setVisible(true);
        ventanaMenu.setTitle("Menu Principal");
    }
    
    //Se lista los productos
    public List listar(){
        List<Producto> listaProductos = new ArrayList<>();
        String sql = "SELECT * FROM producto";
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
                produc.setCantidadProducto(resultado.getInt(5));
                listaProductos.add(produc);
            }
        } catch(SQLException e){
            System.out.println("Error :"+e);
        }
        return listaProductos;
    }
    
    public void listarProductos(){
        List<Producto> listaProduc = listar();
        modeloTablaProducto = (DefaultTableModel)ventanaMenu.productosJTable.getModel();
        Object[] ob = new Object[5];
        for (int i = 0; i < listaProduc.size(); i++) {
            ob[0] = listaProduc.get(i).getIdProducto();
            ob[1] = listaProduc.get(i).getNombreProducto();
            ob[2] = listaProduc.get(i).getDescripcionProducto();
            ob[3] = listaProduc.get(i).getPrecioProducto();
            ob[4] = listaProduc.get(i).getCantidadProducto();
            modeloTablaProducto.addRow(ob);
        }
        ventanaMenu.productosJTable.setModel(modeloTablaProducto);
    }
    
    
}
