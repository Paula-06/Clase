/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Clases;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author pabrmo971
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Array
    Persona[] lista = new Persona[4];
    
    //Datos
    lista[0] = new Estudiante("Juan", 22, 20, 10);
    lista[1] = new Estudiante("Juana", 19, 10, 12.5);
    lista[2] = new Profesor("Ana", 42, 10, 20.0, "Redes");
    lista[3] = new Profesor("Eva", 54, 20, 40.0, "Programación");
   
     
    // Mostrar normal
        System.out.println("Array Original: ");
        System.out.println();
        
        for(Persona p : lista) {
            System.out.println(p);
        }
        

        
//     //Ordenar por criterio narural y mostrar
        System.out.println();
        System.out.println("Array ordenado por nombre");
        System.out.println();
       
//        Arrays.sort(lista); 
//          Mes falla el Array, si se descomenta da error
        for(Persona p : lista) {
            System.out.println(p);
        }

    //Edad cambiada
    
        System.out.println();
        System.out.println("Persona con la edad cambiada");
        System.out.println();
        lista[2].setEdad(52);
        System.out.println(lista[2]);
    }
    
}
