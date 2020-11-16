
public class Edge {

    Object element;
    Edge next;

    public Edge(Object ele) {
        this.element = ele;
        this.next = null;
    }

    public Edge(Object ele, Edge n) {
        this.element = ele;
        this.next = n;
    }
}
