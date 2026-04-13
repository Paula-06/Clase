
package Arrays;

public class Ejercicio10 {
    public static void main(String[] args) {
    int[] numeros = {12, 54, 25, 45, 87};
        System.out.println("El valor máximo es: " + maximo(numeros));
    }
    static int maximo(int t[]) {
        int max = 0;
        //valor máximo        
        for (int i = 0; i < t.length; i++) {
            if (t[i] > max) {
                max = t[i];
            }
        } return max;
    }
}
