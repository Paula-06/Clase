
package Arrays;

public class ejercicio12Dani {
    static int[] rellenarPares(int longitud, int fin) {
        //crear tabla
        int[] tabla = new int[longitud];
        
        //rellenar Arrays de numeros al azar
        for (int i = 0; i < longitud; i++) {
            int numero = 0;
            do {
                numero = (int)(Math.random()*longitud - 1) + 2;
            } while (numero % 2 != 0);
            tabla[i] = numero;
        } return tabla;
    }
    
    
    public static void main(String[] args) {
        //Variables
        int longitud = 10;
        int fin = 30;
        
        rellenarPares(longitud, fin);//Llamar función
        
        System.out.println("Tabla de los pares: ");
        for (int num : rellenarPares(longitud, fin)) {
            System.out.println(num + " ");
        }
    }
}
