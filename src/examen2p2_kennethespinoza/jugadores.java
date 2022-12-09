
package examen2p2_kennethespinoza;

import java.util.Random;

/**
 *
 * @author Kenneth
 */
public class jugadores extends Thread{
   
   private int posx;
   private int posy;
   private banana_suprema banana;

    public jugadores(int posx, int posy, banana_suprema banana) {
        this.posx = posx;
        this.posy = posy;
        this.banana = banana;
    }
    
    public int getPosx() {
        return posx;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public int getPosy() {
        return posy;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }

    public banana_suprema getBanana() {
        return banana;
    }

    public void setBanana(banana_suprema banana) {
        this.banana = banana;
    }
   
   public jugadores (){
       
       this.posx = 1 + new Random().nextInt(20);
       this.posx = 1 + new Random().nextInt(20);
   }

    @Override
    public String toString() {
        return "jugadores{" + "posx=" + posx + ", posy=" + posy + ", banana=" + banana + '}';
    }
   
   
   
   @Override
   public void run(){
       if (this.banana.getJugador() == null) {
           this.banana.setJugador(new jugadores());
       }
       
   }
  
}
