
package examen2p2_kennethespinoza;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Kenneth
 */
public class admin_bin {
    
    ArrayList<banana_suprema> banana = new ArrayList();
    private File archivo = null;

    public admin_bin() {
    }

    public admin_bin(String path) {
        archivo = new File(path);
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

        try {
            banana = new ArrayList();
            banana_suprema temp;
            if (archivo.exists()) {
                
                System.out.println("Archivo encontrado");
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (banana_suprema) objeto.readObject()) != null) {
                        banana.add(temp);
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

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;

        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);

            for (banana_suprema t : banana) {
                bw.writeObject(t);
            }
             
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
