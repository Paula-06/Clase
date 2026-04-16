import java.util.Scanner;
	public class Ejercicio1_6 {
		public static void main (String [] args) {
			int nota1;
			int nota2;
		double media;
		Scanner sc = new Scanner(System.in);
		System.out.print("escriba la primera nota: ");
			nota1 = sc.nextInt();
		System.out.print("escriba la segunda nota: ");
			nota2 = sc.nextInt();
		media = (nota1+nota2)/2;
		System.out.println("La nota media es: " + media);
		
		}
	}
	
