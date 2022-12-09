
package examen2p2_kennethespinoza;

import java.util.ArrayList;

/**
 *
 * @author Kenneth
 */
public class banana_suprema {
    
    private ArrayList <jugadores> jugadores_comidos = new ArrayList();
    private jugadores jugador;

    public banana_suprema(jugadores jugador) {
        this.jugador = jugador;
    }

    public ArrayList<jugadores> getJugadores_comidos() {
        return jugadores_comidos;
    }

    public void setJugadores_comidos(ArrayList<jugadores> jugadores_comidos) {
        this.jugadores_comidos = jugadores_comidos;
    }

    public jugadores getJugador() {
        return jugador;
    }

    public void setJugador(jugadores jugador) {
        this.jugador = jugador;
    }

    
    
}
