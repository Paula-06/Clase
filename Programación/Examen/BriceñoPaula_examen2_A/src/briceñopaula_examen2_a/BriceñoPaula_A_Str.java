
package briceñopaula_examen2_a;

import java.util.Scanner;

public class BriceñoPaula_A_Str {
   
    public static void main(String[] args) {
         String cadena;
         String cadenaS;
         
         //Pedimor al usuario el nombre y apellidos por espaciso
         Scanner sc = new Scanner(System.in);
         System.out.println("Introduzca nombre y dos apellidos separados por espacio: ");
         cadena = sc.nextLine();
         
         //Eliminamos los espacios añadidos llamando a la funcion
         cadenaS = leeCadena(cadena);
         
         //Separada en enlemetos
         String[] cadenaA = cadenaS.split("x");
         
        String apellido1 = cadenaA[1];

                  
         //guardamos los datos
         String nombre = cadenaA[0];
         String apellido1 = obtieneParte1[];
         String apellido2 = cadenaA[2];
         
        
         
         System.out.println("El nombre de usuario es; ");

    }
    
    static String leeCadena(String n) {
        //creamos variables 
        String cadena1;
        
        //quitamos los espacios
        cadena1 = n.trim();
        
        return cadena1;
    }
    
    static int[] obtieneParte1(int [] t) {
        String letra= " ";
        

        String [] tabla;
        
        //extraer palabras
        
        letra = letra+t.lastIndexOf(t.length - 2, t.length -1);
        letra = letra+t.lastIndexOf(t.length - 1, t.length -1);
        
        letra = letra.toLowerCase();
        //cogemos las dos ultimas palabras

        

    }
    
}
