
import java.util.Arrays;
import  java.util.Scanner;

public class Ejercicio6 {        
   static int[] leeFavoritos() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cuántos números favoritos tiene: ");
        int n = sc.nextInt();

        int[] t = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Número favorito " + (i + 1) + ": ");
            t[i] = sc.nextInt();
        }

        Arrays.sort(t);
        return t;
    }

    // -----------------------------------------------------
    // calculaNumSuerte
    // -----------------------------------------------------
    static int calculaNumSuerte(int[] numerosFavoritos) {

        int[] t = Arrays.copyOf(numerosFavoritos, numerosFavoritos.length);

        while (t.length > 1) {
            // tomar dos primeros (los menores)
            int a = t[0];
            int b = t[1];

            // eliminar los dos números
            t = borrar(t, 0);
            t = borrar(t, 0);

            // insertar la media
            int media = (a + b) / 2;

            t = insertarOrdenado(t, media);

            // imprimir la lista en cada paso
            System.out.println(Arrays.toString(t));
        }

        return t[0];
    }

    // -----------------------------------------------------
    // borrar
    // -----------------------------------------------------
    static int[] borrar(int[] t, int indice) {
        int[] nuevo = new int[t.length - 1];

        // copiar antes del índice
        if (indice > 0) {
            System.arraycopy(t, 0, nuevo, 0, indice);
        }
        // copiar después del índice
        if (indice < t.length - 1) {
            System.arraycopy(t, indice + 1, nuevo, indice, t.length - indice - 1);
        }

        return nuevo;
    }

    // -----------------------------------------------------
    // insertarOrdenado
    // -----------------------------------------------------
    static int[] insertarOrdenado(int[] t, int nuevo) {

        int pos = Arrays.binarySearch(t, nuevo);

        // si es negativo: convierte a índice de inserción
        if (pos < 0) pos = -pos - 1;

        int[] nuevoArray = new int[t.length + 1];

        // copiar antes de pos
        System.arraycopy(t, 0, nuevoArray, 0, pos);

        // insertar el nuevo
        nuevoArray[pos] = nuevo;

        // copiar después de pos
        System.arraycopy(t, pos, nuevoArray, pos + 1, t.length - pos);

        return nuevoArray;
    }

    // -----------------------------------------------------
    // main
    // -----------------------------------------------------
    public static void main(String[] args) {

        int[] favoritos = leeFavoritos();

        System.out.println(Arrays.toString(favoritos));

        int suerte = calculaNumSuerte(favoritos);

        System.out.println("Su número de la suerte es: " + suerte);
    }
    
}
    

