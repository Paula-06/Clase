
package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Campeonato {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
         //Crear variables
        int[] puntuacion = new int[5];
        System.out.println("Debe introducir 5 puntuaciones: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Puntuación " + (i +1) + ": ");
            puntuacion[i] = sc.nextInt();
        }

        //Ordenar puntuaciones
        Arrays.sort(puntuacion);
        System.out.println("Las puntiones ordenadas se ven asi: " + Arrays.toString(puntuacion));
    
        //Insertar puntuaciones
        int[] todos = Arrays.copyOf(puntuacion, puntuacion.length);
        while (true) {
            System.out.println("Puntuación de exhibición (o -1 para terminar): ");
            int pun = sc.nextInt();
            if (pun == -1) {
                break;
            }
           
            int[] res = Arrays.copyOf(todos, todos.length + 1);
            int i = todos.length - 1;
            while (i >= 0 && todos[i] > pun) {
                res[i + 1] = todos[i]; // desplazar a la derecha
                i--;
            }
            res[i + 1] = pun; // colocar valor en su posición
            todos = res;    // actualizar referencia

            System.out.println("Lista actual: " + Arrays.toString(todos));
        }
          // 4) Mostrar resultado final
        System.out.println("Todas las puntuaciones ordenadas: " + Arrays.toString(todos));
    }
    
    
}
