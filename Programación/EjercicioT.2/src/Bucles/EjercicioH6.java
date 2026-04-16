package Bucles;

import java.util.Random;

public class EjercicioH6 {
    public static void main(String[] args) {
     Random rand = new Random();
        int valorProhibido = rand.nextInt(6) + 1; // Valor entre 1 y 6
        int tiradas = 0;
        int ganancias = 0;
        int dado;

        System.out.println("¡Comienza el juego!");
        System.out.println("El valor prohibido ha sido elegido (secreto).");

        while (true) {
            dado = rand.nextInt(6) + 1; // Tirada del dado (1 a 6)

            if (dado == valorProhibido) {
                System.out.println("\n¡Ha salido el valor prohibido (" + valorProhibido + ")!");
                break;
            }

            System.out.println("Tirada " + (tiradas + 1) + ": " + dado);
            ganancias += dado;
            tiradas++;
        }

        System.out.println("\nResumen de la partida:");
        System.out.println("Tiradas realizadas: " + tiradas);
        System.out.println("Ganancias acumuladas: " + ganancias);
    }
    
}
