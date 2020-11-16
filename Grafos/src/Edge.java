public class Edge {

    Object element;
    Vertex origin;
    Vertex next;

    public Edge(Object ele) {
        this.element = ele;
        this.origin = null;
        this.next = null;
    }

    public Edge(Object ele, Vertex or, Vertex nx) {
        this.element = ele;
        this.origin = or;
        this.next = nx;
    }
    
    public Object getElement(){
        return this.element;
    }
    
    public void setElement(Object element){
        this.element=element;
    }
    
    public Vertex getOrigin(){
        return this.origin;
    }
    
    public void setOrigin(Vertex origin){
        this.origin=origin;
    }
    
    public Vertex getNext(){
        return this.next;
    }
    
    public void setNext(Vertex next){
        this.next=next;
    }

}
