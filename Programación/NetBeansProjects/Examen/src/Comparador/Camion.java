/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comparador;

/**
 *
 * @author User
 */
 class Camion extends Vehiculo{
    int capacidadCarga;
    
    public Camion(String marca, String modelo, int anio, int capacidadCarga) {
        super(marca, modelo, anio);
        this.capacidadCarga = capacidadCarga;
    }


    
 //Método calcularImpuesto
    @Override
    public double calcularImpuesto() {
        return anio * 200 * 0.10;
    }
  
    //Método toString
    public String toString() {
         return super.toString() + ", Carga: " + capacidadCarga + " toneladas" +
               ", Impuesto: " + calcularImpuesto(); 
    }
}
