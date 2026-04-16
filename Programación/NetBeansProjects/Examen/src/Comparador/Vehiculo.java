/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comparador;

/**
 *
 * @author User
 */
abstract class Vehiculo implements Impuestos, Comparable<Vehiculo> {
    protected String marca;
    protected String modelo;
    protected int anio;

    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Año: " + anio;
    }

    // Comparable → orden natural (año DESC)
    @Override
    public int compareTo(Vehiculo otro) {
        // Orden decreciente por año
        if (this.anio != otro.anio) {
            return otro.anio - this.anio;
        } else {
            // Si mismo año → usar Comparator por marca
            return this.marca.compareTo(otro.marca);
        }
    }

 
}

    

