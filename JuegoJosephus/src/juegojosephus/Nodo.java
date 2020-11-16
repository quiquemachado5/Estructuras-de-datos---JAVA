package juegojosephus;


public class Nodo {
    public Object elemento;
    public Nodo siguiente;
    
    public Nodo(){
        setElemento(null);
        setSiguiente(null);
    }
    public Nodo(Object element){
        setElemento(element);
        setSiguiente(null);
    }
    public Nodo(Object element, Nodo next){
        setElemento(element);
        setSiguiente(next);
    }
    public Nodo getSiguiente(){
        return this.siguiente;
    }
    public void setSiguiente(Nodo sig){
        this.siguiente=sig;
    }
    public Object getElemento(){
        return this.elemento;
    }
    public void setElemento(Object elemento){
        this.elemento=elemento;
    }
}
