import java.util.Scanner;

	public class Ejercicio2_6 {
		public static void main (String[] args) {
	   
	   Scanner sc = new Scanner(System.in);
			System.out.print("Ponga un numero: ");
				int num1 = sc.nextInt();
			System.out.print("Ponga otro numero: ");
				int num2 = sc.nextInt();
			if (num1 == num2) {
				System.out.print("Son el mismo número " + num1);
			} else {
				System.out.println("No son el mismo número ");
			}
	        if (num1 > num2) {
				System.out.println(num1 + " es mayor que " + num2);
			} else {
				System.out.println(num1 + " Es menor que " + num2);
			}
		}
	}