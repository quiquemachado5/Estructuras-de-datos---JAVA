import java.util.*;

public class CaminoMinimo extends Graph {

    public CaminoMinimo(Edge[] edges) {

        this.aristas = edges;
        this.numNodos = calcularNumNodos(edges); // me calcula el numero de nodos a partir de los aristas llamando al método
        this.nodos = new Node[this.numNodos]; // me crea un array de nodos del num de nodos calculado previamente
        for (int n = 0; n < this.numNodos; n++) { // me inicializa cada nodo
            this.nodos[n] = new Node();
        }
        this.numAristas = edges.length;
        for (int edgeToAdd = 0; edgeToAdd < this.numAristas; edgeToAdd++) {
            this.nodos[edges[edgeToAdd].getNodoInicial()].getEdges().add(edges[edgeToAdd]);
            this.nodos[edges[edgeToAdd].getNodoFinal()].getEdges().add(edges[edgeToAdd]);
        }

    }

    public int calcularNumNodos(Edge[] edges) {
        int numNodos = 0;
        for (Edge e : edges) { //me recorre todos las aristas
            if (e.getNodoFinal() > numNodos) {
                numNodos = e.getNodoFinal();
            }
            if (e.getNodoInicial() > numNodos) {
                numNodos = e.getNodoInicial();
            }
        }
        numNodos++;
        return numNodos;
    }

    public void calcularDistanciaMasCorta() {
        this.nodos[0].setDistancia(0); //nodo 0 es como la raiz desde donde calcularemos todos, en mi caso es A
        int nodoSiguiente = 0;
        for (int i = 0; i < this.nodos.length; i++) { //el for va visitando cada nodo
            ArrayList<Edge> currentNodeEdges = this.nodos[nodoSiguiente].getEdges(); //coge los y va haciendo diferentes arraylists
            for (int joinedEdge = 0; joinedEdge < currentNodeEdges.size(); joinedEdge++) { //recorre de ese currentNodeEdge todos sus edges
                int neighbourIndex = currentNodeEdges.get(joinedEdge).getNeighbourIndex(nodoSiguiente); //almacena neighbour el edge que esta visitando
                // only if not visited
                if (!this.nodos[neighbourIndex].isVisited()) { // si no está visitado: 
                    int tentative = this.nodos[nodoSiguiente].getDistancia() + currentNodeEdges.get(joinedEdge).getDistancia(); //me guarda en tentative la distancia
                    if (tentative < nodos[neighbourIndex].getDistancia()) {
                        nodos[neighbourIndex].setDistancia(tentative);
                    }
                }
            }
            nodos[nodoSiguiente].setVisited(true); //en cada iteracion activa a true el booleano de visitado
            nodoSiguiente = getNodeShortestDistanced();
        }
    }
    public int getNodeShortestDistanced() {
        int storedNodeIndex = 0;
        int storedDist = Integer.MAX_VALUE;
        for (int i = 0; i < this.nodos.length; i++) {
            int currentDist = this.nodos[i].getDistancia();
            if (!this.nodos[i].isVisited() && currentDist < storedDist) {
                storedDist = currentDist;
                storedNodeIndex = i;
            }
        }
        return storedNodeIndex;
    }

    public void printResult() { //Método que imprime la distancia a cada almacén del problema
        String output = "\nTotal de nodos: " + this.numNodos + " y total de aristas: " + this.numAristas;
        for (int i = 0; i < this.nodos.length; i++) {
            if(i==1){
                output += ("\nLa distancia más corta del almacén A a B es: " + nodos[i].getDistancia());
            }
            if(i==2){
                output += ("\nLa distancia más corta del almacén A a C es: " + nodos[i].getDistancia());
            }
            if(i==3){
                output += ("\nLa distancia más corta del almacén A a D es: " + nodos[i].getDistancia());
            }
            if(i==4){
                output += ("\nLa distancia más corta del almacén A a E es: " + nodos[i].getDistancia());
            }
            }
        System.out.println(output);
    }
}
