
package Stream;

/*Escribe un programa que lea una cadena de texto y un carácter del teclado. El programa debe
contar cuántas veces aparece el carácter en la cadena.*/

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
     // Leer cadena
        System.out.print("Cadena: ");
        String texto = sc.nextLine();

        // Leer carácter
        System.out.print("Carácter: ");
        char caracter = sc.next().charAt(0);

        int contador = 0;

        // Contar cuántas veces aparece el carácter
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == caracter) {
                contador++;
            }
        }

        // Mostrar el resultado
        System.out.println("El carácter '" + caracter + "' aparece " + contador + " veces.");
    }
    
}
