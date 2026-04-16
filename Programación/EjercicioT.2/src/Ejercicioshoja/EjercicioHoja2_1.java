package Ejercicioshoja;

import java.util.Scanner;

public class EjercicioHoja2_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, mes, año;
        boolean fecha = false; 

        System.out.println("Introduzca un dia:");
        dia = sc.nextInt();
        System.out.println("Introduzca un mes:");
        mes = sc.nextInt();
        System.out.println("Introduzca un año:");
        año = sc.nextInt();

        int diasMes = switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> 28;
            default -> 0;
        };

        boolean esBisiesto = (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);

        if (mes == 2 && esBisiesto) {
            diasMes = 29;
        }
      
        if (diasMes > 0 && dia >= 1 && dia <= diasMes) {
            fecha = true;
        }

        if (fecha) {
            System.out.println("Fecha: " + dia + "/" + mes + "/" + año + " Correcta");
        } else {
            System.out.println("Fecha incorrecta");
        }

    }
}