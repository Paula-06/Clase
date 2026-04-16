
package Funciones;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Ejercicio20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radio = leerRadio(sc);
        int opcion;

        do {
            opcion = mostrarMenu(sc);

            switch (opcion) {
                case 1 -> System.out.println("Longitud de la circunferencia: " + longitudCircunferencia(radio));
                case 2 -> System.out.println("�rea del c�rculo: " + areaCirculo(radio));
                case 3 -> System.out.println("�rea de la esfera: " + areaEsfera(radio));
                case 4 -> {
                    double altura = leerAltura(sc);
                    System.out.println("�rea del cilindro: " + areaCilindro(radio, altura));
                }
                case 5 -> System.out.println("Volumen de la esfera: " + volumenEsfera(radio));
                case 6 -> {
                    double altura = leerAltura(sc);
                    System.out.println("Volumen del cilindro: " + volumenCilindro(radio, altura));
                }
                case 7 -> radio = leerRadio(sc);
                case 8 -> System.out.println("Fin del programa.");
            }

        } while (opcion != 8);

        sc.close();
    }

    // --- M�TODOS DE C�LCULO ---
    public static double longitudCircunferencia(double r) {
        return 2 * Math.PI * r;
    }

    public static double areaCirculo(double r) {
        return Math.PI * r * r;
    }

    public static double areaEsfera(double r) {
        return 4 * Math.PI * r * r;
    }

    public static double volumenEsfera(double r) {
        return (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
    }

    public static double areaCilindro(double r, double h) {
        return 2 * Math.PI * r * (r + h);
    }

    public static double volumenCilindro(double r, double h) {
        return Math.PI * r * r * h;
    }

    // --- M�TODO PARA MOSTRAR EL MEN� Y LEER OPCI�N ---
    public static int mostrarMenu(Scanner sc) {
        int opcion = 0;
        boolean valido = false;

        while (!valido) {
            try {
                System.out.println("\n--- MEN� ---");
                System.out.println("1. Longitud de la circunferencia");
                System.out.println("2. �rea del c�rculo");
                System.out.println("3. �rea de la esfera");
                System.out.println("4. �rea del cilindro");
                System.out.println("5. Volumen de la esfera");
                System.out.println("6. Volumen del cilindro");
                System.out.println("7. Nuevo radio");
                System.out.println("8. Terminar");
                System.err.print("Elige una opci�n: ");

                opcion = sc.nextInt();
                if (opcion < 1 || opcion > 8) {
                    System.out.println("Opci�n no v�lida. Intenta de nuevo.");
                } else {
                    valido = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: introduce un n�mero entero.");
                sc.nextLine(); // limpiar buffer
            }
        }

        return opcion;
    }

    // --- M�TODO PARA LEER Y VALIDAR RADIO (lanza IllegalArgumentException internamente) ---
    public static double leerRadio(Scanner sc) {
        double radio = 0;
        boolean valido = false;

        while (!valido) {
            try {
                System.out.print("Introduce el valor del radio: ");
                radio = sc.nextDouble();

                // Validaci�n: si es inv�lido, lanzamos una excepci�n
                if (radio <= 0) {
                    throw new IllegalArgumentException("El radio debe ser un n�mero positivo.");
                }

                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: introduce un n�mero v�lido (usa punto decimal si es necesario).");
                sc.nextLine(); // limpiar buffer
            } catch (IllegalArgumentException e) {
                // Capturamos la excepci�n lanzada manualmente y mostramos el mensaje
                System.out.println("Error: " + e.getMessage());
                // No hace falta limpiar el buffer aqu� porque la entrada fue num�rica
            }
        }

        return radio;
    }

    // --- M�TODO PARA LEER Y VALIDAR ALTURA (lanza IllegalArgumentException internamente) ---
    public static double leerAltura(Scanner sc) {
        double altura = 0;
        boolean valido = false;

        while (!valido) {
            try {
                System.out.print("Introduce la altura del cilindro: ");
                altura = sc.nextDouble();

                // Validaci�n: si es inv�lido, lanzamos una excepci�n
                if (altura <= 0) {
                    throw new IllegalArgumentException("La altura debe ser un n�mero positivo.");
                }

                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: introduce un n�mero v�lido (usa punto decimal si es necesario).");
                sc.nextLine(); // limpiar buffer
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        return altura;
    }
}
