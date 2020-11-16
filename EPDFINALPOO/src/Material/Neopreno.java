package Material;

public class Neopreno implements IReservable {

    private String marca;
    private String categoria;
    private int talla;
    private boolean mangasLargas;
    private boolean piernasLargas;
    private int cremallera;
    public static final int DELANTERA = 1;
    public static final int TRASERA = 2;
    public static final int SIN = 3;
    private static int[] precios;
    private double suplemento;

    public Neopreno(String marca, String categoria, int talla, boolean mangasLargas, boolean piernasLargas, int cremallera, double suplemento) {
        this.marca = marca;
        this.categoria = categoria;
        this.talla = talla;
        this.mangasLargas = mangasLargas;
        this.piernasLargas = piernasLargas;
        this.cremallera = cremallera;
        this.suplemento = suplemento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public static int[] getPrecios() {
        return precios;
    }

    public static void setPrecios(int[] aPrecios) {
        precios = aPrecios;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public boolean isMangasLargas() {
        return mangasLargas;
    }

    public void setMangasLargas(boolean mangasLargas) {
        this.mangasLargas = mangasLargas;
    }

    public boolean isPiernasLargas() {
        return piernasLargas;
    }

    public void setPiernasLargas(boolean piernasLargas) {
        this.piernasLargas = piernasLargas;
    }

    public int getCremallera() {
        return cremallera;
    }

    public void setCremallera(int cremallera) {
        String cadena = new String();
            switch(this.cremallera){
            case 1: 
                cadena = "DELANTERA";
                break;
            case 2: 
                cadena = "TRASERA";
                break;
            case 3: 
                cadena = "SIN";
                break;     
        }
    }

    public double getSuplemento() {
        return suplemento;
    }

    public void setSuplemento(double suplemento) {
        if (suplemento >= 0 && suplemento <= 1) {
            this.suplemento = suplemento;
        } else if (suplemento < 0 || suplemento > 1) {
            this.suplemento = 1;
        }
    }

    public String getDenominacion() {
        return ("Marca:" + getMarca());
    }

    public String getObservaciones() {
        return ("Categoria:" + this.getCategoria() + "Talla:" + this.getTalla() + this.isMangasLargas() + this.isPiernasLargas() + this.getCremallera() + "Suplemento:" + this.getSuplemento());
    }

    public double getPrecio(int opcion) {
        double precio = 0.0;
        try{
            precio =(precios[opcion] * suplemento)+ precios[opcion];
        }catch(NullPointerException e){
        }
        return precio; 
    }

    @Override
    public String toString() {
        return ("Marca: " + this.getMarca() + " , " + this.getCategoria() + " - Talla: " + this.getTalla() + " , " + " Talla: " + this.getTalla() + this.isMangasLargas() + this.isPiernasLargas() + this.getCremallera()+"\n");
    }

    public boolean equals(Object obj) {
        Neopreno n = (Neopreno) obj;
        if (n.getMarca().equals(this.getMarca()) && n.getCategoria().equals(this.getCategoria())
                && n.getTalla() == this.getTalla() && n.isMangasLargas() == this.isMangasLargas()
                && n.isPiernasLargas() == this.isPiernasLargas() && n.getCremallera() == this.getCremallera()) {
            return true;
        } else {
            return false;
        }

    }

}
