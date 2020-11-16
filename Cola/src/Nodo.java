
public class Nodo {
    private Nodo next;
    private Object element;
    
    public Nodo(){
        setElement(null);
        setNext(null);
    }
    public Nodo(Object element){
        setElement(element);
        setNext(null);
    }
    public Nodo(Nodo next,Object element){
        setElement(element);
        setNext(next);
    }

    public Nodo getNext() {
        return next;
    }
    public void setNext(Nodo next) {
        this.next = next;
    }
    public Object getElement() {
        return element;
    }
    public void setElement(Object element) {
        this.element = element;
    }
    
}
