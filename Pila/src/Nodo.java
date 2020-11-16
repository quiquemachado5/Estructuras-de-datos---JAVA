
public class Nodo {
    
    public Nodo next;
    public Object element;

    public Nodo() {
        setElement(null);
        setNext(null);
    }
    public Nodo(Object element){
        setElement(element);
        setNext(null);
    }
    public Nodo(Object element,Nodo next){
        setElement(element);
        setNext(next);
    }

    public Nodo getNext() {
        return next;
    }
    public void setNext(Nodo next) {
        this.next = next;
    }
    public Object getElement(){
        return this.element;
    }
    public void setElement(Object element){
        this.element = element;
    }
}
