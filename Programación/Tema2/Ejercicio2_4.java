import java.util.Scanner;

	public class Ejercicio2_4 {
		public static void main (String [] args) {
			Scanner sc = new Scanner(System.in);
		System.out.print("Ponga un número: ");
		double num = sc.nextDouble();
		if (num > -1 && num < 1) {
			System.out.print("El número es casi-cero");
		} else {
			System.out.print("El número no es casi cero");
		}
		}
	}