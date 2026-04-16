
package Principal;

import Clases.Comparar;
import Clases.CompararT;
import Clases.Videojuego;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class GestionVideojuegos {


    public static void main(String[] args) {
    //Crear lista
    List<Videojuego> listaOriginal = new ArrayList<>();
        
    listaOriginal.add(new Videojuego(205, "The Legend of Zelda", 7.8, "Aventura"));
    listaOriginal.add(new Videojuego(102, "FIFA 24", 5.8, "Deportes"));
    listaOriginal.add(new Videojuego(200, "Elden Ring ", 9.5));
    listaOriginal.add(new Videojuego(104, "Mario Kart 8", 5.4, "Conduccion"));
    listaOriginal.add(new Videojuego(105, "The Sims 4", 5.6, "Simulacion"));
    listaOriginal.add(new Videojuego(205, "Zelda Remastered", 5.0, "Aventura"));
    listaOriginal.add(new Videojuego(109, "Animal Crossing", 6.9, "Simulacion"));
    listaOriginal.add(new Videojuego(102, "FIFA", "Deportes"));
    listaOriginal.add(new Videojuego(115, "Minecraft"));
    
        //Mostrar lista
        infoLista(listaOriginal);
        
        //Eliminar
        Set<Videojuego> nuevaCol1 = new TreeSet<>(listaOriginal);
        infoLista(nuevaCol1);
        
        //Modificar puntuaciones
        mejoraPuntuacion(nuevaCol1, 5.5);
        infoLista(nuevaCol1);
    
        //Contar elementos
        System.out.println("No tienen puntuacion " + contarSinPuntuacion(listaOriginal)+ " videojuegos");
        
        //Eliminacion
        Iterator<Videojuego> it = nuevaCol1.iterator();
         
        while (it.hasNext()) {
            Videojuego v = it.next();
            
            if (v.getPuntuacion() < 6) {
                it.remove();
            }
        }
        infoLista(nuevaCol1); 
        
        //Convertir en array
        Videojuego[] array = nuevaCol1.toArray(new Videojuego[0]);
        System.out.println("-- Array --");
        for (Videojuego v : array) {
            System.out.println(v);
        }
        
        //Conversión de array a lista
        List<Videojuego> listaArray = Arrays.asList(array);
        System.out.println("-- Lista (Array) --");
        infoLista(listaArray);
        
        
        //Nueva colecciones
        List<Videojuego> nuevaCol2 = new ArrayList<>();
        
        nuevaCol2.add(new Videojuego(102, "FIFA 24", 5.8, "Deportes"));
        nuevaCol2.add(new Videojuego(102, "Fortnite", 7.8, "Battle Royale"));
        nuevaCol2.add(new Videojuego(107, "Hollow Knight", 9.2, "Plataformas"));
        nuevaCol2.add(new Videojuego(109, "Animal Crossing", 6.9, "Simulacion"));
        nuevaCol2.add(new Videojuego(115, "Minecraft", 6.8));
        
        //Añadir todos 
        List<Videojuego> copia = new ArrayList<>(listaOriginal);
        copia.addAll(nuevaCol2);
        infoLista(copia);
        
        //Eliminar
        copia = new ArrayList<>(listaOriginal);
        copia.removeAll(nuevaCol2);
        infoLista(copia);
        
        //Conservar elementos comunes
        copia = new ArrayList<>(listaOriginal);
        copia.retainAll(nuevaCol2);
        infoLista(copia);
        
        //Ordenar por codigo
        System.out.println("-- Ordenar por codigo --");
        Collections.sort(listaOriginal);
        infoLista(listaOriginal);
        
        //Ordenar por puntuacion
        System.out.println("-- Ordenar por puntuacion --");
        listaOriginal.sort(new Comparar());
        infoLista(listaOriginal);
    
        //Conversión y ordenación por título
        System.out.println("-- Ordenar por titulo --");
        List<Videojuego> listaOrden = new ArrayList<>(nuevaCol1);
        //Collections.sort(listaOrden, new CompararT());
        listaOrden.sort(new CompararT());
        infoLista(listaOrden);
        
        
        //-----MAP Y VISTAS
        //Crear mapa 
        Map<Integer, Double> mapa = new HashMap<>();
        for (Videojuego v : nuevaCol1) {
            mapa.put(v.getCodigo(), v.getPuntuacion());
        }
        
        
        //Operaciones básicas
        System.out.println("");
        System.out.println(mapa);
        System.out.println("Puntuacion 105: " + mapa.get(105));
        System.out.println("Comprobar que existe una clave: " + mapa.containsKey(102));
        System.out.println("Comprobar que existe valor: " + mapa.containsValue(7.0));
        System.out.println("");
        
        //Vista de claves
        System.out.println("");
        Set<Integer> clave = mapa.keySet();
        clave.remove(102);
        System.out.println("Mapa sin 102");
        System.out.println(mapa);
        
        //Vistas de valores
        System.out.println("");
        System.out.println("Mapa con valores");
//        Collection<Double> valor = mapa.values();
        System.out.println(mapa.values());
        
        //Vista de entradas
        System.out.println("");
        for (Map.Entry<Integer, Double> e : mapa.entrySet()) {
            if (e.getValue() < 7) {
                e.setValue(7.0);
            }
        }
        System.out.println("Mapa con valor y claves, minimo 7");
        System.out.println(mapa);
        
        //Eliminar desde vistas
        Map<Integer, Double> eliminar = new HashMap<>(mapa);
        for (Integer claves : eliminar.keySet()) {
            if (claves < 106) {
                mapa.remove(claves);
            }
        }
        System.out.println("");
        System.out.println("Eliminar codigos con codigo menor a 106");
        System.out.println(mapa);
    
    
    }

    public static void infoLista(Collection<Videojuego> lista) {
        System.out.println("");
        System.out.println("-- Lista de videojuegos --");
        for (Videojuego v : lista) {
            System.out.println(v);
        }
        System.out.println("");
        System.out.println("Tamaño de la lista: " + lista.size());
    }
    
    public static void mejoraPuntuacion(Collection <Videojuego> lista, double valor) {
        for (Videojuego v : lista) {
            if (v.getPuntuacion() > valor && v.getPuntuacion() < 6)  {
                double nueva = v.getPuntuacion() + 0.5;
                if (nueva > 6)  
                    nueva = 6;
                v.setPuntuacion(nueva);
            }
        }
    }
    
    public static int contarSinPuntuacion(Collection<Videojuego> lista) {
        int contador = 0;
        for (Videojuego v : lista) {
            if (v.getPuntuacion() == -1.0) {
                contador++;
            }
        }
        return contador;
    }
    
}