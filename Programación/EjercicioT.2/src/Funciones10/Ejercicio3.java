
package Funciones10;

import java.util.Scanner;

public class Ejercicio3 {
//creamos función
public static void calcularcilindro(double radio, double altura, int opcion) {
   double volumen;
   double area;
    switch (opcion) { //opciones para elegir que función 1 o 2
        case 1 -> {
            volumen = Math.PI * Math.pow(radio, 2) * altura;
                System.out.println("El volumen del cilindro es: " + volumen);
        }
        case 2 -> {
            area = 2*Math.PI * radio *(altura + radio);
                System.out.println("El area del cilinfro es de: " + area);
        }
        default -> {
            System.out.println("Calculo erroneo");
    
        }
    }
}        //hacemos lo de siempre para ecpger los números
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el radio: ");
            double radio = sc.nextInt();
        System.out.println("Introduzca la altura: ");
            double altura = sc.nextInt();
        System.out.println("Que quieres calcular (1 (volumen)/ 2 (area): ");
            int calcular = sc.nextInt();
        System.out.println();
        calcularcilindro(radio, altura, calcular); //se invoca función
    }    
}