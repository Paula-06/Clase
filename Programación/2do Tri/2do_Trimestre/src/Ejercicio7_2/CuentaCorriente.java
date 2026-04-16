
package Ejercicio7_2;

 class CuentaCorriente {
    //Crear atributos
    String dni;
    String nombre;
    double saldo;
    
     CuentaCorriente(String dni, String nom) { //constructor
        this.dni = dni;//Asigno valor al dni
        nombre = nom;//Asigno valor al nombre
        saldo = 0; //Asigno el valor 0 al saldo
    } 
    
     CuentaCorriente(String dni, double saldo) { //constructor
        this.dni = dni;//Asigno valor al dni
        nombre = "Sin nombre";//Asigno que no hay valor
        this.saldo = saldo; //Asigno valor al saldo
    } 
    
     CuentaCorriente(String dni, String nom, double saldo) { //constructor
        this.dni = dni;//Asigno valor al dni
        nombre = nom;//Asigno valor al nombre
        this.saldo = saldo; //Asigno valor al saldo
    }    
    
     boolean SacarD(double cant) {
        boolean oper;
        if (saldo > cant) { //Saldo suficiente
            saldo -= cant;
            oper = true;
        } else { //Saldo insuficiente 
            System.out.println("No hay dinero");
            oper = false;
        } return (oper);
    } 
    
     void ingresar(double cant) { //Ingresamos dinero
    saldo += cant;
    }
    
     void info() { //mostrar información disponible
        System.out.println("Datos de la cuenta");
        System.out.println("------------------");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("DNI: " + this.dni);
        System.out.println("Saldo: " + this.saldo + "€");
    }
    
    
}
