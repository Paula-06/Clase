/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioVehiculos;

/**
 *
 * @author sergy
 */
public class Auto extends Vehiculo{
    private int numeroPuertas;
    
    public Auto(String marca, String modelo, int anio, int numeroPuertas) {
        super(marca, modelo, anio);
        this.numeroPuertas = numeroPuertas;
    }

    
            @Override
        public double calcularImpuesto() {
        // 5% del año multiplicado por 100
        return (getAnio() * 100) * 0.05;
        }

        @Override
        public String toString() {
        return super.toString() +
        ", Puertas: " + numeroPuertas +
        ", Impuesto: " + calcularImpuesto();
        }



        }
