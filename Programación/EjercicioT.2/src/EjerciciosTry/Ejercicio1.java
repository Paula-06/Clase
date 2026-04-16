
package EjerciciosTry;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
 System.out.print("Introduce el primer número entero: ");
        int n1 = leerNumero(sc);
        System.out.print("Introduce el segundo número entero: ");
        int n2 = leerNumero(sc);
        int suma = n1 + n2;
        System.out.println("La suma de " + n1 + " + " + n2 + " es: " + suma);

    }
    
    static int leerNumero(Scanner sc) {
    int n = 0;
    boolean entero = false;
        while (!entero) {
            try {
                n = sc.nextInt();
                entero = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: debes introducir un número entero.");
                System.out.println("Intenta de nuevo:");
                sc.nextLine(); //limpiar buffer
            }
        }
        return n; 
   }
}
    
