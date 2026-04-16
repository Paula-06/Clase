
package Stream;

import java.util.Scanner;
/*Escribe un programa que solicite al usuario un texto que contenga varias palabras separadas por
espacios. Extraiga la primera y última palabra usando el método substring(). Cambia la primera letra
de cada palabra extraída a mayúscula utilizando una combinación de substring() y toUpperCase().*/

public class Ejercicio10 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    //Pedir texto al usuario
        System.out.println("Introduzca una frase: ");
        String frase = sc.nextLine();
        
        //Índices de los espacios
        int espacioP = frase.indexOf(" ");
        int espacioU = frase.lastIndexOf(" ");
        
        //Extraer la primera y segunda
        String primera = frase.substring(0, espacioP);
        String ultima = frase.substring(espacioU + 1);
        
        //Poner la primera letra en mayúsculas
        primera = primera.substring(0,1).toUpperCase() + primera.substring(1);
        ultima = ultima.substring(0,1).toUpperCase() + ultima.substring(1);
        
        //Mostrar resultado
        System.out.println("La primera palabra es: " + primera);
        System.out.println("La ultima palabra es: " + ultima);
        
        
    }
    
}
