package Ejercicioshoja;

import java.util.Scanner;

public class EjercicioHoja3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Escriba su salario: ");
        num = sc.nextInt();
        if (num < 1000) {
             System.out.println("Salario Muy Malo");
        }   else {
            if (num >= 1000 && num < 1500) {
                System.out.println("Salario Malo");
            }   else {
                if (num >= 1500 && num < 3000){
                    System.out.println("Salario Bueno");
                }  else {
                    if (num >= 3000){
                        System.out.println("Salario Muy Bueno");
                    }
                }
            }
      }
    }   
}
