package cliente;

public class CentralClientes {

    public static final int MAXMCLIENTES = 50;

    private Cliente[] clientes;
    private int numClientes;

    public CentralClientes() {
        this.clientes = new Cliente[MAXMCLIENTES];
        this.numClientes = 0;
    }

    public void nuevoCliente(String nombre, String DNI, String email, String tlf) {

        this.clientes[numClientes++] = new Cliente(nombre, DNI, email, tlf);
    }

    public Cliente buscaCliente(String dni) {
        Cliente cliente = null;
        int i = 0;
        boolean enc = false;

        while (!enc && (i < numClientes)) {
            if (clientes[i].getDNI().equals(dni)) {
                enc = true;
            } else {
                i++;
            }
        }
        if (enc) {
            cliente = clientes[i];
        }

        return cliente;
    }
}
