
package Funciones10;

import java.util.Scanner;
public class Ejercicio9 {


    static int max(int a, int b) {
        int max;
        if (a > b) { 
            max = a;
        } else  { 
            max = b; 
        }
        return max; // devuelve el valor de la variable max
    }
    static int max(int a, int b, int c) {
        int max1 = max(a,b);
        int max = max(max1,c);
        
        return max; // devuelve el valor de la variable max
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int a = sc.nextInt();
        System.out.print("Introduce otro número: ");
        int b = sc.nextInt();
        System.out.println("Introduce otro número: ");
        int c = sc.nextInt();
        System.out.println("El número mayor es: " + max(a, b, c));
    }
}
