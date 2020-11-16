import java.util.ArrayList;
import java.util.List;
 

public class Node {
    private String localizacion;
    private List<Edge> edges;
 
    public Node(String localizacion) {
        this.localizacion = localizacion;
    }
 
    public String getCity() {
        return localizacion;
    }
 
    public void setCity(String localizacion) {
        this.localizacion = localizacion;
    }
 
    public List<Edge> getEdges() {
        return edges;
    }
 
    public void addEdge(Edge edge) {
        if (edges == null) {
            edges = new ArrayList<>();
        }
        edges.add(edge);
    }
 
    @Override
    public String toString() {
        return "\n \tNode [Localización: =" + localizacion + ", edges=" + edges + "]";
    }
}
