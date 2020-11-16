import java.util.ArrayList;
import java.util.List;
 
public class Graph {
 
    private List<Node> nodes;
 
    public void addNode(Node node) {
        if (nodes == null) {
            nodes = new ArrayList<>();
        }
        nodes.add(node);
    }
 
    public List<Node> getNodes() {
        return nodes;
    }
 
    @Override
    public String toString() {
        return "Graph [nodes=" + nodes + "]";
    }
 
}