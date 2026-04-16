/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comparador;

import java.util.Comparator;

/**
 *
 * @author User
 */
 class Comparador implements Comparator<Vehiculo>{
    @Override
    public int compare(Vehiculo v1, Vehiculo v2) {
        return v1.marca.compareTo(v2.marca);
    }
}
