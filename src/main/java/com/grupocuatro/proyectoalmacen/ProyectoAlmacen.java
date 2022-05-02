/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.grupocuatro.proyectoalmacen;
import com.grupocuatro.proyectoalmacen.modelo.funcionalidades.Ingresar;
public class ProyectoAlmacen {

    public static void main(String[] args) {
        System.out.println("Testeo de clases y metodos");
        //Para testear
        Ingresar ing = new Ingresar();
        System.out.println(ing.getFechaHoy());
        ing.ventana();
    }
}
