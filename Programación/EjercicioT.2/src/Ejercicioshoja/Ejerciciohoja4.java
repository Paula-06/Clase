
package Ejercicioshoja;

import java.util.Scanner;

public class Ejerciciohoja4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temperatura;
            System.out.println("¿Que temperatura hace?");
                temperatura = sc.nextInt();
        if (temperatura < 12) {
            System.out.println("Hace mucho frio en este aula");
        } else {
            if (temperatura >= 12 && temperatura < 22) {
                System.out.println("Hace algo de frio en esta aula");
            } else {
                if (temperatura >= 22 && temperatura < 32 ) {
                    System.out.println("Se esta bien en esta aula");
                } else {
                    if (temperatura >= 32) {
                        System.out.println("En esta aula hace demasiado calor");
                    }
                }
            }
        }
    }
    
}
