
package examen1_ronalzuniga;

public class Mensaje {
    private String mensaje;
    private Persona emisor;
    private Persona receptor;

    public Mensaje() {
    }

    public Mensaje(String mensaje, Persona emisor, Persona receptor) {
        this.mensaje = mensaje;
        this.emisor = emisor;
        this.receptor = receptor;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Persona getEmisor() {
        return emisor;
    }

    public void setEmisor(Persona emisor) {
        this.emisor = emisor;
    }

    public Persona getReceptor() {
        return receptor;
    }

    public void setReceptor(Persona receptor) {
        this.receptor = receptor;
    }

    @Override
    public String toString() {
        return mensaje + ", "+emisor + ", " + receptor ;
    }
}
