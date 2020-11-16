import java.util.*;
public class PruebaBaloncesto {
    public static void main(String[] args) {
        
        
        Jugador j1 = new Jugador(23,34,12);
        Jugador j2 = new Jugador(89,14,35);
        Jugador j3 = new Jugador(89,10,0);
        Jugador j4 = new Jugador(11,0,1);
        
        Equipo e1 = new Equipo();
        
        e1.agregar(j1);
        e1.agregar(j2);
        e1.agregar(j3);
        e1.agregar(j4);
        
        e1.imprimir();
        e1.ordenar();
        e1.imprimir();
    }
}
