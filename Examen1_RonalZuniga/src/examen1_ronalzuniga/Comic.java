
package examen1_ronalzuniga;

import java.awt.Color;

public class Comic extends Articulo{
    private int volumen;
    private int escala;

    public Comic() {
        super();
    }

    public Comic(int volumen, int escala, String titulo, String descripcion, Color color, String tamaño, int puntuacion, Persona ingreso) {
        super(titulo, descripcion, color, tamaño, puntuacion, ingreso);
        this.volumen = volumen;
        this.escala = escala;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public int getEscala() {
        return escala;
    }

    public void setEscala(int escala) {
        this.escala = escala;
    }

    @Override
    public String toString() {
        return "Comic{" + "volumen=" + volumen + ", escala=" + escala + '}';
    }
    
    
}
