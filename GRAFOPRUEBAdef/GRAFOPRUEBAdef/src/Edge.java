
public class Edge {

    private int nodoInicial;
    private int nodoFinal;
    private int distancia;

    public Edge(int nodoInicial, int nodoFinal, int costo) {
        this.nodoInicial = nodoInicial;
        this.nodoFinal = nodoFinal;
        this.distancia = costo;
    }

    public int getNodoInicial() {
        return nodoInicial;
    }

    public int getNodoFinal() {
        return nodoFinal;
    }

    public int getDistancia() {
        return distancia;
    }

    // determines the neighbouring node of a supplied node, based on the two nodes connected by this edge

    public int getNeighbourIndex(int nodeIndex) {
        if (this.nodoInicial == nodeIndex) {
            return this.nodoFinal;
        } else {
            return this.nodoInicial;
        }
    }
}
