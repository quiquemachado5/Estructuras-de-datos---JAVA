package principal;


import cliente.CentralClientes;
import java.util.Scanner;
import Material.CentralMateriales;
import Material.VentanaMateriales;
import Reserva.CentralReservas;
import Reserva.VentanaReservas;

public class PantallaPrincipal {

//    private VentanaClientes ventanaClientes;
    private VentanaMateriales ventanaMateriales;
    private VentanaReservas ventanaReservas;

    public PantallaPrincipal() {
        CentralClientes clientes = new CentralClientes();
//        this.ventanaClientes = new VentanaClientes(clientes);
        inicializarClientes(clientes, 4);

        CentralMateriales materiales = new CentralMateriales();
        this.ventanaMateriales = new VentanaMateriales(materiales);
        inicializaMateriales(materiales, 3);

        CentralReservas reservas = new CentralReservas();
        this.ventanaReservas = new VentanaReservas(clientes, materiales, reservas);


    }

    public void mostrarOpciones() {
        Scanner s = new Scanner(System.in);
        int opc = -1;

        do {
            System.out.println("\n\n\n\tMenú Principal:\n");
            System.out.println("\t1. Gestión de Clientes --> NO OPERATIVO!!!");
            System.out.println("\t2. Gestión de Materiales");
            System.out.println("\t3. Gestión de Reservas");
            System.out.println("\t---------------------");
            System.out.println("\t\t0. Salir");
            System.out.print("\n\n--> Introduzca una opción: ");
            opc = s.nextInt();
            while (opc < 0 || opc > 3) {
                System.out.print("--> Introduzca una opción valida: ");
                opc = s.nextInt();
                System.out.println("\n");
            }
            if (opc != 0) {
                realizarOpcion(opc);
            }
        } while (opc != 0);
    }

    void realizarOpcion(int opc) {
        switch (opc) {
            case 1:
//                this.ventanaClientes.mostrarMenuGestionClientes();
                System.out.println("Esta opción no está operativa.");
                break;
            case 2:
                this.ventanaMateriales.mostrarMenuGestionMateriales();
                break;
            case 3:
                this.ventanaReservas.mostrarMenuGestionReservas();
        }
    }

    private void inicializarClientes(CentralClientes clientes, int numCli) {
        for (int i = 0; i < numCli; i++) {
            clientes.nuevoCliente("Nombre" + i, "dni" + i, "email" + i, "telf" + i);
        }
    }

    private void inicializaMateriales(CentralMateriales materiales, int num) {
        for (int i = 0; i < num; i++) {
            materiales.nuevaTabla("marca" + i, "tipo" + i, 40 + i, 7 + i, 2 + i, 0);
            materiales.nuevoTraje("Marca" + i, "categoria" + i, 38 + i, true, true, 1 + i, 0);
        }
    }
}
