/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioVehiculos;

/**
 *
 * @author sergy
 */
public class Camion extends Vehiculo{
    private int capacidadCarga;
    
    public Camion(String marca, String modelo, int anio, int capacidadCarga) {
        super(marca, modelo, anio);
        this.capacidadCarga = capacidadCarga;
    }
    
    @Override
    public double calcularImpuesto() {
        double resultado = (getAnio() * 0.10) * 200;
        return resultado;
    }
}
