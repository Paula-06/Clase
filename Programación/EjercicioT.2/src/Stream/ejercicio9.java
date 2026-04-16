
package Stream;

public class ejercicio9 {
    public static void main(String[] args) {
    int [] tabla = {1, 5, 8, 45, 65, 98};
    System.out.println("El valor máximo es: " + maximo(tabla));
    }
    
    static int maximo(int t[]) {
        int num = t[0];
        
        //buscar numero mayor
        for (int i = 0; i < t.length; i++) {
            if (t[i] > num) {
                num = t[i];
            }
        } return num;
    }
}
