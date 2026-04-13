import java.util.Scanner;
public class Ejercicio5 {    
public static int sumaDivisoresPropios(int n) {
    int suma = 0;
    for (int i = 1; i < n; i++) {
        if (n % i == 0) {
            suma += i;
        }
    }
    return suma;
}
public static boolean sonAmigos(int a, int b) {
    return sumaDivisoresPropios(a) == b && sumaDivisoresPropios(b) == a;
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
            int a = sc.nextInt();
        System.out.println("Introduzca un número: ");
            int b = sc.nextInt();
            
    if (sonAmigos(a, b)) {
        System.out.println(a + " y " + b + " son números amigos.");
    } else {
        System.out.println(a + " y " + b + " no son números amigos.");
        }
    }
}
