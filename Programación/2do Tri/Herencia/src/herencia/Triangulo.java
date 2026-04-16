
package herencia;

public class Triangulo extends Forma {
    
    //Atributo
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.altura = altura;
        this.base = base;
    }
    
    public double calcularArea() {
        return (altura * base) / 2;
    }
    
    public void mostrarTipo() {
        System.out.println("Soy un Triangulo");
    }
    
}
