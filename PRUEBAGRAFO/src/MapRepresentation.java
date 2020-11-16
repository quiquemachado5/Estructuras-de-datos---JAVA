public class MapRepresentation {
 
    public static Graph getCities() {
        Node a = new Node("A");
        Node b = new Node("B");
        Node c = new Node("C");
        Node d = new Node("D");
        Node e = new Node("E");
 
        a.addEdge(new Edge(a, b, 6));
        a.addEdge(new Edge(a, d, 1));
 
        b.addEdge(new Edge(b, a, 6));
        b.addEdge(new Edge(b, c, 5));
        b.addEdge(new Edge(b, e, 2));
        b.addEdge(new Edge(b, d, 2));
        
        c.addEdge(new Edge(c, b, 5));
        c.addEdge(new Edge(c, e, 5));
 
        d.addEdge(new Edge(d, e, 1));
        d.addEdge(new Edge(d, a, 1));
        d.addEdge(new Edge(d, b, 2));
        
        d.addEdge(new Edge(e, b, 2));
        d.addEdge(new Edge(e, c, 5));
        d.addEdge(new Edge(e, d, 1));
        
 
        Graph graph = new Graph();
        graph.addNode(a);
        graph.addNode(b);
        graph.addNode(c);
        graph.addNode(d);
        return graph;
    }
 
    public static void main(String[] args) {
        Graph graph = getCities();
        System.out.println(graph);
    }
}