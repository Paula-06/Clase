
package javaapplication2;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Introduzca un número: ");
            int n = leerNumero(sc);//El numero es válido
            System.out.println("El factorial de " + n + " es " + factorial(n));
    }
    static int leerNumero(Scanner sc) {
        int n = 0;
        boolean valido = false;
            while (!valido) {
                try { 
                    n = sc.nextInt();
                    if (n < 0) {
                       throw new  IllegalArgumentException("Introduzca un número");
                    }
                valido = true;
                } catch (IllegalArgumentException e) {
                    System.out.println("El número debe ser positivo");
                    System.out.println("Intentelo de nuevo");
                    sc.nextLine(); //limpiar buffer
                }
            }
        return n;
    }
    public static long factorial(int n) {
        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        } 
        return resultado;
    } 
}
