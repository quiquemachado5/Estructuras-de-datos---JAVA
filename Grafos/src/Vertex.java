public class Vertex {

    Object id;
    Vertex next;
    Edge edge;

    public Vertex(Object ele) {
        this.id = ele;
        this.next = null;
        this.edge = null;
    }
    
    public Object getId(){
        return this.id;
    }
    
    public void setId(Object id){
        this.id=id;
    }
    
    public Vertex getNext(){
        return this.next;
    }
    
    public void setNext(Vertex next){
        this.next=next;
    }
    
    public Edge getEdge(){
        return this.edge;