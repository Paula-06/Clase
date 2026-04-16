
package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 { 
    public static void main(String[] args) {
    //Pedir por teclado
    Scanner sc = new Scanner(System.in);
    
    //crear array :)
    int tabla[] = new int[6];
    
    //pedir valores
        for (int i = 0; i < 6; i++) {
            System.out.print("Escriba un número: ");
            tabla[i] = sc.nextInt();
        }
        
        System.out.println(Arrays.toString(tabla));
    }
    
}
