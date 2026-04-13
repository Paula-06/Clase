
package javaapplication2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un primer número: ");
        int n1 = leerNumero(sc);

        int n2 = 0;
        boolean divisorValido = false;

        while (!divisorValido) {
            System.out.print("Introduzca un segundo número: ");
            n2 = leerNumero(sc);
            try {
                int div = n1 / n2;
                System.out.println(n1 + " / " + n2 + " = " + div);
                divisorValido = true;
            } catch (ArithmeticException e) {
                System.out.println("¡Error! No se puede dividir entre cero. Inténtelo de nuevo.");
            }
        }
    }

    static int leerNumero(Scanner sc) {
        int n = 0;
        boolean valido = false;
        while (!valido) {
            try {
                n = sc.nextInt();
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Introduzca un número entero.");
                sc.nextLine(); // limpiar el buffer
            }
        }
        return n;
    }
}