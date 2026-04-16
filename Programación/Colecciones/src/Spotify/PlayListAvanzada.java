
package Spotify;

import java.util.ArrayList;
import java.util.List;

public class PlayListAvanzada {

    public static void main(String[] args) {
        //Coleccion 
        List<Cancion> playList = new ArrayList<>();
        
        //------ Añadir las canciones
        playList.add(new Cancion("Thunder", "Imagine Dragons", 2017));
        playList.add(new Cancion("Timber", "Pitbull ", 2013));
        playList.add(new Cancion("Amor con hielo", "Morat"));
        playList.add(new Cancion("Perdon"));
        playList.add(new Cancion("Believer", "Imagine Dragons"));
        playList.add(new Cancion("Macarena", "Los del rio"));
        playList.add(new Cancion("Blinding Lights", "The Weeknd", 2019));
        playList.add(new Cancion("Rolling in the Deep", "Adele", 2010));
        playList.add(new Cancion("Viva La Vida", "Coldplay"));
        playList.add(new Cancion("Shape of You", 2017));
     
        
        //Contenido de la colección
        System.out.println("Playlist de canciones: " + playList);
        //Número de elementos
        System.out.println("Números de canciones: " + playList.size());
        
        //Espacion de separacion
        System.out.println(" ");
        
        //-------Acceso y Modificación
        //Get
        System.out.println(playList.get(0));
        
        //Set
        playList.set(0, new Cancion("Modificada", "ArtistaX", 2000));
        
        playList.add(2, new Cancion("El Baile del Gorila", "Melody ", 2001));
     
        //------Eliminación
        System.out.println("-- Eliminar Cancion --");
        playList.remove("Perdon");
        
    }
    
}
