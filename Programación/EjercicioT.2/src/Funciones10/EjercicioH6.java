
package Funciones10;

import java.util.Scanner;

public class EjercicioH6 {

    static int escribeMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nCALCULADORA BÁSICA NÚMEROS REALES");
        System.out.println("Menú de operaciones:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Salir del programa");
        System.out.print("Elige una opción: ");
        return sc.nextInt();
    }

    static double suma(double a, double b) {
        return a + b;
    }

    static double resta(double a, double b) {
        return a - b;
    }

    static double multiplicacion(double a, double b) {
        return a * b;
    }

    static double division(double a, double b) {
        if (b == 0) {
            System.out.println("Error: División por cero.");
            return 0;
        }
        return a / b;
    }

    static double calculadora(double a, double b, int operacion) {
        switch (operacion) {
            case 1: return suma(a, b);
            case 2: return resta(a, b);
            case 3: return multiplicacion(a, b);
            case 4: return division(a, b);
            default: return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            opcion = escribeMenu();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Introduce el primer número: ");
                double a = sc.nextDouble();
                System.out.print("Introduce el segundo número: ");
                double b = sc.nextDouble();
 
                double resultado = calculadora(a, b, opcion);
                System.out.println("Resultado: " + resultado);
            } else if (opcion == 5) {
                System.out.println("FIN DEL PROGRAMA");
            } else {
                System.out.println("OPCIÓN NO VÁLIDA");
            }

        } while (opcion != 5);
    }
}

