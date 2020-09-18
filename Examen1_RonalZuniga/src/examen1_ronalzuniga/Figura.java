
package examen1_ronalzuniga;

import java.awt.Color;
import java.util.Date;

public class Figura extends Articulo{
    private String instrucciones;
    private Date garantia;

    public Figura() {
        super();
    }

    public Figura(String instrucciones, Date garantia, String titulo, String descripcion, Color color, String tamaño, int puntuacion, Persona ingreso) {
        super(titulo, descripcion, color, tamaño, puntuacion, ingreso);
        this.instrucciones = instrucciones;
        this.garantia = garantia;
    }

    public String getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(String instrucciones) {
        this.instrucciones = instrucciones;
    }

    public Date getGarantia() {
        return garantia;
    }

    public void setGarantia(Date garantia) {
        this.garantia = garantia;
    }

    @Override
    public String toString() {
        return "Figura{" + "instrucciones=" + instrucciones + ", garantia=" + garantia + '}';
    }
    
    
}
