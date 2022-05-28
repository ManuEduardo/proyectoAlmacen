/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupocuatro.proyectoalmacen.controlador.controladores;
import com.grupocuatro.proyectoalmacen.controlador.Conexion;
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
public class ControladorMenuPrincipal implements CRUD{
    private ControladorMenuVentanas controladorVentanas;
    private final MenuPrincipal ventanaMenu;
    private DefaultTableModel modeloTablaProducto = new DefaultTableModel();

    private final Conexion conexionMenu = new Conexion();
    private Connection acceso;
    private PreparedStatement preState;
    private ResultSet resultado;
    
    private String permisoUsuario;

    public ControladorMenuPrincipal(MenuPrincipal ventanaMenu) {
        this.controladorVentanas = new ControladorMenuVentanas();
        this.ventanaMenu = new MenuPrincipal();
        
        this.ventanaMenu.ingresarStockButton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                //ingresarStockButtonMouseClicked(evt);
                if(permisoUsuario.equals("Administrador")||permisoUsuario.equals("Empleado")){
                    controladorVentanas.controladorIngresar.iniciarVentanaIngresar();
                }else{
                    javax.swing.JOptionPane.showMessageDialog(ventanaMenu,"NO TIENE PERMISO PARA ESTA FUNCIONALIDAD");
                }
            }
        });
        this.ventanaMenu.verUsuariosButton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(permisoUsuario.equals("Administrador")){
                    controladorVentanas.controladorUsuarios.iniciarVentanaVerUsuarios();
                }else{
                    javax.swing.JOptionPane.showMessageDialog(ventanaMenu,"NO TIENE PERMISO PARA ESTA FUNCIONALIDAD");
                }
            }
        });
        this.ventanaMenu.registrarProductoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(permisoUsuario.equals("Administrador")){
                    controladorVentanas.controladorRegistrar.iniciarVentanaRegistrar();
                }else{
                    javax.swing.JOptionPane.showMessageDialog(ventanaMenu,"NO TIENE PERMISO PARA ESTA FUNCIONALIDAD");
                }
            }
        });
        this.ventanaMenu.registroButton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                controladorVentanas.controladorRegistros.iniciarVentanasRegistros();
            }
        });
        this.ventanaMenu.retirarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                //retirarButtonMouseClicked(evt);
                if(permisoUsuario.equals("Administrador")||permisoUsuario.equals("Empleado")){
                    controladorVentanas.controladorRetirar.iniciarVentanaRetirar();
                }else{
                    javax.swing.JOptionPane.showMessageDialog(ventanaMenu,"NO TIENE PERMISO PARA ESTA FUNCIONALIDAD");
                }
            }
        });
        this.ventanaMenu.salirbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                //salirbuttonMouseClicked(evt);
            }
        });
        this.ventanaMenu.eliminarPButton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(permisoUsuario.equals("Administrador")){
                    //falta implementar
                }else{
                    javax.swing.JOptionPane.showMessageDialog(ventanaMenu,"NO TIENE PERMISO PARA ESTA FUNCIONALIDAD");
                }
            }
        });
        this.ventanaMenu.actualizarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                //actualizarButtonMouseClicked(evt);
            }
        });
    }
    
    
    
    public void IniciarVentanaMenu(){
        listarProductos();
        permisoUsuario = ventanaMenu.tipoLabel.getText();
        ventanaMenu.setVisible(true);
        ventanaMenu.setTitle("Menu Principal");
        System.out.println("Prueba "+permisoUsuario);
    }
    
    
    public void datosLoggeo(String nombre,String tipo){
        ventanaMenu.nombreLabel.setText(nombre);
        ventanaMenu.tipoLabel.setText(tipo);
    }
    
    //Se lista los productos
    @Override
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

    @Override
    public void crear() {
        //No usado
    }

    @Override
    public void eliminar() {
        //No usado
    }
    
    
    
}
