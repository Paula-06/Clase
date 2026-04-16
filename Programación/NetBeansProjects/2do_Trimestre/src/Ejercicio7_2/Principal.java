
package Ejercicio7_2;

public class Principal {
    public static void main(String[] args) {
        CuentaCorriente c = new CuentaCorriente("58898562L", "Daniel");//Cuenta de Daniel con su DNI
        CuentaCorriente v = new CuentaCorriente("58898558J", 52222);
        CuentaCorriente l = new CuentaCorriente("58898548J", "Dani", 300);//Cuenta de Daniel con su DNI

        c.ingresar(50000); //Dinero que ingresamos
        c.SacarD(200); // Dinero que sacamos
        c.info();//informacion de la cuenta
        v.info();//informacion de la cuenta
        l.info();
    }
    
}
