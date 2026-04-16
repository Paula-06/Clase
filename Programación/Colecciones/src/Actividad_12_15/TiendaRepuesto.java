
package Actividad_12_15;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TiendaRepuesto{ 

    static Map<String, Integer> productos = new HashMap<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion;

        do {
            opcion = mostrarMenu();

            switch (opcion) {
                case 1 -> altaProducto();
                case 2 -> bajaProducto();
                case 3 -> modificarStock();
                case 4 -> listarExistencias();
                case 5 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción no válida.");
            }

        } while (opcion != 5);
    }

    public static int mostrarMenu() {
        System.out.println("\n--- GESTIÓN DE REPUESTOS ---");
        System.out.println("1. Alta de producto");
        System.out.println("2. Baja de producto");
        System.out.println("3. Modificar stock");
        System.out.println("4. Listar existencias");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");

        return sc.nextInt();
    }

    public static void altaProducto() {

        System.out.print("Introduce el código del producto: ");
        String codigo = sc.next();

        if (productos.containsKey(codigo)) {
            System.out.println("Error: el producto ya existe.");
        } else {
            System.out.print("Introduce el número de unidades: ");
            int stock = sc.nextInt();
            productos.put(codigo, stock);
            System.out.println("Producto añadido correctamente.");
        }
    }

    public static void bajaProducto() {

        System.out.print("Introduce el código del producto a eliminar: ");
        String codigo = sc.next();

        if (productos.containsKey(codigo)) {
            productos.remove(codigo);
            System.out.println("Producto eliminado.");
        } else {
            System.out.println("Error: el producto no existe.");
        }
    }

    public static void modificarStock() {

        System.out.print("Introduce el código del producto: ");
        String codigo = sc.next();

        if (productos.containsKey(codigo)) {
            System.out.print("Introduce el nuevo stock: ");
            int nuevoStock = sc.nextInt();
            productos.put(codigo, nuevoStock);
            System.out.println("Stock actualizado.");
        } else {
            System.out.println("Error: el producto no existe.");
        }
    }

    public static void listarExistencias() {

        if (productos.isEmpty()) {
            System.out.println("No hay productos en el inventario.");
        } else {
            System.out.println("\n--- LISTA DE PRODUCTOS ---");
            for (String codigo : productos.keySet()) {
                System.out.println("Código: " + codigo + " | Stock: " + productos.get(codigo));
            }
        }
    }
}

