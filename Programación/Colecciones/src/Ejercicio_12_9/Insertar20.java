/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_12_9;

import java.util.ArrayList;
import java.util.Scanner;

public class Insertar20 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            ArrayList<Integer> lista = new ArrayList<>();
            
            int num;
            
            // Leer números hasta que se introduzca uno negativo
            do {
                System.out.print("Introduce un número: ");
                num = sc.nextInt();
                if (num >= 0) {
                    lista.add(num);
                }
            } while (num >= 0);
            
            // Recorrer la lista
            for (int i = 0; i < lista.size(); i++) {
                int valor = lista.get(i);
                
                if (valor % 2 == 0) { // Si es par
                    System.out.println("Índice: " + i);
                    lista.set(i, valor * 100); // Multiplica por 100
                }
            }
            
            // Mostrar lista final
            System.out.println("Lista final: " + lista);
        }
    }
}
