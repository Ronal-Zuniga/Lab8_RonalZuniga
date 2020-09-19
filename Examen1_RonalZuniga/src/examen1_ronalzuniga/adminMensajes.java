
package examen1_ronalzuniga;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class adminMensajes {
    private File archivo = null;
    private ArrayList<Mensaje> m = new ArrayList();

    public adminMensajes(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Mensaje> getM() {
        return m;
    }

    public void setM(ArrayList<Mensaje> m) {
        this.m = m;
    }

    @Override
    public String toString() {
        return "Mensajes=" + m ;
    }
    
    public void setMensaje(Mensaje mj){
        this.m.add(mj);
    }
    
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Mensaje t : m) {
                bw.write(t.getMensaje() + ";");
                bw.write(t.getEmisor() + ";");
                bw.write(t.getReceptor() + ";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }
     public void cargarArchivo() {
        Scanner sc = null;
        m = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    m.add(new Mensaje(sc.next(),
                                    sc.next(),
                                    sc.next()
                                 )
                    );
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
}
