
package Plantilla;



public class Jugador {
    //Atributos
    private String dni;
    private String nombre;
    private String posicion;
    private int estatura;
    
    //Constructor

    public Jugador(String dni, String nombre, String posicion, int estatura) {
        this.dni = dni;
        this.nombre = nombre;
        this.posicion = posicion.valueOf(posicion.toUpperCase());
        this.estatura = estatura;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }
    
    @Override
    public String toString() {
        return "DNI: " + dni +
               " Nombre: " + nombre +
               " Posicion: " + posicion +
               " Estatura: " + estatura;
    }    
}
