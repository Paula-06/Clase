/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BriceñoPaula_exColeeciones_ModA;


public class Alumno implements Comparable<Alumno>{
    //Atributos privados
    private int NIA;
    private String nombre;
    private double nota;
    
    //CONSTRUCTORES
    
    //Constructor para todos los parametros
    public Alumno(int NIA, String nombre, double nota) {
        this.NIA = NIA;
        this.nombre = nombre;
        this.nota = nota;
    }
    
    //Constructorpara NIa y Alumno, nota por defecto -1.0
    public Alumno(int NIA, String nombre) {
        this(NIA, nombre, -1.0);
    }
    
    
    //MÉTODOS
    //Getters y Setters de todos los atributos

    public int getNIA() {
        return NIA;
    }

    public void setNIA(int NIA) {
        this.NIA = NIA;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
    //Método toString
    @Override
    public String toString() {
        return "Alumno{" + "NIA=" + NIA + ", nombre='" + nombre + "', nota=" + nota + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
         Alumno other = (Alumno) obj;
         
         return this.NIA == other.NIA;
    }
   
    
  

    //Método compare
    @Override
    public int compareTo(Alumno o) {
        if (this.NIA > o.NIA) {
            return 1;
        } else if (this.NIA < o.NIA) {
            return -1;
        }
        return 0;
    }

}