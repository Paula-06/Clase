/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.Comparator;

/**
 *
 * @author pabrmo971
 */
public class Comparar implements Comparator{
    
    @Override
    public int compare(Object o1, Object o2) {
    Videojuego otro1 = (Videojuego)o1;
    Videojuego otro2 = (Videojuego)o2;
        if (otro1.getPuntuacion() > otro2.getPuntuacion()) {
            return 1;
        } else if (otro1.getPuntuacion() < otro2.getPuntuacion()) {
            return -1;
        }
        return 0;
    }
    

}