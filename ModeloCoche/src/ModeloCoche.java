
public class ModeloCoche implements IModeloCoche{
    private int anyo;
    private int velocidadMaxima;
    private String nombreModelo;
    private float precio;
    private String marcaModelo;
    
    public ModeloCoche(String nombreModelo,String marcaModelo,int precio,int anyo,int velocidadMaxima){
        this.anyo = anyo;
        this.marcaModelo = marcaModelo;
        this.velocidadMaxima = velocidadMaxima;
        this.nombreModelo = nombreModelo;
        this.precio = precio;
    }
    @Override
    public int getAnyoDeFabricacion() {
        return this.anyo;
    }

    @Override
    public void setAnyoDeFabricacion(int anyo) {
        this.anyo = anyo;
    }

    @Override
    public int getVelocidadMaxima() {
        return this.velocidadMaxima;
    }

    @Override
    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public float getPrecio() {
        return this.precio;
    }

    @Override
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String getNombreModelo() {
        return this.nombreModelo;
    }

    @Override
    public void setNombreModelo(String nombreModelo) {
        this.nombreModelo = nombreModelo;
    }

    @Override
    public String getMarcaModelo() {
        return this.marcaModelo;
    }

    @Override
    public void setMarcaModelo(String marcaModelo) {
        this.marcaModelo = marcaModelo;
    }
    
    @Override
    public String toString(){
        return ("Coche: "+this.nombreModelo+" "+this.marcaModelo+" "+this.anyo+" "+this.precio+" "+this.velocidadMaxima);
    }
}
