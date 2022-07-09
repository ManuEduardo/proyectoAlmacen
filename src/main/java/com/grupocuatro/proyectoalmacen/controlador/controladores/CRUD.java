/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupocuatro.proyectoalmacen.controlador.controladores;
import java.util.List;

/**
 *
 * @author manue
 */
public interface CRUD {
    void crear();
    void eliminar(int id);
    List listar();
}
