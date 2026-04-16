package Stream;

import java.util.Scanner;

/*Escribir un programa que pida al usuario una palabra y cuente cuántas vocales y consonantes
contiene. Mostrar el resultado por pantalla.*/

public class Ejerciio2 {
    public static void main(String[] args) {
    //Leer por teclado
    Scanner sc = new Scanner(System.in);
    
    //Pedir palabra
        System.out.println("Introduzca una palabra: ");
        String palabra = sc.nextLine().toLowerCase();//covertir a minúscula
        
        int vocales = 0;
        int consonantes = 0;
        
        for (int i = 0; i < palabra.length(); i++) {
            char c = palabra.charAt(i);
       
        //Contar letras
            if (Character.isLetter(c)) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vocales++;
                } else {
                    consonantes++;
                }
            }
        }
        System.out.println("Número de vocales: " + vocales);
        System.out.println("Número de consonantes " + consonantes);       
    }
    
}
