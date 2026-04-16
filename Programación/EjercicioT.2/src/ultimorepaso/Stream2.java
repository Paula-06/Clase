
package ultimorepaso;

import java.util.Scanner;

public class Stream2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    //Pedir palabra
        System.out.println("Escriba una palabra: ");
        String palabra = sc.nextLine();
        
    //Pedir caracter
        System.out.println("Escriba un carácter de esa palabra: ");
        char letra = sc.next().charAt(0);
    
    //Crear contador
    int contador = 0;
    
    //Recorrer palabra
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == letra) {
                contador++;
            }
        }
    //Enseñar por pantalla
        System.out.println("La letra '" +letra+"' aparece " +contador+ " veces" );
    }
    
}
