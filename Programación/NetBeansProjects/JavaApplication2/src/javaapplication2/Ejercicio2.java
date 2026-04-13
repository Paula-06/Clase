
package javaapplication2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombre; //nombre del estudiante
        double nota; //nota
        double sumaNotas = 0; //suma de las notas para hacer la media
        int cantidadEstudiantes = 0; // cantidad para dividir las notas y sacar la media
        double mejorNota = 0; //mejor nota 
        String mejorEstudiante = ""; //mejor estudiante
        boolean continuar = true;//si continuar es true se sigue preguntando

        while (continuar) {
            System.out.print("Introduce el nombre del estudiante (o 'fin' para terminar): ");
            nombre = sc.next();  // lee una palabra

            // para simplificar sin usar equals, si el nombre es "fin", paramos
            if (nombre.equals("fin")) {  // esta línea se puede cambiar a otra técnica si aún no la ven
                continuar = false;
            } else { //agragamos la nota el estudiante 
                System.out.print("Introduce la nota de " + nombre + ": ");
                nota = sc.nextDouble();
                
                sumaNotas += nota; //le sumames una nota más para hacer la media
                cantidadEstudiantes++; //un estudiante más 

                if (nota > mejorNota) {  
                    mejorNota = nota; //La nota más alta es la mejor
                    mejorEstudiante = nombre;
                }
            }
        }
        
        if (cantidadEstudiantes > 0) { //sacas la cantidad y das el resultado final 
            double promedio = sumaNotas / cantidadEstudiantes;
            System.out.println("\n--- Resultados ---");
            System.out.println("Promedio de notas: " + promedio);
            System.out.println("Estudiante con la nota más alta: " + mejorEstudiante + " (" + mejorNota + ")");
        } else {
            System.out.println("No se introdujeron datos.");
        }
    }
}