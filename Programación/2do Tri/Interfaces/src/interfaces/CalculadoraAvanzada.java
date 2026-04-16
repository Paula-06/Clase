
package interfaces;

public class CalculadoraAvanzada extends CalculadoraSimple {
    public int modulo(int a, int b) {
        return a % b;
    }
    
    public double potencia(int base, int exponente) {
        return Math.pow(base, exponente);
    }
}
