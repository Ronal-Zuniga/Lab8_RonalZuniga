
package examen1_ronalzuniga;

public class Mensaje {
    private String mensaje;
    private String emisor;
    private String receptor;

    public Mensaje() {
    }

    public Mensaje(String mensaje, String emisor, String receptor) {
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

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getReceptor() {
        return receptor;
    }

    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }

    @Override
    public String toString() {
        return "Mensaje{" + "mensaje=" + mensaje + ", emisor=" + emisor + ", receptor=" + receptor + '}';
    }

    
}
