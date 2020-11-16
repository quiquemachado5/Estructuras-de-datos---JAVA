import java.util.*;

public class Jugador implements IJugador{
    
    private int canastaUnPunto;
    private int canastaDosPuntos;
    private int canastaTresPuntos;
    
    
    
    public Jugador(int canastaUnPunto,int canastaDosPuntos,int canastaTresPuntos){
        
        this.canastaUnPunto = canastaUnPunto;
        this.canastaDosPuntos = canastaDosPuntos;
        this.canastaTresPuntos = canastaTresPuntos;
        
    }
    
    @Override
    public int getCanastasUnPunto() {
        return this.canastaUnPunto;
    }

    @Override
    public void setCanastasUnPunto(int canastaUnPunto) {
         this.canastaUnPunto = canastaUnPunto;
    }

    @Override
    public int getCanastasDosPuntos() {
        return this.canastaDosPuntos;
    }

    @Override
    public void setCanastasDosPuntos(int canastaDosPuntos) {
        this.canastaDosPuntos = canastaDosPuntos;
    }

    @Override
    public int getCanastasTresPuntos() {
        return this.canastaTresPuntos;
    }

    @Override
    public void setCanastasTresPuntos(int canastaTresPuntos) {
        this.canastaTresPuntos = canastaTresPuntos;
    }
    
    @Override
    public String toString(){
        return ("Puntos triples: "+this.getCanastasUnPunto()+"  Puntos dobles: "+this.getCanastasDosPuntos()+"  Puntos simples: "+this.getCanastasTresPuntos());
    }
    
    @Override
    public int getPuntos() {
        
        return this.canastaUnPunto+this.canastaDosPuntos+this.canastaTresPuntos;
    }

    
}
