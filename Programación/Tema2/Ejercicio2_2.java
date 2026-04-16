import java.util.Scanner;

	public class Ejercicio2_2 {
		public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.print("Ponga un numero: ");
				int num1 = sc.nextInt();
			System.out.print("Ponga otro numero: ");
				int num2 = sc.nextInt();
			if (num1 == num2) {
				System.out.print("Los números coinciden");
			} else {
				System.out.print("Los números no coinciden");
			}
		}
	}