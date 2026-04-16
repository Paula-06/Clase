/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Spotify;

import java.util.Objects;

public class Cancion implements Comparable<Cancion>{
    //Atributos 
    private String titulo;
    private String artista;
    private int anio; 
    
    //Constructor
    public Cancion(String titulo, String artista, int anio) {
        this.titulo = titulo;
        this.artista = artista;
        this.anio = anio;
    }
    
    //Constructor sobreCargado sin año
    public Cancion(String titulo, String artista) {
        this(titulo, artista, 0);
    }
     
    //Constructor sobreCargado sin artista
    public Cancion(String titulo, int anio) {
        this(titulo, "Desconocido", anio);
    }
     
    //Constructor sobreCargado sin titulo
    public Cancion(String titulo) {
        this(titulo, "Desconocido", 0);
    }
    
    //Metodo toString
    @Override
    public String toString() {
        return titulo + " - " + artista + "(" + anio + ")";
    }

    
    //Método equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) 
            return true;
        if (!(obj instanceof Cancion)) 
            return false;
        Cancion c = (Cancion) obj;
        return titulo.equals(c.titulo) && artista.equals(c.artista);
    }
    
    public int hasCode() {
        return Objects.hash(titulo, artista);
    }
    
    public int compareTo(Cancion o) {
        int compTitulo = this.titulo.compareTo(o.titulo);
        
               if (compTitulo != 0) {
            return compTitulo;
        }

        return this.artista.compareTo(o.artista);
            
        }
    }
    

