package Ejercicioshoja;

import java.util.Scanner;

public class EjerciciosHoja1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Escribe primer coeficiente: ");
                double num1 = sc.nextInt();
            System.out.println("Escribe segundo coeficiente: ");
                double num2 = sc.nextInt();
            System.out.println("Escribe tercer coeficiente: ");
                double num3 = sc.nextInt();
                double x1, x2, d;
        d = ( num2 * num2 - 4 * num1 * num3);
        if (d < 0) {
            System.out.println("No existen resultados");
    } else {
         if (num1 == 0) {               
         } else { 
            x1 = (-num2 + Math.sqrt(d))/(2 * num1); 
            x2 = (-num2 - Math.sqrt(d))/(2 * num1);
                System.out.println("Solución 1: " + x1);
                System.out.println("Solución 2: " + x2);
         }
        }
    }
}
