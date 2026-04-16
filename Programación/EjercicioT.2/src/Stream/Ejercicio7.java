
package Stream;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    //pedir numeros a introducir
        System.out.println("Introduzca un número: ");
            int cantidad = sc.nextInt();
            
            int[] numero = new int[cantidad];
            
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Introduzca el número" + (i + 1));
            numero[i] = sc.nextInt();
        }
        System.out.println("Los números en orden inverso: ");
        for (int i = cantidad - 1; i >= 0; i--) {
            System.out.println(numero[i]);
        }
    }
}
    

