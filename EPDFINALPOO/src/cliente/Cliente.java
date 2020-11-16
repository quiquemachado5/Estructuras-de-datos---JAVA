package cliente;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Cliente extends Persona implements ICliente {

    private int numReservas;
    private GregorianCalendar fechaInicio;

    public Cliente(String nombre, String DNI, String email, String tlf) {
        super(nombre, DNI, email, tlf);
        this.numReservas = 0;
        this.fechaInicio = new GregorianCalendar();
    }

    public int getNumReservas() {
        return numReservas;
    }

    public GregorianCalendar getFechaInicio() {
        return fechaInicio;
    }

    public void incrementaNumReservas() {
        this.numReservas++;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\t(" + numReservas + " reservas" 
                + ", desde " + fechaInicio.get(Calendar.YEAR) + ").";
    }
    
    
}

