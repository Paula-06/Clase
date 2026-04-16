
package Ejercicio7_3;

public class Principal {
    public static void main(String[] args) {
        CuentaCorriente c = new CuentaCorriente("51141584G","Andrea");
        
        c.dni = "58877415M";//Lo ven las clases vecinas
        c.nombre = "Carlos"; //Visible para todas las clases
       
        //Si comentamos el saldo da´ra resultado y como saldo 0, si lo dejamos tal cuál nos dará un error
      //  c.saldo = 50000; //nadie tiene visibilid, asique da error
        
       
       
       //Añadimos para que de informacion de la cuenta
        c.info();
      
    }
    
}
