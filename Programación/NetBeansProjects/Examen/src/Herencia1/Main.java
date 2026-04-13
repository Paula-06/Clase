/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Herencia1;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Animal[] animales = {
            new Perro("Rex"),
            new Gato("Michi")
        };

        for (Animal a : animales) {
            a.hacerSonido(); // POLIMORFISMO
        }
    }
}
