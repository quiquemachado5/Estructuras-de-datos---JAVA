
public class Vertex {

    Object id;
    Vertex next;
    Edge edge;

    public Vertex(Object ele) {
        this.id = ele;
        this.next = null;
        this.edge = null;
    }
}
