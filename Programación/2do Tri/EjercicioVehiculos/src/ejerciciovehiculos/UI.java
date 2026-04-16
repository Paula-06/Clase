/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioVehiculos;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author sergy
 */
public class UI {
    private Scanner scan;
    private Vehiculo[] vehiculos = new Vehiculo[0] ;
    
    public UI (Scanner scan) {
        this.scan = scan;
    }
    
    public void start() {
        boolean salir = false;
        
        while (!salir) {
            System.out.println("Numero de vehiculos guardados: " + (vehiculos.length));
            System.out.println("Eliga una opcion");
            System.out.println("----------------");
            System.out.println("1: Agregar un nuevo vehiculo");
            System.out.println("2: Listar todos los vehiculos con sus detalles e impuestos");
            System.out.println("3: Salir del programa");
            
            int opcion = Integer.parseInt(scan.nextLine());
            
            switch(opcion) {
                case 1: agregarVehiculo(crearVehiculo());
                        break;
                
                case 2: for (Vehiculo vehiculo : vehiculos) {
                            System.out.println(vehiculo);
                            System.out.println("Impuesto: " + vehiculo.calcularImpuesto()); 
                            System.out.println("------------------------------");
                        }                          
                        break;
                    
                case 3: salir = true;
                
            }
        }
    }
    
    private Vehiculo crearVehiculo() {
        String marca;
        String modelo;
        int anio;
        Vehiculo vehiculo = null;
        
        System.out.println("¿Que tipo de vehiculo quiere añadir?");
        System.out.println("1: Auto");
        System.out.println("2: Camion");
        
        int tipoVehiculo = Integer.parseInt(scan.nextLine());
        
        switch(tipoVehiculo) {
            case 1: System.out.println("¿Marca del auto? ");
                    marca = scan.nextLine();
                    System.out.println("¿Modelo del auto? ");
                    modelo = scan.nextLine();
                    System.out.println("¿Año del auto? ");
                    anio = Integer.parseInt(scan.nextLine());
                    System.out.println("¿Numero de puertas? ");
                    int numeroPuertas = Integer.parseInt(scan.nextLine());
        
                    vehiculo = new Auto(marca, modelo, anio, numeroPuertas);
                    break;
                    
            case 2: System.out.println("¿Marca del auto? ");
                    marca = scan.nextLine();
                    System.out.println("¿Modelo del auto? ");
                    modelo = scan.nextLine();
                    System.out.println("¿Año del auto? ");
                    anio = Integer.parseInt(scan.nextLine());
                    System.out.println("¿Numero de puertas? ");
                    int capacidadCarga = Integer.parseInt(scan.nextLine());
        
                    vehiculo = new Camion(marca, modelo, anio, capacidadCarga);
                    break;
        }
        
        return vehiculo;
    }
    
    private void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos = Arrays.copyOf(vehiculos, vehiculos.length + 1);
        vehiculos[vehiculos.length - 1] = vehiculo;
    }
}
