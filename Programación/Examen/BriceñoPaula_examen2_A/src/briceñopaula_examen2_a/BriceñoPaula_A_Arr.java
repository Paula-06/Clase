/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package briceñopaula_examen2_a;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author pabrmo971
 */
public class BriceñoPaula_A_Arr {

    public static void main(String[] args) {
        //Variables
        Scanner sc = new Scanner(System.in);
        int n;
        int L;
       int [] tabla;
       int Min;
            //Pedimos cantidad de numeros
        do {
            System.out.println("Dime cuantos elementos debe tener el array(valor positivo: ");
            n = sc.nextInt();
        } while (n < 0); 
        
        //creamos tabla
         tabla = new int[n];
         //Pedimor los elementos correspondidos
        for (int i = 0; i < n; i++) {
            do {
            System.out.println("Dame el elemento " + ( i + 1)+" del array (de [0 a 9]);");
            tabla[i] = sc.nextInt();
                if (tabla[i] < 0 || tabla[i] > 9) {
                    System.out.println("Valor incorrecto (debe estar entre [0 y 9]");
                } 
             } while (tabla[i] <0 || tabla[i]>9);
         }
        
        //lamar a la funcion
        
        System.out.println("Datos: " + Arrays.toString(tabla));
        System.out.println("Valor mínimo: " );
        System.out.println("Valor maximo: " );
        System.out.println("Valor frecuencia: " );
        
    }
    //funcion frecuencia
    static int[] frecuencia(int[] t) {
        int frecuencia[] = new int [10];
        
        for (int i = 0; i < t.lenght; i++) {
            if (t[i] >= 0 && t[i] <=9)  {
            
            }
        }
        
    }
    
    
    //funcion maximo minimo 
    static int [] MaxMin(int [] t) {
        //creamos variables
        int datos [] = new int[2]; 
        datos[0] = calculoExterno;
        datos[1] = calculoExterno;
        
        for (int i = 0; i < t.length; i++) {
            if (Max > t.length) {
                
            } else {
                
            }
        }
        
    }
    
    
    
    }

