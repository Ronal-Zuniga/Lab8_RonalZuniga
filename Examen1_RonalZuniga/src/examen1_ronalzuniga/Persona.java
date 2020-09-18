
package examen1_ronalzuniga;

import java.util.ArrayList;

public class Persona {
    private int id;
    private String nombre;
    private int edad;
    private String sexo;
    private String civil;
    private double peso;
    private double altura;
    private ArrayList<Mensaje> m;

    public Persona() {
    }

    public Persona(int id, String nombre, int edad, String sexo, String civil, double peso, double altura, ArrayList<Mensaje> m) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.civil = civil;
        this.peso = peso;
        this.altura = altura;
        this.m = m;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCivil() {
        return civil;
    }

    public void setCivil(String civil) {
        this.civil = civil;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public ArrayList<Mensaje> getM() {
        return m;
    }

    public void setM(ArrayList<Mensaje> m) {
        this.m = m;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
