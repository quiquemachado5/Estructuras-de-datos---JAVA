
public interface IModeloCoche {
    public int getAnyoDeFabricacion();
    public void setAnyoDeFabricacion(int anyo);
    public int getVelocidadMaxima();
    public void setVelocidadMaxima(int velocidadMaxima);
    public float getPrecio();
    public void setPrecio(float precio);
    public String getNombreModelo();
    public void setNombreModelo(String nombreModelo);
    public String getMarcaModelo();
    public void setMarcaModelo(String marcaModelo);
    
    @Override
    public String toString();
}
