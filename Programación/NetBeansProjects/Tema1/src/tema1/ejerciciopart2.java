
package tema1;
import java.util.Scanner;
public class ejerciciopart2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //Creamos variables
    int num1;
    int num2; 
    //Pedimos numeros
        System.out.println("Introduzca un numero: ");
        num1 = sc.nextInt();
        System.out.println("Escriba un segundo nombre: ");
        num2 = sc.nextInt();
    //creamos las operaciones    
    int suma = num1 + num2;
    int resta = num1 - num2;
    int mult = num1 * num2;
    int div = num1 / num2;
    int resto = num1 % num2;
    //Resolvemos resultado
        System.out.println("La suma entre " + num1 + " y " + num2 + " es de " + suma);
        System.out.println("La resta entre " + num1 + " y " + num2 +" es de " + resta);
        System.out.println("La multiplicacion entre " + num1 + " y " + num2 +" es de " + mult);
        System.out.println("La division entre " + num1 + " y " + num2 +" es de " + div);
        System.out.println("El resto es de: " + resto);  
    }
    
}
