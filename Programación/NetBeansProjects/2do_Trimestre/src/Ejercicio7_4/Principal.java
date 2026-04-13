
package Ejercicio7_4;

public class Principal {
    public static void main(String[] args) {
    //DATOS DEL EJERCICIO 7.2
    CuentaCorriente c = new CuentaCorriente("58898562L", "Andrea", 333);
    CuentaCorriente v = new CuentaCorriente("58898558J", "Carlos", 987425);
    CuentaCorriente l = new CuentaCorriente("58898548J", "Dani", 300);
        

    // Mostramos información inicial
    c.info();
        System.out.println();
    v.info();
        System.out.println();
    l.info();

    
    System.out.println("\n***Cambiamos el banco...***\n");

    // Cambiamos el banco (se hace con la CLASE, no con el objeto)
    CuentaCorriente.setBanco("Banco Central");

    // Volvemos a mostrar la información
    c.info();
        System.out.println();
    v.info();
        System.out.println();
    l.info();
    }
}
