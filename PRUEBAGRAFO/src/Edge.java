public class Edge {
    private Node origen;
    private Node destino;
    private int distancia;
 
    public Edge(Node origen, Node destino, int distancia) {
        this.origen = origen;
        this.destino = destino;
        this.distancia = distancia;
    }
 
    public Node getOrigen() {
        return origen;
    }
 
    public void setOrigen(Node origen) {
        this.origen = origen;
    }
 
    public Node getDestino() {
        return destino;
    }
 
    public void setDestino(Node destino) {
        this.destino = destino;
    }
 
    public double getDistancia() {
        return distancia;
    }
 
    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }
 
    @Override
    public String toString() {
        return "\n Edge [Origen = " + origen.getCity() + ", Destino = " + destino.getCity() + ", Distancia = "
                + distancia + "]";
    }
 
}