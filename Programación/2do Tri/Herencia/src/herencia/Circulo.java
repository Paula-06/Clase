
package herencia;

public class Circulo extends Forma {
    
    //Atributo
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
    
    @Override
    public void mostrarTipo() {
        System.out.println("Soy un circulo");
        
    }

}