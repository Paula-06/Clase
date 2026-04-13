/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia2;

/**
 *
 * @author User
 */
public class Vehiculo {
    //Atributos
 protected String marca;
    protected int velocidad;

    public Vehiculo(String marca, int velocidad) {
        this.marca = marca;
        this.velocidad = velocidad;
    }

    public void mostrarDatos() {
        System.out.println("Marca: " + marca + ", Velocidad: " + velocidad);
    }
}
