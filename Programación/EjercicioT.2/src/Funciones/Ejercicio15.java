
package Funciones;

import java.util.Scanner;
public class Ejercicio15 {
    public static int sumaDigitos(int n) {
        // Caso base: si el número es menor que 10, simplemente lo devolvemos
        if (n < 10) {
            return n;
        } else {
            // Paso recursivo: sumamos el último dígito con la suma de los demás
            return (n % 10) + sumaDigitos(n / 10);
        }
    }

    public static void main(String[] args) {
        int numero = 12345;
        System.out.println("La suma de los dígitos de " + numero + " es: " + sumaDigitos(numero));
    }
}
