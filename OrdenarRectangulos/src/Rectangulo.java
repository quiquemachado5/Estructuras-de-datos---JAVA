import java.util.*;

public class Rectangulo implements IRectangulo{
    private int ancho;
    private int largo;
    private int area;
    
    
    public Rectangulo(int ancho,int largo){
        this.ancho = ancho;
        this.largo = largo;
        this.area = area;
    }
    
    @Override
    public void setLargo(int largo) {
        this.largo=largo;
    }

    @Override
    public int getLargo() {
        return this.largo;
    }

    @Override
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    @Override
    public int getAncho() {
        return this.ancho;
    }
    
    public int calcularArea(int largo,int ancho){
        area = largo * ancho;
        return area;
    }

    
    @Override
    public String toString(){
        return ("Area rectangulo: "+this.area);
    }
}
