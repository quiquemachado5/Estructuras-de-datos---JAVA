import java.util.*;

public class Equipo implements IEquipo,Comparator<IJugador>{
    
    private List<IJugador> equipo;
    
    public Equipo(){
        this.equipo = new ArrayList<>();
    }

    @Override
    public int compare(IJugador o1, IJugador o2) {
        int res;
        if(o1.getPuntos()-o2.getPuntos()>0){
            res = 1;
        }else{
            if(o1.getPuntos()-o2.getPuntos()<0){
                res = -1;
            }else{
                res = 0;
            }
        }
        return res;
    }

    @Override
    public void agregar(IJugador jugador) {
        equipo.add(jugador);
    }

    @Override
    public void borrar(IJugador jugador) {
        equipo.remove(jugador);
    }

    public void ordenar(){
        Collections.sort(equipo, new ComparadorJugadores());
    }
    
    public void imprimir(){
        Iterator it = equipo.iterator();
        while(it.hasNext()){
            System.out.println("Jugador: "+it.next()); 
        }
    }
    
    
}
