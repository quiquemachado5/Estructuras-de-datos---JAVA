
import java.util.Iterator;


public interface Graph {

    Vertex[] endVertices(Edge e);

    Edge opposite(Vertex v, Edge e);

    //boolean areAdjacent(Vertex w, Vertex w);

    boolean replace(Vertex v, Object x);

    boolean replace(Edge e, Object x);

    boolean insertVertex(Object o);

    boolean insertEdge(Vertex v, Vertex w, Object o);

    boolean removeVertex(Vertex v);

    boolean removeEdge(Edge e);

    Iterator vertices();

    Iterator edges();
}
