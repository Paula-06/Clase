
package Funciones;
import java.util.Scanner;
public class Ejercicio13 {
    public static void Pares(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(2 * i + " ");
        }
        System.out.println(); // Salto de línea al final
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int cantidad;
        System.out.println("Introduzca un numero: ");
        cantidad = sc.nextInt();
        System.out.println("Los primeros " + cantidad + " números pares son:" );
        Pares(cantidad);
    }
}
