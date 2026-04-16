/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author pabrmo971
 */
public class Estudiante extends Persona{
    //Atributo
    private int horasDeClase;
    private double tarifaHora;
    private String Persona;

    //Constructor
    public Estudiante(String nombre, int edad, int horasDeClase, double tarifaHora) {
        super(nombre, edad);
        this.horasDeClase = horasDeClase;
        this.tarifaHora = tarifaHora;
        
    }
    
        public Estudiante(String nombre, int edad, int horasDeClase) {
        super(nombre, edad);
        this.horasDeClase = horasDeClase;
        tarifaHora = 1.25;
        
    }

    public int getHorasDeClase() {
        return horasDeClase;
    }

    public void setHorasDeClase(int horasDeClase) {
        this.horasDeClase = horasDeClase;
    }

    public double getTarifaHora() {
        return tarifaHora;
    }

    public void setTarifaHora(double tarifaHora) {
        this.tarifaHora = tarifaHora;
    }
        
    
    
    //Método calcularValorMensual
    @Override
    public double calcularValorMensual() {
        return horasDeClase * tarifaHora;
    }
    
    //Sobreescribir toString
    @Override
    public String toString() {
          return super.toString() +
                  " Horas de Clase: " + horasDeClase + ", Tarifa hora: " + tarifaHora + ", Valor mensual: " + calcularValorMensual();
    }
    
}
