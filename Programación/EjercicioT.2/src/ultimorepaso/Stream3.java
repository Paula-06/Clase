
package ultimorepaso;

import java.util.Scanner;

public class Stream3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    //Pedir por teclado
        System.out.println("Introduzca una frase: ");
        String frase = sc.nextLine();
    
        //longitud de la frase
        int longitud = frase.length();
        System.out.println("Longitud de la frase: " + longitud);
        
        //posiciones 
        int posicion;
        
        //pedir hasta que el resultado de la posicion sea valido
        while (true) {
            System.out.println("Introduzca la posicion inicial: " + (longitud - 1) );
            posicion = sc.nextInt();
            if (posicion >= 0 && posicion < longitud) {
                break;
            } else {
                System.out.println("Posicion no válida. Pruebe de nuevo: ");
            }
        }
        String resto = frase.substring(posicion);
        System.out.println("Desde la posición \" + posicion + \" hasta el final:" + resto);
        
        //entre inicio y fin
        int inicio, fin;
        while (true) {
            System.out.println("Escriba la posicion inicial: ");
                inicio = sc.nextInt();
            System.out.println("Escriba la posicion final: ");
                fin = sc.nextInt();
            if (inicio >= 0 && fin <= longitud && inicio < fin) {
                break;
            } else {
                System.out.println("Rango no válido");
            }
        } 
        String segmento = frase.substring(inicio, fin);
        System.out.println("Segmento entre posiciones " + inicio + " y " + fin + ": " + segmento);    
    }
    
}
