
package Arrays;

//Declarar un array de 6 elementos de tipo entero, crearlo e inicializarlo con los valores que nos de el usuario. Una vez relleno, mostrar su contenido en pantalla.

import java.util.Scanner;
        
public class Ejercicio3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);    
    
 // 1. Declarar un array de 6 enteros
        int[] numeros = new int[6];

        // 2. Rellenarlo con valores introducidos por el usuario
        System.out.println("Introduce 6 números enteros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        // 3. Mostrar su contenido
        System.out.println("\nContenido del array:");
        for (int i = 0; i < numeros.length; i++) {
        String[] mumeros = null;
            System.out.println("Posicion" + i + " : " + mumeros[i]);
        
                       
        }        
    }
}
