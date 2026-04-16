/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia2;

/**
 *
 * @author User
 */
public class Coche extends Vehiculo{
    private int puertas;

    public Coche(String marca, int velocidad, int puertas) {
        super(marca, velocidad);
        this.puertas = puertas;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Marca: " + marca + ", Velocidad: " + velocidad + ", Puertas: " + puertas);
    }
}
