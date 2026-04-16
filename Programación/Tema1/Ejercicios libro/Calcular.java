import java.util.Scanner;
	public class Calcular {
	public static void main (String [] args) {
		int añoactual;
		int nacimiento;
		int edad;
			System.out.print("Pon el año en el que nos encontramos: ");
			Scanner sc = new Scanner (System.in);
			añoactual = sc.nextInt();
			System.out.println("¿En que año naciste?: ");
			nacimiento = sc.nextInt();
			edad = añoactual-nacimiento;
			System.out.println("Tienes " +edad+ " años");
		}
	}