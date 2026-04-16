import java.util.Scanner;
	public class Edad {
		public static void main (String[] args) {
				int edad;
					System.out.print("Dime tu edad:");
					Scanner sc = new Scanner(System.in);
					edad = sc.nextInt();
					edad = ++edad;
					System.out.println("El año que viene tienes: " +edad+" años");
		}
	}
	