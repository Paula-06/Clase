package Bucles;

import java.util.Scanner;
public class EjercicioH3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menú de opciones:");
        System.out.println("1. Sumar.");
        System.out.println("2. Restar.");
        System.out.println("3. Multiplicar.");
        
        
         System.out.print("Introduce el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = sc.nextInt();

        System.out.print("Elige una opción (1-3): ");
        int opcion = sc.nextInt();

     switch (opcion) {
            case 1 -> System.out.println("Resultado: " + (num1 + num2));
            case 2 -> System.out.println("Resultado: " + (num1 - num2));
            case 3 -> System.out.println("Resultado: " + (num1 * num2));
            default -> System.out.println("Opción no válida. Finalizando programa.");
        }
    }
}
    
        
    
  