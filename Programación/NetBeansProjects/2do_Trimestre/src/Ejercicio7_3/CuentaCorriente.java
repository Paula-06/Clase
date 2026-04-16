
package Ejercicio7_3;

/*IGUAL QUE EL EJERCICIO 7.1 PERO CON LA CLASE SEA VISIBLE*/

public class CuentaCorriente {
    //Crear atributos
    String dni; //Se queda tal cual, lo ven las clases vecinas(mismo paquete)
    public String nombre;//Añadimos "public" y asi lo puede ver cualquier clase
    private double saldo; //Añadimos "private" NINGUNA clase tiene visibilidad 
    
    public CuentaCorriente(String dni, String nom) { //constructor
        this.dni = dni;//Asigno valor al dni
        nombre = nom;//Asigno valor al nombre
        saldo = 0; //Asigno el valor 0 al saldo
    } 
    
    public boolean SacarD(double cant) {
        boolean oper;
        if (saldo > cant) { //Saldo suficiente
            saldo -= cant;
            oper = true;
        } else { //Saldo insuficiente 
            System.out.println("No hay dinero");
            oper = false;
        } return (oper);
    } 
    
    public void ingresar(double cant) { //Ingresamos dinero
    saldo += cant;
    }
    
    public void info() { //mostrar información disponible
        System.out.println("Datos de la cuenta");
        System.out.println("------------------");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("DNI: " + this.dni);
        System.out.println("Saldo: " + this.saldo + "€");
    }
    
    
}
