
package examen1_ronalzuniga;

import java.awt.Color;

public class Juego extends Articulo{
    private int edicion;
    private String casa_elab;
    private String pais;

    public Juego() {
        super();
    }

    public Juego(int edicion, String casa_elab, String pais, String titulo, String descripcion, Color color, String tamaño, int puntuacion, Persona ingreso) {
        super(titulo, descripcion, color, tamaño, puntuacion, ingreso);
        this.edicion = edicion;
        this.casa_elab = casa_elab;
        this.pais = pais;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public String getCasa_elab() {
        return casa_elab;
    }

    public void setCasa_elab(String casa_elab) {
        this.casa_elab = casa_elab;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Juego{" + "edicion=" + edicion + ", casa_elab=" + casa_elab + ", pais=" + pais + '}';
    }
    
    
}
