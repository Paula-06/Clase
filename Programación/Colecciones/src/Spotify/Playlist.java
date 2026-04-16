
package Spotify;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Playlist {

    public static void main(String[] args) {
        //------- CREACIÓN Y CARGA INICIAL
        
        //Colección
        Set<String> playlist = new HashSet<>();
        
        System.out.println("-- Canciones --");
        
        //Playlist
        playlist.add("Thunder");
        playlist.add("Timber");
        playlist.add("Amor con hielo");
        playlist.add("Vivir la vida");
        playlist.add("Perdon");
        playlist.add("Believer");
        playlist.add("Macarena");
        playlist.add("Timber");
        
        //Contenido de la colección
        System.out.println("Playlist de canciones: " + playlist);
        //Número de elementos
        System.out.println("Números de canciones: " + playlist.size());
        
        //Espacion de separacion
        System.out.println(" ");
        
        //---------- CONTROL DE DUPLICADOS
        System.out.println("-- Canciones duplicadas -- ");
        boolean duplicar = playlist.add("Timber");
        
        //Valor devuelto por add
        System.out.println("Resultado: " + duplicar);
        System.out.println("Tamaño: " + playlist.size());
        
        //Espacion de separacion
        System.out.println(" ");
        
        //------------ ELIMINACIÓN Y BÚSQUEDA
        System.out.println("-- Eliminación y busqueda -- ");
        playlist.remove("Macarena");
        
        System.out.println("Cancion a eliminar: Macrarena");
        System.out.println("Playlist con eliminación" + playlist);
        System.out.println("Tamaño: " + playlist.size());
        
        System.out.println(" ");
        
        System.out.println("Existe macarena?: "+  playlist.contains("Macarena"));
        System.out.println("Existe Thunder?: " + playlist.contains("Thunder"));
        
       //-------------------- CONVERSIÖN A LINKEDHASHSET
        System.out.println(" ");
        
        System.out.println("-- LinkedHashSet -- ");
        
        Set<String> playlist2 = new LinkedHashSet<>(playlist);
        
        playlist2.add("Como camarón");
        playlist2.add("Todo irá bien");
        
        System.out.println("LinkedHashSet: " + playlist2);
        System.out.println("Tamaño: " + playlist2.size());
       
       //--------------- CONVERSIÓN A TREESET
        System.out.println(" ");
        
        Set<String> playlistOrden = new TreeSet<>(playlist2);
        
        System.out.println("-- Playlist ordenada -- " );
        System.out.println(playlistOrden);
        System.out.println("Tamaño: " + playlist2.size());
        
        //------------- MÉTODOS GLOBALES
        System.out.println(" ");
        
        Set<String> favortitas = new HashSet<>();
        
    }
    
}
