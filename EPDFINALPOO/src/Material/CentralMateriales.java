package Material;

import java.util.Scanner;

public class CentralMateriales {

    public static final int MAXMATERIALES = 50;
    private TablaSurf[] tablas;
    private int numTablas;
    private Neopreno[] trajes;
    private int numTrajes;

    public CentralMateriales() {
        this.tablas = new TablaSurf[MAXMATERIALES];
        this.trajes = new Neopreno[MAXMATERIALES];
    }

    public void nuevaTabla(String marca, String tipo, int volumen, double talla, int construccion, double suplemento) {
        Scanner m = new Scanner(System.in);
        if (numTablas < MAXMATERIALES) {
            int i = 0;
            while (this.tablas[i] != null && i < numTablas) {
                i++;
            }
            TablaSurf tablaNueva = new TablaSurf(marca, tipo, volumen, talla, construccion, suplemento);
            this.tablas[i] = tablaNueva;
            System.out.println("Se ha insertado la nueva tabla en la posición  " + i);
            System.out.println(" TABLA CREADA ");
            this.numTablas++;
        } else {
            System.out.println("No hay huecos para más tablas");
        }
    }

    public TablaSurf getTabla(int i) {
        TablaSurf t = null;
        if (i <= numTablas) {
            if (this.tablas[i] != null) {
                t = this.tablas[i];
            } else {
                System.out.println("No hay ninguna tabla en esa posición");
            }
        } else {
            System.out.println("El máximo de tablas es " + MAXMATERIALES);
        }
        return t;
    }

    public void eliminaTabla(TablaSurf t) {
        for (int i = 0; i < this.tablas.length; i++) {
            if (t.equals(tablas[i])) {
                this.tablas[i] = null;

                System.out.println("Se ha eliminado la tabla correctamente");
                numTablas--;
                break;
            } else {
                System.out.println("NO hemos encontrado ninguna tabla en el "
                        + "vector como la que desea eliminar");
            }

        }

    }

    public void nuevoTraje(String marca, String categoria, int talla, boolean mangasLargas, boolean piernasLargas, int cremallera, double suplemento) {
        Scanner m = new Scanner(System.in);

        if (numTrajes < MAXMATERIALES) {
            int i = 0;
            while (this.trajes[i] != null && i < numTrajes) {
                i++;
            }
            Neopreno neoprenoNuevo = new Neopreno(marca, categoria, talla, mangasLargas, piernasLargas, cremallera, suplemento);
            this.trajes[i] = neoprenoNuevo;
            this.numTrajes++;
            System.out.println("Se ha insertado el nuevo traje en la posición " + i);
            System.out.println(" TRAJE CREADO ");
        } else {
            System.out.println("No hay huecos para más trajes");
        }
    }

    public void eliminaTraje(Neopreno n) {
        for (int i = 0; i < this.trajes.length; i++) {
            if (n.equals(trajes[i])) {
                this.trajes[i] = null;
                numTrajes--;
                System.out.println("Se ha eliminado el traje correctamente");
                break;
            } else {
                System.out.println("NO hemos encontrado ningún traje en el "
                        + "vector como el que desea eliminar");
            }
        }
    }

    public Neopreno getTraje(int i) {
        Neopreno n = null;
        if (i <= numTrajes) {
            if (this.trajes[i] != null) {
                n = this.trajes[i];
            } else {
                System.out.println("No hay ninguna tabla en esa posición");
            }
        } else {
            System.out.println("El máximo de tablas es " + MAXMATERIALES);
        }
        return n;
    }

    public String tablasToString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= this.numTablas; i++) {
            if (this.tablas[i] != null) {
                sb.append("ID: " + i + " ,Info tabla:");
                sb.append(this.tablas[i].toString());
            }
        }
        return sb.toString();
    }

    public String trajesToString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= numTrajes; i++) {
            if (this.trajes[i] != null) {
                sb.append("ID: " + i + " ,Info traje:");
                sb.append(this.trajes[i].toString());
            }
        }
        return sb.toString();
    }

}