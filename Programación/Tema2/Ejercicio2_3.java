import java.util.Scanner;

	public class Ejercicio2_3 {
		public static void main (String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Ponga un numero: ");
				int num1 = sc.nextInt();
			System.out.print("Ponga otro numero: ");
				int num2 = sc.nextInt();
			if (num1 > num2) {
				System.out.print("Este número es mayor " + num1);
			} else {
				System.out.print("Este número es mayor " + num2);
			}
		}
	}