
package examen1_ronalzuniga;

import java.util.ArrayList;
import java.util.Date;

public class General extends Persona{
    private String ocupacion;
    private double sueldo;
    private String horario;
    private Date tiempo;

    public General() {
        super();
    }

    public General(String ocupacion, double sueldo, String horario, Date tiempo, int id, String nombre, int edad, String sexo, String civil, double peso, double altura, ArrayList<Mensaje> m) {
        super(id, nombre, edad, sexo, civil, peso, altura, m);
        this.ocupacion = ocupacion;
        this.sueldo = sueldo;
        this.horario = horario;
        this.tiempo = tiempo;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Date getTiempo() {
        return tiempo;
    }

    public void setTiempo(Date tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "General{" + "ocupacion=" + ocupacion + ", sueldo=" + sueldo + ", horario=" + horario + ", tiempo=" + tiempo + '}';
    }
}
