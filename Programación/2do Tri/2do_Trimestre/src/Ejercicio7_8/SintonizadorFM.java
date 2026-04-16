
package Ejercicio7_8;

public class SintonizadorFM {
    //Atributos
    double frecuencia;
    
    SintonizadorFM(double freIni) {
        
        //RANGO
        if (freIni < 80) { //si frencuencia es más pequeño que 80
            frecuencia = 80; //
        } else if (freIni > 108) {//Mayor a 108
            frecuencia = 108;
        } else {
            frecuencia = freIni;
        }
       
    }
    
//    //Contrutor
//    SintonizadorFM() {
//        this(80); //frecuencia por defecto
//        //frecuencia = 80; //Otra manera
//    }
//    
//    public double down() {
//    
//    }
    
    
}
