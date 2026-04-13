
package Arrays;

public class Ejercicio4 {
    public static void main(String[] args) {
    //Declarar tabla
    int tabla[] = new int[10];
    int suma = 0;
    
        for (int i = 0; i < 10; i++) {
            tabla[i] = (int) (Math.random() * 100) + 1;
        //Mostrar por pantalla
        suma += tabla[i];
        }
        System.out.println(suma);
    }
}
