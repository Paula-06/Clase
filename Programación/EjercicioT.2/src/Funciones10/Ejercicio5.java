
package Funciones10;


public class Ejercicio5 {    
    public static void main(String[] args) {
        System.out.println("la a es vocal " + esVocal('a'));
        System.out.println("la e es vocal " + esVocal('e'));
        System.out.println("la i es vocal " + esVocal('i'));
        System.out.println("la o es vocal " + esVocal('o'));
        System.out.println("la u es vocal " + esVocal('u'));
        System.out.println("la t es una vocal " + esVocal('t'));

    }
    static boolean esVocal(char v) { 
        boolean resultado;
        if (v =='a' || v =='e' || v =='i' || v =='o' || v =='u') {
            resultado = true;
        } else {
            resultado = false;
        }
    return resultado;
    }    
}
