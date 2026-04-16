
package Funciones;

import java.util.Scanner;

public class Ejercicio12 {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce x1: ");
        double x1 = scanner.nextDouble();

        System.out.print("Introduce y1: ");
        double y1 = scanner.nextDouble();

        System.out.print("Introduce x2: ");
        double x2 = scanner.nextDouble();

        System.out.print("Introduce y2: ");
        double y2 = scanner.nextDouble();

        double resultado = distancia(x1, y1, x2, y2);
        System.out.println("La distancia entre los puntos es: " + resultado);

        scanner.close();
    }

    static double distancia(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }
}
