
package Ejercicio7_5;


public class Principal {
    public static void main(String[] args) {
    //Gestores
    Gestor g1 = new Gestor("Maria lopez", "587 652 325");
    Gestor g2 = new Gestor("Bea Rodriguez", "547 255 222", 52222);
        
    //Cuentas
    CuentaCorriente c = new CuentaCorriente("58898562L", "Andrea", g1);
    CuentaCorriente v = new CuentaCorriente("58898558J", "Carlos", g2);
    CuentaCorriente l = new CuentaCorriente("58898548J", "Dani", null);
    
    //mostrar
    c.info();
    v.info();
    l.info();

    
    //Cambiamos gestor
    v.setGestor(g1);

    //Mostrar cambio
    v.info();
    }
    
}
