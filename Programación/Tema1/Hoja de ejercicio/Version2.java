import java.util.Scanner;
public class Version2 {
	public static void main (String [] args) {
		int num1;
		int num2;
		System.out.print("Di un numero: ");
			Scanner sc = new Scanner (System.in);
			num1 = sc.nextInt();
			System.out.println("Di otro número: ");
			num2 = sc.nextInt();
			int suma;
	suma = num1 + num2;
			System.out.println("La suma da "  +suma+ "" );
			int resta;
	resta = num1 - num2;
			System.out.println("La resta da "  +resta+ "" );
			int mult;
	mult = num1 * num2;
			System.out.println("La multiplicación da "  +mult+ "" );
			int dividir;
	dividir = num1 / num2;
			System.out.println("La división da "  +dividir+ "" );
	
		}
	}