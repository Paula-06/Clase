
package Funciones10;
import java.util.Scanner;

public class Ejercicio4 {

 

    static int maximo(int a, int b) {
        int max;
        if (a > b) { // si a es mayor que b
            max = a;
        } else { // si b es igual o mayor que a
            max = b;
        }
        return max; // devuelve el valor de la variable max
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int a = sc.nextInt();
        System.out.print("Introduce otro número: ");
        int b = sc.nextInt();
        System.out.println("El número mayor es: " + maximo(a, b));
    }
}
