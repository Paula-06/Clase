
/* Crea un programa que analice un texto tecleado por el usuario. El programa debe: contar el número
de palabras totales en el texto, identificar la palabra más larga y la más corta.*/
package Stream;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
    //Pedir por teclado
    Scanner sc = new Scanner(System.in);
        
            
    //Pedir frase y crear variable 
    System.out.println("Escriba una frase: ");
        String frase = sc.nextLine();
   
    //Usamos split(" ") para dividir el texto por espacios.
    String [] palabras = frase.split(" ");
    
    //Identificar variables contador y palabras
    int PalabrasTotal = palabras.length;
    String PalabraLarga = palabras[0];
    String PalabraCorta = palabras[0];
    
    //Comparar las palabras
    for (String palabra : palabras) {
        if (palabra.length() > PalabraLarga.length()) {
           PalabraLarga = palabra;
        }
        if (palabra.length() < PalabraCorta.length()) {
            PalabraCorta = palabra;
        }
    }
    //Mostrar los resultados
    System.out.println("Número total de palabras: " + PalabrasTotal);
    System.out.println("Palabra más larga: " + PalabraLarga);
    System.out.println("Palabra más corta: " + PalabraCorta);

    }
    
}
