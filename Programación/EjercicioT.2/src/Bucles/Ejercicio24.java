
package Bucles;

import java.util.Random;

public class Ejercicio24 {
   public static void main(String[] args) {
    Random rand = new Random();
        int contador = 0; 
        int enLinea = 0;  

        while (true) {
            int valor = rand.nextInt(30) + 1; 
            if (valor >= 10 && valor <= 20) {
            
                if (valor == 15) {
                    System.out.println("\n\n¡Valor prohibido 15 obtenido! Fin del programa.");
                    System.out.println("Total de números impresos: " + contador);
                    break;
                }
                continue; 
            }
            System.out.print(valor + "\t");
            contador++;
            enLinea++;

            if (enLinea == 5) {
                System.out.println();
                enLinea = 0;
            }
        } 
    }
}
