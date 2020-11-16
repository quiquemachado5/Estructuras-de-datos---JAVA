package Reserva;

import Material.IReservable;
import cliente.ICliente;
import Material.TablaSurf;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Reserva {

    private static int numReserva;
    private int idReserva;
    private ICliente cliente;
    private IReservable[] materiales;
    private int numMateriales;
    private final int MAXPRODUCTOSRXRESERVA = 10;
    private int numReservas;
    private int opcionTiempo;
    public final int UNAHORA = 0;
    public final int MEDIODIA = 1;
    public final int UNDIA = 2;
    public final int DOSDIAS = 3;
    public final int CUATRODIAS = 4;
    public final int UNASEMANA = 5;
    private GregorianCalendar fechaReserva;
    private double total;

    public Reserva(ICliente cliente, int opcionTiempo, GregorianCalendar fechaReserva) {
       this.numReserva++;
       this.idReserva = this.numReserva;
       this.cliente = cliente;
       
       this.opcionTiempo = opcionTiempo;
       this.fechaReserva = fechaReserva;

    }

    public void addMaterial(IReservable material) {
        this.materiales = new IReservable[MAXPRODUCTOSRXRESERVA];
        if (numMateriales < MAXPRODUCTOSRXRESERVA) {
            this.materiales[numMateriales] = material;
            numMateriales++;
            this.total = this.numMateriales*material.getPrecio(this.opcionTiempo);
        } else {
            System.out.println("No hay espacio suficiente para añadir un nuevo material");
            
        }

    }

    public double getTotal() {
        return this.total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n Reserva número: " + this.idReserva );
        sb.append("\n realizada por: " + this.cliente.getNombre());
        sb.append(" con DNI: " + this.cliente.getDNI());
        sb.append(" Email: " + this.cliente.getEmail() + " y teléfono: " + this.cliente.getTlf());
        sb.append(this.cliente.getNumReservas() + " ,desde " + this.cliente.getFechaInicio().get(Calendar.YEAR));
        sb.append("\n Por un tiempo de " + this.opcionTiempo);
        sb.append(" para el día " + this.fechaReserva.get(Calendar.DATE)+"/"+this.fechaReserva.get(Calendar.MONTH)+1+"/"+this.fechaReserva.get(Calendar.YEAR));
        for (int i = 0; i < numMateriales; i++) {
            sb.append("\n"+this.materiales[i].toString());
        }
        sb.append("--> Total: ");
        sb.append(this.getTotal());
        sb.append("€");
        sb.append("\n");

        return sb.toString();
    }

}
