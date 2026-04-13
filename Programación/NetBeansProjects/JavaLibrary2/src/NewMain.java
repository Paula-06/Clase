
import java.util.Scanner;
public class NewMain {    

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
}
