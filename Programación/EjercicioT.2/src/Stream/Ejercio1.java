
package Stream;
/*Escribir un programa Java que cree un array de 10 elementos tipo char y lo llene con 10 letras,
mezclando mayúsculas y minúsculas. Mostrar el contenido del array primero todo en mayúsculas y
después todo en minúsculas.*/

public class Ejercio1 {
    public static void main(String[] args) {
    // Crear un array de 10 caracteres
        char[] letras = new char[10];

        // Llenarlo con letras mezclando mayúsculas y minúsculas
        letras[0] = 'a';
        letras[1] = 'B';
        letras[2] = 'c';
        letras[3] = 'D';
        letras[4] = 'e';
        letras[5] = 'F';
        letras[6] = 'g';
        letras[7] = 'H';
        letras[8] = 'i';
        letras[9] = 'J';

        // Mostrar el array en mayúsculas
        System.out.println("Array en MAYÚSCULAS:");
        for (char c : letras) {
            System.out.print(Character.toUpperCase(c) + " ");
        }

        System.out.println("\n\nArray en minúsculas:");
        // Mostrar el array en minúsculas
        for (char c : letras) {
            System.out.print(Character.toLowerCase(c) + " ");
        }
    } 
}
