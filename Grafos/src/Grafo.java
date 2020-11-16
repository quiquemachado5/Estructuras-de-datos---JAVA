import java.util.*;

public class Grafo implements IGrafo {

        List<Vertex> vertices;
        List<Edge> aristas;
        int[][] costos;
        
        public Grafo(){
            costos = new int[30][30];
            for (int i = 0; i < 30; i++) {
                for (int j = 0; j < 30; j++) {
                    costos[i][j]=0;
                }
            }
        }
 
    @Override
    public Vertex[] endVertices(Edge e) {
        if(e==null){
            return null;
        }
        else{
            Vertex[] vertices = new Vertex[2];
            vertices[0]=e.getOrigin();
            vertices[1]=e.getNext();
            return vertices;
        }
    }

    @Override
    public Vertex opposite(Vertex v, Edge e) {
        if (e == null || v==null) {
            return null;
        } else {
            if (e.getOrigin().equals(v)) {
                return e.getNext();
            } else {
                return e.getOrigin();
            }
        }
    }

    @Override
    public boolean areAdjacent(Vertex x, Vertex w) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean replace(Vertex v, Object x) {
        boolean exito=true;
        if(x==null || v==null){
            exito=false;
        }
        else{
            v.setId(x);
        }
        return exito;
    }

    @Override
    public boolean replace(Edge e, Object x) {
        boolean exito=true;
        if(x==null || e==null){
            exito=false;
        }
        else{
            e.setElement(x);
        }
        return exito;
    }

    @Override
    public boolean insertVertex(Object o) {
        boolean exito= true;
        
        if(o==null){
            exito = false;
        }
        else{
            Vertex vertice = new Vertex(o);
            vertices.add((Vertex) o);
        }
        return exito;
    }

    @Override
    public boolean insertEdge(Vertex v, Vertex w, Object o) {
        boolean exito = true;
        if(v==null || w==null || o==null){
            exito = false;
        }
        else{
            Edge arista = new Edge(o,v,w);
            aristas.add(arista);
        }
        return exito;
    }

    @Override
    public boolean removeVertex(Vertex v) {
        boolean exito = true;
        if(v==null){
            exito=false;
        }
        else{
            
        }
        return exito;
    }

    @Override
    public boolean removeEdge(Edge e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterator vertices() {
        Iterator it = vertices.iterator();
        return it;
    }

    @Override
    public Iterator edges() {
        Iterator it = aristas.iterator();
        return it;
    }

}