package Material;

public class TablaSurf implements IReservable{
    private String marca;
    private String tipo;
    private int volumen;
    private double talla;
    private int construccion;
    public final int POLIESTER = 1;
    public final int EPOXY = 2;
    public final int SOFTBOARD = 3;
    public final int HINCHABLE = 4;
    public final int INDETERMINADA = 5;
    private static int [] precios = {10,15,25,40,70,90};
    private double suplemento;
    
    public TablaSurf(String marca,String tipo,int volumen,double talla,int construccion,double suplemento){
        this.marca = marca;
        this.tipo = tipo;
        setVolumen(volumen);
        this.talla = talla;
        this.construccion = construccion;
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

    public static void setPrecios(int[] precios) {
       precios = precios;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        if(volumen>=10 && volumen<=100){
            this.volumen = volumen;
        }
        else{
            System.out.println("El volumen está comprendido entre 10  y 100");
        }
    }

    public double getTalla() {
        return talla;
    }

    public void setTalla(double talla) {
        this.talla = talla;
    }

    public int getConstruccion() {
        return construccion;
    }
    
    public void  setConstruccion(int construccion){
        String cadena = new String();
            switch(this.construccion){
            case 1: 
                cadena = "POLIESTER";
                break;
            case 2: 
                cadena = "EPOXY";
                break;
            case 3: 
                cadena = "SOFTBOARD";
                break;
            case 4: 
                cadena = "HINCHABLE";
                break;
            case 5: 
                cadena = "INDETERMINADA";
                break;     
        }
    }
   

    public double getSuplemento() {
        return suplemento;
    }

    public void setSuplemento(double suplemento) {
        if(suplemento==0 || suplemento==1){
            this.suplemento = suplemento;
        }
        else if(suplemento<0){
            this.suplemento = 0;
        }else if(suplemento>1){
            this.suplemento = 1;
        }
    }
   
    public String getDenominacion(){
        return("Marca: " + this.getMarca() + "," + "Tipo: " + this.getTipo());
    }
    
    public String getObservaciones(){
        return("Volumen: " + this.getVolumen() + "Talla: " + this.getTalla() +" Construccion: " + this.getConstruccion() + "Suplemento: " + this.getSuplemento());
    }
    
    public double getPrecio(int opcion){
        double precio = 0.0;
        precio = (precios[opcion]*suplemento) + precios[opcion];
        return precio; 
    }
    
    @Override
    public String toString() {
       return ("Marca: "+this.getMarca()+" , "+this.getTipo()+" - "+this.getVolumen()+" , "+" Talla: "+this.getTalla()+", Construcción: "+this.getConstruccion()+"\n");
    }
    
    public boolean equals(Object obj){
        TablaSurf t = (TablaSurf) obj;
        if(t.getMarca().equals(this.getMarca()) && t.getTalla()==this.getTalla() 
                && t.getTipo().equals(this.getTipo()) && t.getVolumen()==this.getVolumen() 
                && t.getConstruccion()==this.getConstruccion() ){
            return true;
        }else{
            return false;
        }
    }
    
}
