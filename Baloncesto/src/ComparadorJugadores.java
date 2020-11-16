
import java.util.Comparator;


public class ComparadorJugadores implements Comparator<IJugador> {

    
    @Override
    public int compare(IJugador o1, IJugador o2) {
        int res = o1.getCanastasUnPunto()-o2.getCanastasUnPunto();
        if(res != 0){
            return res ;
        }
        res = o1.getCanastasDosPuntos()-o2.getCanastasDosPuntos();
        if(res != 0){
            return res;
        }else{
            return o1.getCanastasTresPuntos()-o2.getCanastasTresPuntos();
        }
    
    }
    
}
