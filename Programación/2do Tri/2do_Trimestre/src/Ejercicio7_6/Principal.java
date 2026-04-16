
package Ejercicio7_6;

import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Hora h = new Hora(); //Creamos el objeto
        System.out.println("Introduzca la hora: "); //Pedimos solo la hora
            int valor = sc.nextInt();//llemos el valor
            h.setHora(valor);//asignamos valor
        
        System.out.println("Introduza los minutos: ");
            valor = sc.nextInt();
            h.setMinutos(valor);
            
        System.out.println("Introduzca los segundos: ");
            valor = sc.nextInt();
            h.setSegundo(valor);
            
        System.out.println("Cuantos segundos quieres mostrar: ");
        int s = sc.nextInt();
        for (int i = 0; i < s; i++) {
            System.out.println( h.getHora()+ ":" + h.getMinuto() + ":" + h.getSegundo());
            h.IncrementoSegundo();
        }
            
        }
}
    

