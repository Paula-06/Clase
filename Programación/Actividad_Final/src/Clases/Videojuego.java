
package Clases;

public class Videojuego implements Comparable<Videojuego>{
    //Atributos
    private int codigo;
    private String titulo;
    private double puntuacion;
    private String genero;
    
    //Constructor todos los parametros
    public Videojuego(int codigo, String titulo, double puntuacion, String genero) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.puntuacion = puntuacion;
        this.genero = genero;
    }
    
    //Constructor codigo y titulo
    public Videojuego(int codigo, String titulo) {
         this(codigo, titulo, -1.0, "SIN_GÉNERO");
    }
    
    //Constructor codigo y titulo
    public Videojuego(int codigo, String titulo, double puntuacion) {
         this(codigo, titulo, puntuacion, "SIN_GÉNERO");
    }
    
    //Constructor codigo y titulo
    public Videojuego(int codigo, String titulo, String genero) {
         this(codigo, titulo, -1.0, genero);
    }
    
    //Métodos getter y setter

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(double puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Videojuego{" + "codigo=" + codigo + ", titulo=" + titulo + ", puntuacion=" + puntuacion + ", genero=" + genero + '}';
    }

    // hashCode() coherente con equals
    @Override
    public int hashCode() {
        return Integer.hashCode(codigo);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Videojuego other = (Videojuego) obj;
        return this.codigo == other.codigo;
    }
    
     // Comparación natural basada en el codigo
    @Override
    public int compareTo(Videojuego otro) {
        return this.codigo - otro.codigo;
    }
    
    
}
