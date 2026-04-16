import java.util.Scanner;
	
	public class Ejercicio2_5 {
		public static void main (String[] args) {
			Scanner sc = new Scanner(System.in);
	int n1, n2;
	int mayor, menor;
		System.out.print("Introduzca un número: ");
			n1 = sc.nextInt();
		System.out.print("Introduzca otro: ");
			n2 = sc.nextInt();
		mayor = n1 > n2 ? n1 : n2; 
		menor = n1 < n2 ? n1 : n2; 
		System.out.println("Es mayor " + mayor + ", " + menor + " es menor");
		}
	}