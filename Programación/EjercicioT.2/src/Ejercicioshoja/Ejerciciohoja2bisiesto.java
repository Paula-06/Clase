package Ejercicioshoja;


import java.util.Scanner;


public class Ejerciciohoja2bisiesto {
     public static boolean esBisiesto(int año) {
        return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, mes, año;
        boolean fecha = false;

        System.out.println("Introduzca un día: ");
        dia = sc.nextInt();
        System.out.println("Introduzca un mes: ");
        mes = sc.nextInt();
        System.out.println("Introduzca un año: ");
        año = sc.nextInt();

        int diasMes = switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> esBisiesto(año) ? 29 : 28;
            default -> 0; 
        };

        if (año != 0 && dia >= 1 && dia <= diasMes) {
            fecha = true;
        }

        if (fecha) {
       System.out.println("Fecha: " + dia + "/" + mes + "/" + año + " Correcta");
        } else {
            System.out.println("Fecha incorrecta");
        }
    }
}
