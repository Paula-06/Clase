import java.util.Scanner;

	public class Ejercicio7{
		public static void main (String [] args) {
			double pi = 3.141592653589793;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca el radio ");
			double Radio = sc.nextDouble();
			double Longitud = 2 * pi * Radio;
			double Area = pi * Radio;
		System.out.print("La longitud es de: " + Longitud);
		System.out.print("El area es de: " + Area);
		}
	}
		
			