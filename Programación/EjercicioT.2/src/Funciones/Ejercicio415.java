
package Funciones;

import java.util.Scanner;

public class Ejercicio415 {   
  public static int diferenciaMin(int hora1, int minuto1, int hora2, int minuto2) {
    int totalMin1 = hora1 * 60 + minuto1;
    int totalMin2 = hora2 * 60 + minuto2;
    return Math.abs(totalMin1 - totalMin2);
}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la primera hora: ");
        int h1 = sc.nextInt();
        System.out.print("Introduce los minutos: ");
        int m1 = sc.nextInt();

        System.out.print("Introduce la segunda hora: ");
        int h2 = sc.nextInt();
        System.out.print("Introduce los minutos: ");
        int m2 = sc.nextInt();

        int diferencia = diferenciaMin(h1, m1, h2, m2);
        System.out.println("Diferencia en minutos: " + diferencia);
    }
}
