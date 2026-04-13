
package Arrays;

import java.util.Arrays;

public class Ejercicio18 {
    public static void main(String[] args) {
    //Crear variables de tablas
    int[] tabla = {1, 22, 45, 67, 89, 98};
    int[] pares = new int[0];//vacío
    int[] impares = new int[0];//vacío
    
    //clasificar en pares o impares
    for (int num : tabla) {
        if (num % 2 == 0) {
            pares = Arrays.copyOf(pares, pares.length + 1);
            pares[pares.length - 1] = num;
        } else {
            impares = Arrays.copyOf(impares, impares.length + 1);
            impares[impares.length - 1] = num;
        }   
    }
    Arrays.sort(pares);
    Arrays.sort(impares);
    
        System.out.println("Tabla de números: " + Arrays.toString(tabla));
        System.out.println("Los números pares son: " + Arrays.toString(pares));
        System.out.println("Los números impares son: " + Arrays.toString(impares));
    }
    
}
