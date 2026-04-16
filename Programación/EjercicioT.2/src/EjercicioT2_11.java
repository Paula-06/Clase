import java.util.Scanner;
public class EjercicioT2_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon un número del 1 al 7: ");
            int dia = sc.nextInt();
        switch (dia) {
            case 1 -> System.out.print("Lunes");
            case 2 -> System.out.print("Martes");
            case 3 -> System.out.print("Miercoles");
            case 4 -> System.out.print("Jueves");
            case 5 -> System.out.print("Viernes");
            case 6 -> System.out.print("Sabado");
            case 7 -> System.out.print("Domingo");

        }
    }
}
