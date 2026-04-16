
package Funciones;
import java.util.Scanner;

public class EjercicioH18 {
 public static double calcularTotal() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántos precios vas a introducir? ");
        int cantidad = scanner.nextInt();

        double total = 0.0;

        for (int i = 1; i <= cantidad; i++) {
            double precio;
            do {
                System.out.print("Introduce el precio " + i + ": ");
                precio = scanner.nextDouble();

                if (precio < 0) {
                    System.out.println("Precio inválido. Intenta de nuevo.");
                }
            } while (precio < 0);

            total += precio;
        }

        return total;
    }
    // Función que aplica descuento si el total supera los 100 euros
    public static double aplicarDescuento(double total) {
        if (total > 100) {
            return total * 0.90; // Aplica 10% de descuento
        } else {
            return total; // No hay descuento
        }
    }

    public static void main(String[] args) {
        double totalSinDescuento = calcularTotal();
        double totalConDescuento = aplicarDescuento(totalSinDescuento);

        System.out.printf("\nEl total sin descuento es: %.2f euros\n", totalSinDescuento);

        if (totalSinDescuento > 100) {
            System.out.println("Se aplicó un descuento del 10%.");
            System.out.printf("El total con descuento es: %.2f euros\n", totalConDescuento);
        } else {
            System.out.println("No se aplicó ningún descuento.");
        }
    }
}