
package examen2p2_kennethespinoza;

import javax.swing.JTextArea;

/**
 *
 * @author Kenneth
 */
public class partida extends Thread{
    
    private JTextArea mapa;
    private jugadores comida;
    
    public JTextArea getMapa() {
        return mapa;
    }

    public void setMapa(JTextArea mapa) {
        this.mapa = mapa;
    }

    public jugadores getComida() {
        return comida;
    }

    public void setComida(jugadores comida) {
        this.comida = comida;
    }
      
    @Override
    public void run (){
        
        
        
    }
}
