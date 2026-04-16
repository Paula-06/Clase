/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leeCadena;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeeCadenaEjercicio {

    public static List<Character> leeCadena() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce una cadena: ");
        String texto = sc.nextLine();

        List<Character> lista = new ArrayList<>();

        // Recorrer la cadena y añadir cada carácter
        for (int i = 0; i < texto.length(); i++) {
            lista.add(texto.charAt(i));
        }

        return lista;
    }

    public static void main(String[] args) {
        List<Character> resultado = leeCadena();
        System.out.println("Lista de caracteres: " + resultado);
    }
}
