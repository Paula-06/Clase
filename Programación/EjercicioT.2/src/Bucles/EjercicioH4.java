package Bucles;
import java.util.Scanner;

public class EjercicioH4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = -1; 

        while (opcion != 0) {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Suma de dos números");
            System.out.println("2. Resta de dos números");
            System.out.println("3. Multiplicación de dos números");
            System.out.println("4. Salir");
            System.out.print("Elige una opción (1-4): ");
            opcion = sc.nextInt();

            if (opcion == 4) {
                System.out.println("¡El programa ha finalizado!");
                break;
            }

            System.out.print("Introduce el primer número: ");
            int num1 = sc.nextInt();
            System.out.print("Introduce el segundo número: ");
            int num2 = sc.nextInt();

            switch (opcion) {
                case 1 -> System.out.println("Resultado: " + (num1 + num2));
                case 2 -> System.out.println("Resultado: " + (num1 - num2));
                case 3 -> System.out.println("Resultado: " + (num1 * num2));
                default -> System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }
    }
}
