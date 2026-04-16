
package EjerciciosTry;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int edad;
        boolean valido = false;
        while (!valido) {
            try {
                System.out.print("Introduce un número entero: ");
                edad = sc.nextInt();
                System.out.println("La edad " + edad + " es correcta ");
                valido = true;
            } catch (InputMismatchException e) {
                System.err.println("Error: el valor introducido no es un número entero.");
                sc.nextLine(); // limpiar el buffer
            }  
        } sc.close(); // cerrar el Scanner solo cuando ya no se va a usar
    }       
}


