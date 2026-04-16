
package Funciones;

   import java.util.*;

public class Ejercicio19 {


    // Versión sobrecargada: solo cantidad, números reales entre 0 y 1
    public static void mostrarNumerosAleatorios(int cantidad) {
        Random random = new Random();

        System.out.println("Números aleatorios reales entre 0 y 1:");
        for (int i = 0; i < cantidad; i++) {
            double numero = random.nextDouble(); // entre 0.0 y 1.0
            System.out.println(numero);
        }

        System.out.println("\nResumen:");
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Rango fijo: de 0.0 a 1.0");
    }

    public static void main(String[] args) {
        // Ejemplo: mostrar 5 números reales entre 0 y 1
        mostrarNumerosAleatorios(5);
    }
}