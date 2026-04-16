package Gestión_de_productos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear la lista de productos
        List<String> productos = new ArrayList<>();
        productos.add("Teclado");
        productos.add("Ratón");
        productos.add("Monitor");
        productos.add("Impresora");
        productos.add("Ratón");
        productos.add("Altavoces");

        // 1. Índice de la primera y última aparición de "Ratón"
        int primera = productos.indexOf("Ratón");
        int ultima = productos.lastIndexOf("Ratón");

        System.out.println("Primera aparición de Ratón: " + primera);
        System.out.println("Última aparición de Ratón: " + ultima);

        // 2. Eliminar el producto en la posición 3
        productos.remove(3);

        // 3. Sustituir "Monitor" por "Monitor 4K"
        int indiceMonitor = productos.indexOf("Monitor");
        if (indiceMonitor != -1) {
            productos.set(indiceMonitor, "Monitor 4K");
        }

        // Mostrar lista final
        System.out.println("Lista final: " + productos);
    }
}
