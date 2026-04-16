
package Arrays;

import java.util.Arrays;

//Crea tres tablas de cinco elementos: la primera de enteros, la segunda de double y la tercera de booleanos. Muestra las referencias en las que se encuentra cada una de las tablas anteriores.

public class Ejercicio1 {
    public static void main(String[] args) {    
        //declarar variables y crear tablas
    int primera[] = new int[5];
    double segunda[] = new double[5];
    boolean tercera[] = new boolean[5];
        //enteros
        primera[0] = 1;
        primera[1] = 2;
        primera[2] = 3;
        primera[3] = 4;
        primera[4] = 5;
        
        //decimales
        segunda[0] = 1.1;
        segunda[1] = 2.2;
        segunda[2] = 3.3;
        segunda[3] = 4.4;
        segunda[4] = 5.5;
        
        //boolean 
        tercera[0] = true;
        tercera[1] = false;
        tercera[2] = true;
        tercera[3] = false;
        tercera[4] = true;

        //resultados
        System.out.println(Arrays.toString(primera));
        System.out.println(Arrays.toString(segunda));
        System.out.println(Arrays.toString(tercera));

    }
    
}
