/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia;

public class Caja {
    public static void main(String[] args) {
        //Enum
    public enum Unidad {
        CM, M
    }

    // Atributos (siempre almacenados en metros)
    private final double ancho;
    private final double alto;
    private final double fondo;
    private String etiqueta;

    // Constructor
    public Caja(int ancho, int alto, int fondo, Unidad unidad) {

        if (unidad == Unidad.CM) {
            this.ancho = ancho / 100.0;
            this.alto = alto / 100.0;
            this.fondo = fondo / 100.0;
        } else {
            this.ancho = ancho;
            this.alto = alto;
            this.fondo = fondo;
        }

        this.etiqueta = "";
    }

    // 1. Devuelve el volumen en metros cúbicos
    public double getVolumen() {
        return ancho * alto * fondo;
    }

    // 2. Modifica la etiqueta (máximo 30 caracteres)
    public void setEtiqueta(String etiqueta) {
        if (etiqueta == null) {
            this.etiqueta = "";
        } else if (etiqueta.length() > 30) {
            this.etiqueta = etiqueta.substring(0, 30);
        } else {
            this.etiqueta = etiqueta;
        }
    }

    // 3. Representación en texto
    @Override
    public String toString() {
        return "Caja [ancho=" + ancho + "m, alto=" + alto + "m, fondo=" 
                + fondo + "m, etiqueta=\"" + etiqueta + "\"]";
    }
    
}
