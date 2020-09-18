
package examen1_ronalzuniga;

import java.awt.Color;

public class Articulo {
    private String titulo;
    private String descripcion;
    private Color color;
    private String tamaño;
    private int puntuacion;
    private Persona ingreso;

    public Articulo() {
    }

    public Articulo(String titulo, String descripcion, Color color, String tamaño, int puntuacion, Persona ingreso) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.color = color;
        this.tamaño = tamaño;
        this.puntuacion = puntuacion;
        this.ingreso = ingreso;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public Persona getIngreso() {
        return ingreso;
    }

    public void setIngreso(Persona ingreso) {
        this.ingreso = ingreso;
    }

    @Override
    public String toString() {
        return "Articulo{" + "titulo=" + titulo + ", descripcion=" + descripcion + ", color=" + color + ", tama\u00f1o=" + tamaño + ", puntuacion=" + puntuacion + ", ingreso=" + ingreso + '}';
    }
    
    
}
