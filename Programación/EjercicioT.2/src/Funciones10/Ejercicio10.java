
package Funciones10;

import java.util.Scanner;

public class Ejercicio10 {
    static double aElevadoN(double a, int n){
        double res = 1; // el resultado se inicializa a 1, ya que multiplicamos
        for (int i = 1; i <= n; i++)
            res = a * res; //multiplicamos
        return (res);
    }

    //programa principal para probar la función
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca base (real): ");
        double base = sc.nextDouble();
        System.out.print("Introduzca exponente (entero no negativo): ");
        int n = sc.nextInt();
        System.out.println(base + "^" + n + " = " + aElevadoN(base, n));
    }
}
