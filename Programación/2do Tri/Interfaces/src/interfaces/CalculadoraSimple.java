
package interfaces;

public class CalculadoraSimple implements Operaciones {
    
    @Override
    public int sumar(int a, int b) {
        return a+b;
    }
   
    @Override
    public int restar(int a, int b) {
        return a-b;
    }
    
    @Override
    public int multiplicar(int a, int b) {
        return a*b;
    }
    
    @Override
    public double dividir(int a, int b) {
        if (b == 0) {
            System.out.println("No se puede dividir entre 0");
            return 0;
        }
        return (double) a/b;
    }
}
