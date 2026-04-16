
import java.util.Scanner;
public class EjercicioT2_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ponga su nota: ");
            int nota = sc.nextInt();
        if (0 < nota && nota > 10) {
            System.out.println("Nota no válida");
        } else if (nota < 5){
            System.out.println("Sacaste un insuficiente");
        } else if (nota == 5) {
            System.out.println("Sacaste un suficiente");
        } else if (nota == 6) {
            System.out.println("Sacaste un bien");
        } else if (nota == 7 || nota == 8) {
            System.out.println("Sacaste un notable");
        } else if (nota == 9 || nota == 10) {
            System.out.println("Sacaste un sobresaliente");
        } 
    }
    
}
