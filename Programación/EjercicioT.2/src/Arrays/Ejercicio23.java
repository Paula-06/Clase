
package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio23 {
    public static int[] leeFavoritos() {
     Scanner sc = new Scanner(System.in);
     int[] cant; //crear variable
     
     //pedir cantidad de numeros         
    System.out.println("¿Cuantos numeros favoritos tienes?");
    int n = sc.nextInt();
    
    cant=new int[n];
    
        for (int i = 0; i < cant.length; i++) {
            System.out.println("Numeros favoritos oordenados: " +(i+1) + ""  );
            cant[i] = sc.nextInt();
        }        
        Arrays.sort(cant);
            return cant;
    }
    
    static int [] borrar (int[] L, int pos){
        int[] nuevo = new int[L.length - 1];
        
        System.arraycopy(L, 0, nuevo, 0, pos);
        System.arraycopy(L, pos + 1, nuevo, pos, L.length - pos -1);
        
        return nuevo;
    }
    
    
    public static void main(String[] args) {
        int [] favoritos = leeFavoritos(); //numeros favoritos del usuario
    //    int numSuerte = calNumSuerte(favoritos); // calculamos el numero suerte
        favoritos = borrar(favoritos, 1);
        
        System.out.println("Numeros favoritos ordenados: " + Arrays.toString(favoritos));
        System.out.println(Arrays.toString(favoritos));
  //      System.out.println("Numero de la suerte es: " + numSuerte);
    }
    
    int [] insertarOrdenado(int[] cant, int n) {
        int [] resultado = Arrays.

        
    }
}
