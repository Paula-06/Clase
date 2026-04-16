
package Bucles;

public class Ejercicio23 {
        public static void main(String[] args) {
            for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; 
            }
            System.out.println("Tabla del " + i + ":");
            for (int j = 1; j <= 10; j++) {
                int resultado = i * j;
                if (resultado % 2 != 0) {
                    continue; 
                }
                System.out.println(i + " x " + j + " = " + resultado);
            }

            System.out.println(); 
        }
    }
    
}
