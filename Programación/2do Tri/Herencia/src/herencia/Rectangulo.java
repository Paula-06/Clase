
package herencia;

public class Rectangulo extends Forma {

    //Atributo
    private double base;
    private double altura;
    
    public Rectangulo(double base, double altura) {
        this.altura = altura;
        this.base = base;
    }
    
    public double calcularArea() {
        return altura * base;
    }
    
    public void mostrarTipo() {
        System.out.println("Soy un rectángulo");
    }
            
}
