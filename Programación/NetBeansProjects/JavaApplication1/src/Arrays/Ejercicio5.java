
package Arrays;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //Variables de contadores y medias 
    int sumaP = 0, sumaN = 0;
    int contadorP = 0, contadorN = 0;
    int contadorCeros = 0;
    
    //Solicitar numeros a introducir
        System.out.println("Introduzca un número: ");
        int n = sc.nextInt();
        
    //Arrays para guardar los números
        int num[] = new int[n];
        
        //solicitar los x numeros
        for (int i = 0; i < n; i++) {
            System.out.println("Introduzca el número " +(i + 1 ));
            num[i] = sc.nextInt();
        }
        
        //Contador Positivos, negativos y ceros
        
        for (int numero : num) {
            if (numero > 0) {
                sumaP += numero;                
            } else if (numero < 0) {
                sumaN += numero;                
            } else {
                contadorCeros++;
            }    
        }
        
        //Medias
        int mediaP = sumaP/n;
        int mediaN = sumaN/n;
        
        //Enseñar 
        System.out.println("media positivos " + mediaP);
    }
    
}
