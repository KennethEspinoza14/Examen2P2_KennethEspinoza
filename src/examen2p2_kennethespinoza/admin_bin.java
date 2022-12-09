
package examen2p2_kennethespinoza;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JTextArea;
import javax.swing.JTree;

/**
 *
 * @author Kenneth
 */
public class admin_bin implements Serializable{
    
    private javax.swing.JTextArea mapa;
    ArrayList<banana_suprema> banana = new ArrayList();
    private File archivo = null;

    public admin_bin() {
    }
    
    public admin_bin(JTextArea mapa) {
        this.mapa = mapa;
    }

    public admin_bin(String path) {
        archivo = new File(path);
    }

    public JTextArea getMapa() {
        return mapa;
    }

    public void setMapa(JTextArea mapa) {
        this.mapa = mapa;
    }

    public ArrayList<banana_suprema> getBanana() {
        return banana;
    }

    public void setBanana(ArrayList<banana_suprema> banana) {
        this.banana = banana;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setBanana(banana_suprema j){
        banana.add(j);
    }

    @Override
    public String toString() {
        return "admin_bin{" + "banana=" + banana + ", archivo=" + archivo + '}';
    }

    public void cargarArchivo() {

        javax.swing.JTextArea temp;
       
        try {

            if (archivo.exists()) {
                
                System.out.println("Archivo encontrado");
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = ( javax.swing.JTextArea) objeto.readObject()) != null) {
                        mapa = temp;
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo( javax.swing.JTextArea mapa) {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;

        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);

            bw.writeObject(mapa);
            
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
    
    
}
