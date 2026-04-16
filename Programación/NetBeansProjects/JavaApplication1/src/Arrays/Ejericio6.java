package Arrays;

import java.util.Scanner;

public class Ejericio6 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    //Crear el array
    double tabla[] = new double[5];
    
    //Pedir los 5 numeros
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduza el número " +(i + 1) + " : ");
            tabla[i] = sc.nextDouble();
        } 
        System.out.println("___________");
        for (double numero : tabla) {
            
            System.out.println(numero);
        }        
    }
}
