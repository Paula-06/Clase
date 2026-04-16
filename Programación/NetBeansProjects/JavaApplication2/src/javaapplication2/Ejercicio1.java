
package javaapplication2;

import java.util.Scanner;

public class Ejercicio1 {
 public static int[] primosHastaN(int n) {
        // Primero contamos cuántos primos hay
        int contador = 0;
        for (int i = 2; i <= n; i++) {
            boolean primo = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) contador++;
        }

        // Creamos el arreglo con el tamaño exacto
        int[] primos = new int[contador];
        int indice = 0;

        // Volvemos a recorrer y guardamos los primos
        for (int i = 2; i <= n; i++) {
            boolean primo = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                primos[indice] = i;
                indice++;
            }
        }

        return primos;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número entero: ");
        int n = sc.nextInt();
        int[] primos = primosHastaN(n);

        System.out.println("Números primos hasta " + n + ":");
        for (int p : primos) {
            System.out.print(p + " ");
        }
    }
}