
package Stream;

import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);
        String frase = leerFrase(scanner);

        int posicionInicio = leerPosicionSimple(scanner, frase.length(),
                "Introduce la posici�n inicial desde donde extraer el resto de la frase");
        mostrarRestoFrase(frase, posicionInicio);

        int[] posiciones = leerRango(scanner, frase.length());
        mostrarSegmento(frase, posiciones[0], posiciones[1]);

        scanner.close();
    }

    // -------------------- M�TODOS AUXILIARES --------------------

    /** Lee una frase completa del usuario */
    public static String leerFrase(Scanner sc) {
        System.out.println("Por favor, ingresa una frase:");
        return sc.nextLine();
    }

    /** Lee una posici�n v�lida dentro de la longitud de la frase */
    public static int leerPosicionSimple(Scanner sc, int longitud, String mensaje) {
        int pos;
        while (true) {
            System.out.println(mensaje + " (entre 0 y " + (longitud - 1) + "):");
            pos = sc.nextInt();

            if (pos >= 0 && pos < longitud) {
                sc.nextLine(); // limpiar salto de l�nea
                return pos;
            }

            System.out.println("Error: posici�n fuera de rango. Intenta de nuevo.");
        }
    }

    /** Lee un rango [inicio, fin) v�lido para substring */
    public static int[] leerRango(Scanner sc, int longitud) {
        int inicio, fin;

        while (true) {
            System.out.println("Introduce la posici�n inicial del segmento:");
            inicio = sc.nextInt();

            System.out.println("Introduce la posici�n final del segmento:");
            fin = sc.nextInt();

            if (inicio >= 0 && fin >= 0 &&
                inicio < longitud && fin <= longitud &&
                inicio < fin) 
            {
                sc.nextLine(); // limpiar salto
                return new int[]{inicio, fin};
            }

            System.out.println("Error: rango inv�lido. Recuerda:");
            System.out.println("- Ambos valores deben estar entre 0 y " + longitud);
            System.out.println("- El inicio debe ser menor que el fin.");
        }
    }

    /** Muestra el resto de la frase desde una posici�n */
    public static void mostrarRestoFrase(String frase, int inicio) {
        String resto = frase.substring(inicio);
        System.out.println("El resto de la frase desde la posici�n " + inicio + ": \"" + resto + "\"");
    }

    /** Muestra un segmento v�lido de la frase */
    public static void mostrarSegmento(String frase, int inicio, int fin) {
        String segmento = frase.substring(inicio, fin);
        System.out.println("El segmento desde la posici�n " + inicio +
                " hasta " + fin + ": \"" + segmento + "\"");
    }
    
}
