package Reserva;

public class CentralReservas {
    private int MAXRESERVAS = 100;
    private int numReservas;
    private Reserva[] reservas;
    
    public CentralReservas(){
        this.reservas = new Reserva[MAXRESERVAS];
   
    }
    
    public void addReserva(Reserva reserva){
        this.reservas[numReservas] = reserva;
        numReservas++;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numReservas; i++) {
            sb.append(this.reservas[i].toString());
        }
        return sb.toString();
    }
    
}
