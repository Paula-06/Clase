
package Plantilla;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
    static Scanner sc = new Scanner(System.in);
    ////Añadir jugadores
    
    static void altajugador(Map<Integer, Jugador> plantilla, Integer dorsal) {
        

    // Añadir jugador
        System.out.print("DNI: ");
        String dni = sc.nextLine();

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Posicion (PORTERO, DEFENSA, CENTROCAMPISTA, DELANTERO): ");
        String posicion = sc.nextLine();

        System.out.print("Estatura: ");
        double estatura = sc.nextDouble();
        sc.nextLine();

        Jugador jugador = new Jugador(dni, nombre, posicion, (int) estatura);

        plantilla.put(dorsal, jugador);
    }

    // Eliminar jugador
    static Jugador eliminarJugador(Map<Integer, Jugador> plantilla, Integer dorsal) {

        return plantilla.remove(dorsal);
    }

    // Mostrar dorsales y nombres
    static void mostrar(Map<Integer, Jugador> plantilla) {

        for (Map.Entry<Integer, Jugador> entry : plantilla.entrySet()) {

            System.out.println(
                    "Dorsal: " + entry.getKey() +
                    " Jugador: " + entry.getValue().getNombre()
            );
        }
    }

    // Mostrar jugadores por posición
    static void mostrar(Map<Integer, Jugador> plantilla, String posicion) {

        Posicion pos = Posicion.valueOf(posicion.toUpperCase());

        System.out.println("Posicion: " + pos);

        for (Jugador j : plantilla.values()) {

            if (true) {
                
            }
        }
    }

    // Editar jugador
    static boolean editarJugador(Map<Integer, Jugador> plantilla, Integer dorsal) {

        if (!plantilla.containsKey(dorsal)) {
            return false;
        }

        Jugador j = plantilla.get(dorsal);

        System.out.print("Nuevo nombre: ");
        j.setNombre(sc.nextLine());

        System.out.print("Nueva posicion: ");
        j.setPosicion(sc.nextLine());

        System.out.print("Nueva estatura: ");
        j.setEstatura((int) sc.nextDouble());
        sc.nextLine();

        return true;
    }

    public static void main(String[] args) {

        Map<Integer, Jugador> plantilla = new HashMap<>();

        plantilla.put(16, new Jugador("222","Busquets","CENTROCAMPISTA", (int) 1.89));
        plantilla.put(1, new Jugador("123","Casillas","PORTERO", (int) 1.84));
        plantilla.put(2, new Jugador("543","Albiol","DEFENSA", (int) 1.87));
        plantilla.put(3, new Jugador("864","Pique","DEFENSA", (int) 1.92));
        plantilla.put(21, new Jugador("111","Silva","CENTROCAMPISTA", (int) 1.77));
        plantilla.put(6, new Jugador("777","Iniesta","CENTROCAMPISTA", (int) 1.70));
        plantilla.put(7, new Jugador("444","Villa","DELANTERO", (int) 1.75));
        plantilla.put(8, new Jugador("533","Xabi","CENTROCAMPISTA", (int) 1.70));
        plantilla.put(9, new Jugador("888","Torres","DELANTERO", (int) 1.81));
        plantilla.put(14, new Jugador("333","Alonso","CENTROCAMPISTA", (int) 1.83));
        plantilla.put(15, new Jugador("666","Ramos","DEFENSA", (int) 1.84));

        System.out.println("***Mostrar toda la información de la plantilla");
        System.out.println(plantilla);

        System.out.println("\n***Mostrar los nombres de todos los defensas");
        mostrar(plantilla, "DEFENSA");

        System.out.println("\n***Mostrar dorsales y nombres de jugadores");
        mostrar(plantilla);

        System.out.println("\n***Eliminar el jugador con dorsal 9");
        eliminarJugador(plantilla, 9);

        System.out.println("\nPlantilla final:");
        System.out.println(plantilla);
    }
 
    
}
