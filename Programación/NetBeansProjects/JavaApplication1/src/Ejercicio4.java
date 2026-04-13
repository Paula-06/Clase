import java.util.Scanner;
public class Ejercicio4 {
    public static boolean esPrimo(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Función que cuenta los divisores primos de un número
    public static int contarDivisoresPrimos(int n) {
        int contador = 0;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0 && esPrimo(i)) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        int numero = sc.nextInt();
        int resultado = contarDivisoresPrimos(numero);
        System.out.println("El número " + numero + " tiene " + resultado + " divisores primos.");
    }
}
