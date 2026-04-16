
package Funciones10;

import java.util.Scanner;

public class Ejercicio1 {  
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        int n = sc.nextInt();
        System.out.println("--Antes de llamar a la función--");
        eco(n);
        System.out.println("--Despues de llamar a la función--");
    }
        static void eco(int a) {
            for (int i = 0; i < a; i++) {
                System.out.println("Eco...");
            
        }
    }    
}
