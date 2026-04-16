
package Stream;

import java.util.Scanner;
        
public class ejercicio7libro {
    public static void main(String[] args) {
        //pedir por teclado al usuario
    Scanner sc = new Scanner(System.in);
    
    //crear variable para contar las veces
    int cont = 0, pos; //
    
    //pedir frase y palabra y crear variables
        System.out.println("Introduzca una frase: ");
        String frase = sc.nextLine();//lee todo hasta el enter
        
        System.out.println("Introduzca una palabra: ");
        String palabra = sc.next(); //lee palabra sin espacios
        
        pos = frase.indexOf(palabra); //buscamos la  palabra
        
        //bucle para contar las veces, con while
        while(pos != -1) {
            cont++;
            pos = frase.indexOf(palabra, pos + 1);//seguimos buscando a ver si sale más veces esa`palabra
        }
        //en cuanto no haya más salimos del bucle
        //si no encintramos palabras avisamos con if
        if (cont == 0) {
            System.out.println("No se encontro la palabra " + palabra + " ninguna vez");
        } else {
                System.out.println("La palabra " + palabra+ " se ha encontado " + cont+ " vez/veces");
               }
        }
    }

