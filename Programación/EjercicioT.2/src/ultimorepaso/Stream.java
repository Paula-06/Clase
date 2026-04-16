
package ultimorepaso;

import java.util.Scanner;

public class Stream {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //Pedir por teclado la palabra
        System.out.println("Introduzca una palabra: ");
        String palabra = sc.nextLine();
        
    //Definir vocales y crear contadores
        String vocales = "aeiouAEIOU";
        int contVoca = 0;
        int contCon = 0;
        
    //Recoger palabra
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            if (Character.isLetter(letra)) {
                if (vocales.indexOf(letra) != -1) {
                    contVoca++;
                } else {
                    contCon++;
                }
            }
        }
        //Enseñar
        System.out.println("La palabra tiene " + contVoca + " vocales y " + contCon + " consonantes");
    
    }
    
}
