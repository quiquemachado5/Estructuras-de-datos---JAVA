import java.util.Iterator;

public interface IGrafo {

    Vertex[] endVertices(Edge e);

    Vertex opposite(Vertex v, Edge e);

    boolean areAdjacent(Vertex x, Vertex w);

    boolean replace(Vertex v, Object x);

    boolean replace(Edge e, Object x);

    boolean insertVertex(Object o);

    boolean insertEdge(Vertex v, Vertex w, Object o);

    boolean removeVertex(Vertex v);

    boolean removeEdge(Edge e);

    Iterator vertices();

    Iterator edges();

}
