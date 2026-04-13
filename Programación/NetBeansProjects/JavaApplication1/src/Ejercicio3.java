import java.util.Scanner;
public class Ejercicio3 {
    public static boolean esPrimo(int n) {
        if (n <= 1) return false; // Los números menores o iguales a 1 no son primos
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false; // Si tiene algún divisor, no es primo
        }
        return true; // Si no tiene divisores, es primo
    }

    public static void main(String[] args) {
        // Prueba con algunos números
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        int numero = sc.nextInt();
        if (esPrimo(numero)) {
            System.out.println(numero + " es primo.");
        } else {
            System.out.println(numero + " no es primo.");
        }
    
    
    }
    
}
