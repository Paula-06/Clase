
package Ejercicio7_1;

public class principal {
    public static void main(String[] args) {
        CuentaCorriente c = new CuentaCorriente("58898562L", "Daniel");//Cuenta de Daniel con su DNI
        c.ingresar(50000); //Dinero que ingresamos
        c.SacarD(200); // Dinero que sacamos
        c.info();//informacion de la cuenta      
    }
    
}
