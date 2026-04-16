/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia;

public class Main {
    public static void main(String[] args) {

        Caja c1 = new Caja(250, 120, 80, Caja.Unidad.CM);
        c1.setEtiqueta("Frágil - Manipular con cuidado");

        System.out.println(c1);
        System.out.println("Volumen: " + c1.getVolumen() + " m³");
    }
}