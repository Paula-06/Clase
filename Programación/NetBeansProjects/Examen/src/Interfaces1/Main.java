/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Interfaces1;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Avion avion = new Avion();
        Pajaro pajaro = new Pajaro();
        
        System.out.println("El avion");
        avion.volar();
        System.out.println("El pajaro");
        pajaro.volar();
        
    }
    
}
