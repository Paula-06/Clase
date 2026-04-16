/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CadenaTienda;

/**
 *
 * @author pabrmo971
 */
public class Tienda {

    // Atributos de instancia
    private String direccion;
    private int chiclesVendidos;
    private int cocacolasVendidas;
    private int donutsVendidos;

    // Atributos estáticos (ventas globales)
    private static int totalChicles = 0;
    private static int totalCocacolas = 0;
    private static int totalDonuts = 0;

    // Constructor
    public Tienda(String direccion) {
        this.direccion = direccion;
    }

    // Métodos de compra
    public void comprarChicle(int cantidad) {
        chiclesVendidos += cantidad;
        totalChicles += cantidad;
    }

    public void comprarCocaCola(int cantidad) {
        cocacolasVendidas += cantidad;
        totalCocacolas += cantidad;
    }

    public void comprarDonut(int cantidad) {
        donutsVendidos += cantidad;
        totalDonuts += cantidad;
    }

    // Ventas parciales
    public String consultarVentasParciales() {
        return "EN LA TIENDA DE " + direccion.toUpperCase() + " LAS VENTAS SON:\n" +
               "CHICLES = " + chiclesVendidos + "\n" +
               "COCACOLAS = " + cocacolasVendidas + "\n" +
               "DONUTS = " + donutsVendidos + "\n";
    }

    // Ventas totales
    public static String consultarVentasTotales() {
        return "EN TOTAL LAS TIENDAS HAN VENDIDO:\n" +
               "TOTAL CHICLES = " + totalChicles + "\n" +
               "TOTAL COCACOLAS = " + totalCocacolas + "\n" +
               "TOTAL DONUTS = " + totalDonuts + "\n";
    }
}
