
package Ejercicio7_6;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Pedir hora
        Hora h = new Hora();
        
        System.out.println("Introduzca la hora: ");
            int valor = sc.nextInt();
            h.setHora(valor);
        
        System.out.println("Introduzca los minutos: ");
            valor = sc.nextInt();
            h.setMinuto(valor);
            
        System.out.println("Introduzca los segundos");
            valor = sc.nextInt();
            h.setSegundo(valor);
        
        //pedir cantidad de segundos a sumar
        System.out.println("Cuantos segundos quieres mostrar: ");
        int s = sc.nextInt();
        for (int i = 0; i < s; i++) {
            System.out.println(h.getHora() + ":" + h.getMinuto() + ":" + h.getSegundo());
            h.incrementoSegundo();
        }              
    }     
}
