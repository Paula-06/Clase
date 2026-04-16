
package Ejercicio7_6;

public class Hora {
    //Atributos
    private byte hora;
    private byte minuto;
    private byte segundo;
    
    //Métodos para hora
    public void setHora(int hora) {
        if (hora >= 0 && hora <= 23) { //Si esta dentro del rango
            this.hora = (byte)hora;
        } else {
            this.hora = 0;
        }
    }
    
    public int getHora() {
        return hora;
    }
    
    //Metodo para minutos
    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto <= 59) {
            this.minuto = (byte) minuto;
        } else {
            this.minuto = 0;
        }
    }
    
    public int getMinuto() {
        return minuto;
    }
    
    //Método para segundos
    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo <= 59) {
            this.segundo = (byte) segundo;
        } else {
            this.segundo = 0;
        }
    } 
    
    public int getSegundo() {
        return segundo;
    }
    
    public void incrementoSegundo() {
        segundo++;
        if (segundo == 60) {//si segundo es igual a 60
            segundo = 0;//reiniciamos contador
            minuto++;//Incrementamos en minutos
            if (minuto == 60) {
                minuto = 0;
                hora++;
                if (hora == 24) {
                    hora = 0;
                }
            }
        } 
    }   
}
