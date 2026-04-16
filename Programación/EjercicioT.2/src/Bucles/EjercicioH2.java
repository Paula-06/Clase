
package Bucles;

import java.util.Scanner;

public class EjercicioH2 {

    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Introduce un número entero positivo: ");
            numero = sc.nextInt();
        } while (numero < 0);

        while (numero >= 0) {
            System.out.println(numero);
            numero--;
        }

        System.out.println("¡Despegue!");
    }
}