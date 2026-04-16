/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CadenaTienda;

/**
 *
 * @author pabrmo971
 */
public class PruebaTiendas {

    public static void main(String[] args) {

        // Crear tiendas
        Tienda tiendaSol = new Tienda("Sol");
        Tienda tiendaAtocha = new Tienda("Atocha");

        // Simular ventas aleatorias
        for (int i = 0; i < 5; i++) {
            tiendaSol.comprarChicle((int)(Math.random() * 5) + 1);
            tiendaSol.comprarCocaCola((int)(Math.random() * 5) + 1);
            tiendaSol.comprarDonut((int)(Math.random() * 5) + 1);

            tiendaAtocha.comprarChicle((int)(Math.random() * 5) + 1);
            tiendaAtocha.comprarCocaCola((int)(Math.random() * 5) + 1);
            tiendaAtocha.comprarDonut((int)(Math.random() * 5) + 1);
        }

        // Imprimir estadísticas
        System.out.println(tiendaSol.consultarVentasParciales());
        System.out.println(tiendaAtocha.consultarVentasParciales());
        System.out.println(Tienda.consultarVentasTotales());
    }
}
