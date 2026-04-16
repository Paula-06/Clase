package Stream;

/*Crear una clase que defina un array de enteros de 25 elementos y lo rellene con el valor de cada
una de las posiciones [0..24].*/

public class Ejercicio8 {
    public static void main(String[] args) {
    //Crear arrays de 25
    int tabla[] = new int[25];
    
    //Rellenar valores
        for (int i = 0; i < 25; i++) {
           tabla[i] = i;
        }
        
        //Contenido
        System.out.println("Los valores de 25 elementos son de: ");
        for (int num : tabla) {
            System.out.println(num + " ");
        }
    }
    
}
