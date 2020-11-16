
import java.util.*;

public class Node {

    private int distancia = Integer.MAX_VALUE; //Declaro el atributo y lo inicializo al máximo permitido
    private boolean visited;
    private ArrayList<Edge> edges = new ArrayList<Edge>(); // ArrayList de edges

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public ArrayList<Edge> getEdges() {
        return edges;
    }

    public void setEdges(ArrayList<Edge> edges) {
        this.edges = edges;
    }
}
