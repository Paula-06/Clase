
package herencia;

public abstract class Forma {
    
    //Método abstracto
    public abstract double calcularArea();
    
    //Método común
    public void mostrarTipo(){
        System.out.println("Soy simétrica");
    }
}
