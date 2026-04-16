
package Ejercicio7_4;

public class CuentaCorriente {

    // Atributo común a todas las cuentas
    static private String nombreBanco = "International Java Bank";

    // Atributos de cada cuenta
    String dni;
    String nombre;
    double saldo;

    // Constructores
    public CuentaCorriente(String dni, String nom) {
        this.dni = dni;
        nombre = nom;
        saldo = 0;
    }
        
    // Constructores
    public CuentaCorriente(String dni, double saldo) {
        this.dni = dni;
        nombre = "Sin nombre";
        this.saldo = saldo;
    }
    
    // Constructores
    public CuentaCorriente(String dni, String nom, double saldo) {
        this.dni = dni;
        nombre = nom;
        this.saldo = saldo;
    }

    // Métodos del banco
    public static void setBanco(String nuevoNombre) {
        nombreBanco = nuevoNombre;
    }

    public static String getBanco() {
        return nombreBanco;
    }

    // Métodos de la cuenta
    public boolean SacarD(double cant) {
        if (saldo > cant) {
            saldo -= cant;
            return true;
        } else {
            System.out.println("No hay dinero");
            return false;
        }
    }

    public void ingresar(double cant) {
        saldo += cant;
    }

    public void info() {
        System.out.println("Datos de la cuenta");
        System.out.println("------------------");
        System.out.println("Banco: " + nombreBanco);
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Saldo: " + saldo + "€");
    }
}
