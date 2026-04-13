/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Interfaces2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          List<Producto> productos = new ArrayList<>();

        productos.add(new Producto("Teclado", 30));
        productos.add(new Producto("Ratón", 15));
        productos.add(new Producto("Monitor", 200));

        // Comparator con clase anónima
        Collections.sort(productos, new Comparator<Producto>() {
            @Override
            public int compare(Producto p1, Producto p2) {
                return Double.compare(p1.getPrecio(), p2.getPrecio());
            }
        });

        for (Producto p : productos) {
            System.out.println(p.getNombre() + " - " + p.getPrecio());
        }
        
    }    
}
    

