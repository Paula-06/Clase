
package Arrays;

//Construye una tabla de 10 elementos del tipo que desees. Declara diferentes variables de tabla que referenciarán la tabla creada. Comprueba, imprimiendo por pantalla, que todas las variables contienen la misma referencia.

import java.util.Arrays;


public class Ejercicio2 {

    public static void main(String[] args) {
        int num[] = new int[10]; //creamos la tabla
        
       // 2. Crear diferentes variables que referencien a la misma tabla
        int[] a = num;
        int[] b = num;
        int[] c = num;

        // 3. Comprobar por pantalla que todas contienen la misma referencia
        System.out.println("Referencia de tabla: " + Arrays.toString(num));
        System.out.println("Referencia de a:     " + Arrays.toString(a));
        System.out.println("Referencia de b:     " + Arrays.toString(b));
        System.out.println("Referencia de c:     " + Arrays.toString(c));
        
    }
    
}
