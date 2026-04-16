
package Funciones;

import java.util.Random;

public class ejercicio18 {
    
 public static void mostrarNumerosAleatorios(int cantidad, int minimo, int maximo) {
        Random random = new Random();

        System.out.println("Números aleatorios generados:");
        for (int i = 0; i < cantidad; i++) {
            int numero = random.nextInt(maximo - minimo + 1) + minimo;
            System.out.println(numero);
        }

        // Mostrar los parámetros al final
        System.out.println("\nResumen:");
        System.out.println("Cantidad de números: " + cantidad);
        System.out.println("Valor mínimo: " + minimo);
        System.out.println("Valor máximo: " + maximo);
    }

    public static void main(String[] args) {
        // Puedes cambiar estos valores para probar
        int cantidad = (int)(Math.random() * 100);
        int minimo = (int)(Math.random() * 100);
        int maximo = (int)(Math.random() * 100);

        mostrarNumerosAleatorios(cantidad, minimo, maximo);
    }
}
