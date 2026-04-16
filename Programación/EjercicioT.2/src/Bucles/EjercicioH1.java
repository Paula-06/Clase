
package Bucles;

import java.util.Scanner;

public class EjercicioH1 {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
System.out.print("Introduce un número entero positivo (o un número negativo para salir): ");
      int numero = scanner.nextInt();

while (numero >= 0) {
            int i = 1;
            int suma = 0;
    while (i <= numero) {
        if (i % 2 == 0) {
            suma = suma + i;
        }
        i++;                                
    }
    System.out.println("La suma de los números pares desde 0 hasta " + numero + " es: " + suma);
    System.out.print("Introduce un número entero positivo (o un número negativo para salir): ");
    numero = scanner.nextInt();
}
System.out.println("Has introducido un número negativo. El programa ha finalizado.");
    }
}


