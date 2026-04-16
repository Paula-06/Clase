
package javaapplication2;

import java.util.Scanner;

public class ejercicio1part2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      // Pedimos al usuario que ingrese un número entero positivo
        System.out.println("Introduzca un número entero: ");
            int n = sc.nextInt();
        System.out.println("Número primos hasta " + n+ ":");
        
     // Recorremos todos los números desde 2 hasta n
        // (empezamos en 2 porque 0 y 1 no son primos)
        for (int i = 2; i <= n; i++) {
        boolean primo = true; // Suponemos que i es primo hasta probar lo contrario

            // Verificamos si i tiene algún divisor entre 2 y la raíz cuadrada de i
                for (int j = 2; j * j <= i; j++) {
            // Si encontramos un divisor exacto, i no es primo

                if (i % j == 0) {
                    primo = false;
                    break;// Salimos del bucle porque ya sabemos que no es primo
                }
            }
            // Si después de todas las pruebas sigue siendo primo, lo mostramos
            if (primo) {
                System.out.print(i + " ");
            }
        }
    }
}
