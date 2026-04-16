/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comparador;

/**
 *
 * @author User
 */
class Auto extends Vehiculo {
    private int numeroPuertas;

    public Auto(String marca, String modelo, int anio, int numeroPuertas) {
        super(marca, modelo, anio);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public double calcularImpuesto() {
        return anio * 100 * 0.05;
    }

    @Override
    public String toString() {
        return super.toString() + ", Puertas: " + numeroPuertas +
               ", Impuesto: " + calcularImpuesto();
    }
}
