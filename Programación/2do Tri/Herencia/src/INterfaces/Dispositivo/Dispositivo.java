
package Interfaces.Dispositivo;

public interface Dispositivo {
    
    void encender();
    void apagar();
    void reiniciar();
    
    @override
    class Telefono implements Dispositivo{
        public void enceder(){
            
        }
    }
}
