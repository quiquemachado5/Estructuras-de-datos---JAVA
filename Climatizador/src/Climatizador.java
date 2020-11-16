
public class Climatizador {
    private boolean encendido;
    private float temperaturaActual;
    private float temperaturaDeseada;
    
    //Constructores
        //Constructor por defecto
    
    public Climatizador(){
        encendido =  false;
        temperaturaActual  =  23;
        temperaturaDeseada =  25;
    }
        //Constructores observadores y modificadores
    
    public boolean apagar(){
        if (encendido==true){
            this.encendido = false;
        }
        return encendido;
    }
            
    public boolean encender(){
        if (encendido==false){
            this.encendido = true;
        }
        return encendido;
    }
    
    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public float getTemperaturaActual() {
        return temperaturaActual;
    }

    public void setTemperaturaActual(float temperaturaActual) {
        this.temperaturaActual = temperaturaActual;
    }

    public float getTemperaturaDeseada() {
        return temperaturaDeseada;
    }

    public void setTemperaturaDeseada(float temperaturaDeseada) {
        this.temperaturaDeseada = temperaturaDeseada;
    }
    
    //Métodos
    public float enfriar(){
        temperaturaActual -= 0.5 ;
        return temperaturaActual;
        
    }
    public float calentar(){
        temperaturaActual += 0.5;
        return temperaturaActual;
    }
}
