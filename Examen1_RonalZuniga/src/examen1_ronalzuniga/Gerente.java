
package examen1_ronalzuniga;

import java.util.ArrayList;

public class Gerente extends Persona{
    private String usuario;
    private String contra;
    private String cargo;

    public Gerente() {
        super();
    }

    public Gerente(String usuario, String contra, String cargo, int id, String nombre, int edad, String sexo, String civil, double peso, double altura, ArrayList<Mensaje> m) {
        super(id, nombre, edad, sexo, civil, peso, altura, m);
        this.usuario = usuario;
        this.contra = contra;
        this.cargo = cargo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Gerente{" + "usuario=" + usuario + ", contra=" + contra + ", cargo=" + cargo + '}';
    }
}
