
package interfaces;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalculadoraAvanzada calculadora = new CalculadoraAvanzada();

        
        System.out.println("Introduce el primer numero: ");
        int num1 = sc.nextInt();
        
        System.out.println("Introduce el segundo numero ");
        int num2 = sc.nextInt();
        
        System.out.println("suma: " + calculadora.sumar(num1, num2));
        System.out.println("resta: " + calculadora.restar(num1, num2));
        System.out.println("multiplicar: " + calculadora.multiplicar(num1, num2));
        System.out.println("dividir: " + calculadora.dividir(num1, num2));
        System.out.println("modulo: " +calculadora.modulo(num1, num2));
        System.out.println("potencia: " +calculadora.potencia(num1, num2));

        sc.close();
    }
    
}
