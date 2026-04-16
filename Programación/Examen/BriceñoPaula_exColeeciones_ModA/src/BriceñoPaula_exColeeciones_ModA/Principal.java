/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BriceñoPaula_exColeeciones_ModA;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author pabrmo971
 */
public class Principal {

    public static void main(String[] args) {
        //Lista de alumnos
        List<Alumno> listaAlum = new ArrayList();
        
        //Datos sobre los alumnos
        listaAlum.add(new Alumno(11111, "Rosa Moreno", 9.5));
        listaAlum.add(new Alumno(33333, "Irene Garrido", 4.6));
        listaAlum.add(new Alumno(22222, "Manuel Lobato", 4.75));
        listaAlum.add(new Alumno(44444, "Alberto Risco"));//Nota por defecto
        listaAlum.add(new Alumno(11111, "Pedro Lucas", 6.2));
        
       //Mostrar lista y su tamaño, en el  imprimeLista, por defecto tambien sale el tamaño
        System.out.println("=== LISTA ORIGINAL ===");
        imprimeLista(listaAlum);
        
        
        //Me da fallo en treemap
        //Listado sin repeticiones
        Set<Alumno> listaOrden = new TreeSet(listaAlum);
        System.out.println("=== SIN REPETIDOS ORDENADO POR NIA");
        imprimeLista(listaOrden);
        
        //Cambiar el valor ente 4.5-5.0 por 5.0
        System.out.println("=== Despues de subir nota ===");
        subeNota(listaAlum, 4.5);
        imprimeLista(listaOrden);
        
        //
        System.out.println("Meida total:");
        calculaMedia(listaOrden);
        
        
    }
    
    //MÉTODOS
    public static void imprimeLista(Collection<Alumno> lista) {
        //Recorremos lista
        for (Alumno a : lista) {
            System.out.println(a);
        }
        System.out.println("Tamaño: " +lista.size());
    }
    
    
    //Metodo Subenota
    public static void subeNota(Collection<Alumno> lista, double valor) {
        Iterator<Alumno> it = lista.iterator();
        
        while (it.hasNext()) {
            Alumno next = it.next();
            if (next.getNota() < valor && next.getNota() > 10) {
                next.setNota(5.0);
            
            } 
        }
    }
    
    //MEtodo calcular media
    public static void calculaMedia(Collection<Alumno> lista) {
        double media = 0;
        int cal=lista.size();
        double suma = 0;
        for (Alumno a : lista) {
            if (a.getNota() != -1.0) {
                suma = suma+a.getNota();
                cal++;
            } 
        }
       media = suma/cal;
        System.out.println(media);
    }
    
                
        
        }
    


