/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author pabrmo971
 */
public class Profesor extends Persona implements Comparable{
    //Atributos
    private int horasSemanales;
    private double tarifaHora;
    private String especialidad;
    
    //Constructor
     public Profesor(String nombre, int edad, int horasSemanales, double tarifaHora, String especialidad) {
        super(nombre, edad);
        this.horasSemanales = horasSemanales;
        this.tarifaHora = tarifaHora;
        this.especialidad = especialidad;
    }
    
     //Método esSenior
    public boolean esSenior(int edad) {
         boolean comprobar;
         
         comprobar = edad > 50;
         
         return true;
     }

    public int getHorasSemanales() {
        return horasSemanales;
    }

    public void setHorasSemanales(int horasSemanales) {
        this.horasSemanales = horasSemanales;
    }

    public double getTarifaHora() {
        return tarifaHora;
    }

    public void setTarifaHora(double tarifaHora) {
        this.tarifaHora = tarifaHora;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    
    
    //Método calcularValorMensual
    @Override
    public double calcularValorMensual() {
        double suma = horasSemanales * tarifaHora;
        if (this.esSenior(edad)) {
            return suma + 200;
        } else {
            return suma;
        }
    }
    
    //Método toString
    @Override
    public String toString() {
        return super.toString() +
         " horas semanales: " + horasSemanales + ", tarifa: " +tarifaHora+ ", Especialidad: " +especialidad + ", Valor mensual: " + calcularValorMensual(); 
    }
    
    public int compareTo(Object obj) {
        return this.nombre.compareTo(((Profesor)obj).nombre);
    }
}
