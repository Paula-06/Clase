
package Ejercicio7_5;

public class CuentaCorriente {
//Atributos
    String dni;
    String nombre;
    double saldo;
    Gestor gestor;

//Sobrecargamos
    CuentaCorriente(String dni, String nombre, Gestor gestor) {
        this.dni = dni;
        this.nombre = nombre;
        this.gestor = gestor;
    }

//Metodo set, un nuevo objeto Gestor, pero no debe usarse para modificarlo posteriormente.
    void setGestor(Gestor gestor) {
        this.gestor = gestor;
    }

// Mostramos la informacion a no ser que sea null
    void info() {
        if (gestor == null) { //si no hay gestor
            System.out.println("Esta cuenta no tiene gestor");
            System.out.println("------------------");
        } else {
            gestor.info();
        }
    //Datos de la cuenta    
        System.out.println("Datos de la cuenta");
        System.out.println("------------------");
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Saldo: " + saldo + "€");
        System.out.println(" ");
        System.out.println(" ");
    }
}