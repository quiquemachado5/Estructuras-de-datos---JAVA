package Reserva;

import cliente.CentralClientes;
import Material.CentralMateriales;
import Material.Neopreno;
import Material.TablaSurf;
import cliente.Cliente;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class VentanaReservas {

    private CentralReservas centralReservas;
    private CentralClientes centralClientes;
    private CentralMateriales centralMateriales;

    public VentanaReservas(CentralClientes centralClientes, CentralMateriales centralMateriales, CentralReservas centralReservas) {
        this.centralClientes = centralClientes;
        this.centralMateriales = centralMateriales;
        this.centralReservas = centralReservas;
    }

    public void mostrarMenuGestionReservas() {
        Scanner s = new Scanner(System.in);
        int opc = -1;

        do {
            System.out.println("\n\n\n\tMenú Gestión Reservas:\n");
            System.out.println("\t1. Realizar Reserva");
            System.out.println("\t2. Listado de Reservas");
            System.out.println("\t3. Cancelar Reserva");
            System.out.println("\t4. Consolidar Reserva");
            System.out.println("\t---------------------");
            System.out.println("\t\t0. Salir");
            System.out.print("\n\n--> Introduzca una opción: ");
            opc = s.nextInt();
            while (opc < 0 || opc > 4) {
                System.out.print("--> Introduzca una opción valida: ");
                opc = s.nextInt();
                System.out.println("\n");
            }
            if (opc != 0) {
                realizarOpcionGestionReserva(opc);
            }
        } while (opc != 0);
    }

    private void realizarOpcionGestionReserva(int opc) {
        if (opc == 1) {
            mostrarRealizarReserva();
        } else if (opc == 2) {
            mostrarListadoReservas();
        } else if (opc == 3) {
            System.out.println("Opción no disponible");
        } else if (opc == 4) {
            System.out.println("Opción no disponible");
        }

    }

    private void mostrarRealizarReserva() {
        Scanner s = new Scanner(System.in);
        System.out.println("Dame tu DNI para comprobar si estás inscrito:");
        String DNI = s.next();
        Cliente c;
        if (this.centralClientes.buscaCliente(DNI) != null) {
            System.out.println("Encontrado cliente con DNI:" + DNI);
            c = this.centralClientes.buscaCliente(DNI);
        } else {
            System.out.println("Ningún cliente tiene ese DNI");
            System.out.println("Dame un nombre: ");
            String nombre = s.next();
            System.out.println("Dame un e-mail:");
            String email = s.next();
            System.out.println("Dame un teléfono: ");
            String tlf = s.next();
            this.centralClientes.nuevoCliente(nombre, DNI, email, tlf);
            c = this.centralClientes.buscaCliente(DNI);
        }

        int opcTiempo = 0;
        System.out.println("Dame un tiempo de reserva");
        do {
            System.out.println("Están disponibles las opciones: ");
            System.out.println(" - Pulse O ---> UNA HORA");
            System.out.println(" - Pulse 1 ---> MEDIODÍA");
            System.out.println(" - Pulse 2 ---> UN DÍA");
            System.out.println(" - Pulse 3 ---> DOS DÍAS");
            System.out.println(" - Pulse 4 ---> CUATRO DÍAS");
            System.out.println(" - Pulse 5 ---> UNA SEMANA");
            opcTiempo = s.nextInt();
        } while (opcTiempo < 0 || opcTiempo > 5);

        boolean fechaCorrecta;
        Date fecha = new Date();
        do {
            fechaCorrecta = true;
            System.out.println("Vamos a introducir la fecha de la reserva");
            System.out.println("Introduzca un día [1-31]: ");
            String dia = s.next();
            System.out.println("Introduzca un mes [1-12]: ");
            String mes = s.next();
            System.out.println("Introduzca un año: ");
            String anio = s.next();

            DateFormat df = new SimpleDateFormat("ddMMyyyy");
            try {
                fecha = df.parse(dia + mes + anio);
            } catch (ParseException ex) {
                fechaCorrecta = false;
                System.out.println("Has introducido mal la fecha");
            }
        } while (!fechaCorrecta);
        Calendar calendario = Calendar.getInstance();
        calendario.setTime(fecha);

        Reserva r = new Reserva(c, opcTiempo, (GregorianCalendar) calendario);

        System.out.println("A continuación elija que material quiere reservar: ");
        int opc;
        do {
            System.out.println(" - Pulse O ---> Tablas de Surf ");
            System.out.println(" - Pulse 1 ---> Trajes de Neopreno ");
            opc = s.nextInt();
        } while (opc < 0 && opc > 1);
        if (opc == 0) {
            System.out.println("Reserva tabla de surf.");
            System.out.println(this.centralMateriales.tablasToString());
            System.out.println("Escoja una tabla");
            opc = s.nextInt();
            TablaSurf t = this.centralMateriales.getTabla(opc);
            if(t !=null){
                System.out.println(t.toString());
                r.addMaterial(t);
                
                System.out.println("Tabla reservada.");
            }else{
                System.out.println("Tabla no encontrada.");
            }
        }else{
            System.out.println("Reserva traje de neopreno");
            System.out.println(this.centralMateriales.trajesToString());
            System.out.println("Escoja un traje");
            opc = s.nextInt();
            Neopreno n = this.centralMateriales.getTraje(opc);
            if(n != null){
                System.out.println(n.toString());
                r.addMaterial(n);
            }else{
                System.out.println("Traje no encontrado");
            }
        }
        this.centralReservas.addReserva(r);
    }

    private void mostrarListadoReservas() {
        System.out.println(this.centralReservas.toString());
    }
}
