
package Funciones10;

import java.util.Scanner;

public class Ejercicio7 {   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
            System.out.println("Introduzca el radio: ");
            double radio = sc.nextInt();

        do {
            System.out.println("1. Longitud de la circunferencia");
            System.out.println("2. Área del círculo");
            System.out.println("3. Área de la esfera");
            System.out.println("4. Área del cilindro");
            System.out.println("5. Volumen de la esfera");
            System.out.println("6. Volumen del cilindro");
            System.out.println("7. Nuevo radio");
            System.out.println("8. Terminar");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
        
            
            switch (opcion) {
                case 1:
                    System.out.println("Longitud de la circunferencia: " + longitud(radio));
                    break;
                case 2:
                    System.out.println("Área del círculo: " + areaCirculo(radio));
                    break;
                case 3:
                    System.out.println("Área de la esfera: " + areaEsfera(radio));
                    break;
                case 4:
                    System.out.println("Área del cilindro: " + areaCilindro(radio));
                    break;
                case 5:
                    System.out.println("Volumen de la esfera: " + vEsfera(radio));
                    break;
                case 6:
                    System.out.println("Volumen del cilindro: " + vCilindro(radio));
                    break;
                case 7:
                    System.out.print("Introduzca el nuevo radio: ");
                    radio = sc.nextDouble();
                    break;
                case 8:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 8);

        sc.close();
    }

    // Funciones geométricas
    public static double longitud(double r) {
        return 2 * Math.PI * r;
    }

    public static double areaCirculo(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    public static double areaEsfera(double r) {
        return 4 * Math.PI * Math.pow(r, 2);
    }

    public static double areaCilindro(double r) {
        double altura = r; // Supuesto: altura = radio
        return 2 * Math.PI * r * (r + altura);
    }

    public static double vEsfera(double r) {
        return (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
    }

    public static double vCilindro(double r) {
        double altura = r; // Supuesto: altura = radio
        return Math.PI * Math.pow(r, 2) * altura;
    }
}
