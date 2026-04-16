
package Funciones10;

import java.util.Scanner;

public class Ejercicio2 { 
    static void mostrar(int a, int b) {
        int mayor = a > b ? a :b;
        int menor = a < b ? a :b;
        for (int i = menor; i <= mayor; i++) {
            System.out.println(i);
        }
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Escriba el primer numero: ");
        int a = sc.nextInt();
    System.out.println("Escriba el segundo numero: ");
        int b = sc.nextInt();
    mostrar(a, b);
    }    
}
