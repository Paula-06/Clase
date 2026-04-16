/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Comparador;

import java.util.Arrays;
/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Array
        Vehiculo[] vehiculos = new Vehiculo[5];
        
        vehiculos[0] = new Auto("Toyota", "Corolla", 2015, 4);
        vehiculos[1] = new Auto("Honda", "Civic", 2018, 4);
        vehiculos[2] = new Camion("Volvo", "FH16", 2012, 20);
        vehiculos[3] = new Auto("Ford", "Focus", 2015, 4);
        vehiculos[4] = new Camion("Scania", "R500", 2019, 25);
         // Mostrar vehículos
        System.out.println("=== Vehículos originales ===");
        for (Vehiculo v : vehiculos) {
            System.out.println(v);
        }

        // Ordenar por orden natural (compareTo)
        Arrays.sort(vehiculos);

        // Mostrar ordenados
        System.out.println("\n=== Vehículos ordenados por año DESC ===");
        for (Vehiculo v : vehiculos) {
            System.out.println(v);
        }
    }
    
}
