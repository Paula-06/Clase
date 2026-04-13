/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class examen1 {

    /**
     * @param args the command line arguments
     */
    static int leerTotalAlumnos() {
        Scanner sc = new Scanner(System.in);
        //declarar variables
        int AlumTotal = 0;
        boolean entero = false;
        do {
            try {
                System.out.println("Introduce el total de los alumnos: "); //pedimos el total de alumnos
                AlumTotal = sc.nextInt();
                
                if (AlumTotal<0) {
                    throw new IllegalArgumentException ("Debes introducir un numero entero");
                }
            entero = true;
            }
            catch(InputMismatchException e) { //validamos si es entero
                System.out.println("Error: debes introducir un número entero");
                sc.nextLine();
                   
            }
        } while (!entero);
                
                return AlumTotal;
    }
     static int leerCalificaciones() {
        Scanner sc = new Scanner(System.in);
        //declarar variables
        int calificacion = 0;
        boolean valido = false; 
        do {
            try {            
                System.out.println("Nota del alumno (entre 0 y 10): "); //vemos si esta entre 0 y 10
                calificacion = sc.nextInt();

                if (calificacion < 0 || calificacion > 10) { //si no es damos el error
                    throw new IllegalArgumentException("Nota no válida. Introduce otra.");
                }
                valido = true;                 
            }
            catch(InputMismatchException e) { //validamos si es entero
                System.out.println("Error: debes introducir un número entero");
                sc.nextLine();                  
            }
            catch(IllegalArgumentException e) { //validamos si es entero
                System.out.println();
            }
        } while (!valido); 
        return calificacion; //devolvemos
    }
    

      public static void main(String[] args) {
          //creamos todas las variables
            int Total = leerTotalAlumnos();
            int calificacion = leerCalificaciones();
            int contAprob = 0;
            int contSus = 0;
            int contSobr = 0;
            int contNo = 0;
            int contBi = 0;
                if (calificacion > 5){ //si saca mas de 5 es un aprobado
                    contAprob ++;
                }
                 if (calificacion < 5){//si saca menos de 5 es un suspenso
                    contSus ++;
                }


            System.out.println("Número total de alumnos = " + Total);
            System.out.println("Total de aprobados = " + contAprob);
            System.out.println("Total de suspensos = " + contSus);
            System.out.println("Total de sobresalientes = " + contSobr);
            System.out.println("Total de notables = " + contNo);
            System.out.println("Total de bien = " + contBi);
            
    }
}

    
    

