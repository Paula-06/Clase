
package Ejercicio7_5;

public class Gestor {
//Atributos
    public String nombre;//Visible para todos, publico para todos
    private String telefono; //No puede ser modificado
    double importe; 

//clase gestor
    public Gestor(String nombre, String telefono, double importe) {
        this.nombre = nombre;
        this.importe = importe;
        this.telefono = telefono;
    }
    
//clase gestor para fijar el importe maximo
    public Gestor(String nombre, String telefono) {
        this(nombre, telefono, 10000); //Asignamos el importe maximo 
    }

/* Método get del teléfono. Permite consultar el número de teléfono del gestor desde fuera de la clase,
 pero no modificarlo, ya que el atributo es privado.*/
    String gettelefono() {
        return telefono;
    }
    
//Mostramos la información que tenemos
    void info() {
        System.out.println("Información del Gestor");
        System.out.println("------------------");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Telefono: " + this.telefono);
        System.out.println("Importe maximo: " + this.importe + "€");
        System.out.println(" ");
   }
}

