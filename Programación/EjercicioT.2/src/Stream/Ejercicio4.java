
package Stream;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
 // 1. Pedir cantidad de números
        System.out.print("Introduce la cantidad de números (n): ");
        int n = sc.nextInt();

        // 2. Crear array para guardar los números
        int[] numeros = new int[n];

        // 3. Leer los números y almacenarlos en el array
        for (int i = 0; i < n; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        // 4. Inicializar acumuladores y contadores
        int sumaPositivos = 0, sumaNegativos = 0;
        int cuentaPositivos = 0, cuentaNegativos = 0, cuentaCeros = 0;

        // 5. Recorrer el array para clasificar
        for (int num : numeros) {
            if (num > 0) {
                sumaPositivos += num;
                cuentaPositivos++;
            } else if (num < 0) {
                sumaNegativos += num;
                cuentaNegativos++;
            } else {
                cuentaCeros++;
            }
        }

        // 6. Calcular medias
        double mediaPositivos = cuentaPositivos > 0 ? (double) sumaPositivos / cuentaPositivos : 0;
        double mediaNegativos = cuentaNegativos > 0 ? (double) sumaNegativos / cuentaNegativos : 0;

        // 7. Mostrar resultados
        System.out.println("\nNúmeros introducidos: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }

        System.out.println("\nMedia de positivos: " + mediaPositivos);
        System.out.println("Media de negativos: " + mediaNegativos);
        System.out.println("Cantidad de ceros: " + cuentaCeros);
    }
}
    

