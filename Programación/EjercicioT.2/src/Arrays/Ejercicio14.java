
package Arrays;

import java.util.Arrays;
import java.util.Scanner;


public class Ejercicio14 {
    static int primitiva(int apuesta[], int[] combinacionGanadora) {
        int aciertos = 0; //contador de aciertos
        for (int a: apuesta) { // recorremos la tabla de apuesta
             //aprovechamos que la tabla con la combinación está ordenada
            if (Arrays.binarySearch(combinacionGanadora, a) >= 0) { //si está 
                aciertos++;//hemos acertado un número más
            }
        }
        return (aciertos);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] apuesta = new int[6];
        int[] combinacionGanadora = {3, 7, 15, 22, 34, 42}; // ejemplo (ordenada)

        // Pedimos al usuario su apuesta
        System.out.println("Introduce tus 6 números para la primitiva:");
        for (int i = 0; i < apuesta.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            apuesta[i] = sc.nextInt();
        }

        // Mostramos la combinación ganadora
        System.out.println("\nCombinación ganadora: " + Arrays.toString(combinacionGanadora));

        // Llamamos a la función
        int aciertos = primitiva(apuesta, combinacionGanadora);

        // Mostramos resultado
        System.out.println("Has obtenido " + aciertos + " aciertos.");
    }
     
}