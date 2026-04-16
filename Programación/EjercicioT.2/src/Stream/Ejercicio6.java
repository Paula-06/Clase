
package Stream;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    //Crear arrays
    double num[] = new double[5];
    
        //leer númerps decimales
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce 5 números con decimales " +(i + 1) + " : ");
            num[i] = sc.nextDouble();
        }
        
        //poner en orden
        System.out.println("Los numeros son: ");
        for (double numeros : num ) {
            System.out.println(numeros);
        }
    }
    
}
