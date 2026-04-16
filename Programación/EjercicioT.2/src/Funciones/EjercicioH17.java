
package Funciones;
import java.util.Scanner;

public class EjercicioH17 {

    public static int sumaDigitos(int n) {
        if (n < 10) {
            return n; // Caso base
        } else {
            return (n % 10) + sumaDigitos(n / 10); // Caso recursivo
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número entero: ");
        int numero = sc.nextInt();
        int suma = sumaDigitos(numero);
        System.out.println("La suma de los dígitos de " + numero + " es: " + suma);
        }
    }

