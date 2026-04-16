
package herencia;

public class Geometria {
    public static void main(String[] args) {
        
    Forma[] formas = new Forma[3];

        formas[0] = new Circulo(5);
        formas[1] = new Rectangulo(4, 6);
        formas[2] = new Triangulo(7, 3);
        
        for (Forma forma : formas) {
            forma.mostrarTipo();
            System.out.println("Area: " + forma.calcularArea());
        }
    }
    
}
