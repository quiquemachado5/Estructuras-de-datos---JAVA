
public class Nodo {
    private Nodo next;
    private Object element;
    
    public Nodo(){
        this.next = null;
        this.element = null;
    }
    public Nodo(Object element,Nodo next){
        this.next = next;
        this.element = element;
    }
    public Nodo(Object element){
        this.element = element;
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
