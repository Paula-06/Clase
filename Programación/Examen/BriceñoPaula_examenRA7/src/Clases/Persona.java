/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import Interfaces.MiembroAcademia;

/**
 *
 * @author pabrmo971
 */
public abstract class Persona implements MiembroAcademia{
    //Atributos
    protected String nombre;
    protected  int edad;
    
    //Constructor
    Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //Método toString
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad; 
    }
    
    @Override
    public abstract double calcularValorMensual();

}
