
package javaapplication2;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); //pides al usuario los numero 
        System.out.println("Introduzca un número: ");
        int n1 = leerNumero(sc);
        System.out.println("Introduzca otro número: ");
        int n2 = leerNumero(sc);
        int suma = n1 + n2; //variable de suma
        System.out.println("La suma de " + n1 + " y " + n2 + " es de " + suma);
    }

    static int leerNumero(Scanner sc) {
        int n = 0;
        boolean entero = false;
            while (!entero) {
                try { 
                    n = sc.nextInt();
                    entero = true;
                } catch (InputMismatchException e) {
                    System.out.println("Error: el valor no es válido");
                    System.out.println("Intentelo de nuevo");
                    sc.nextLine(); //limpiar buffer
                }
            }
        return n;
    }
}
