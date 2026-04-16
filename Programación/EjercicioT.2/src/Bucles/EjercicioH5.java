package Bucles;

import java.util.Scanner;

public class EjercicioH5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contrasena = 123456;
        int intento;

          do {
            System.out.print("Ingresa la contraseña: ");
            intento = sc.nextInt();
        } while (intento != contrasena);

        System.out.println("¡Contraseña correcta!");
    }
}
