
import java.util.*;

public class CaminoMinimo extends Graph {

    public CaminoMinimo(Edge[] edges) {

        this.edges = edges;
        // create all nodes ready to be updated with the edges
        this.noOfNodes = calculateNoOfNodes(edges);
        this.nodes = new Node[this.noOfNodes];
        for (int n = 0; n < this.noOfNodes; n++) {
            this.nodes[n] = new Node();
        }
        // add all the edges to the nodes, each edge added to two nodes (to and from)
        this.noOfEdges = edges.length;
        for (int edgeToAdd = 0; edgeToAdd < this.noOfEdges; edgeToAdd++) {
            this.nodes[edges[edgeToAdd].getFromNodeIndex()].getEdges().add(edges[edgeToAdd]);
            this.nodes[edges[edgeToAdd].getToNodeIndex()].getEdges().add(edges[edgeToAdd]);
        }

    }

    public int calculateNoOfNodes(Edge[] edges) {
        int noOfNodes = 0;
        for (Edge e : edges) {
            if (e.getToNodeIndex() > noOfNodes) {
                noOfNodes = e.getToNodeIndex();
            }
            if (e.getFromNodeIndex() > noOfNodes) {
                noOfNodes = e.getFromNodeIndex();
            }
        }
        noOfNodes++;
        return noOfNodes;
    }

    public void calculateShortestDistances() {
        // node 0 as source
        this.nodes[0].setDistanceFromSource(0);
        int nextNode = 0;
        // visit every node
        for (int i = 0; i < this.nodes.length; i++) {
            // loop around the edges of current node
            ArrayList<Edge> currentNodeEdges = this.nodes[nextNode].getEdges();
            for (int joinedEdge = 0; joinedEdge < currentNodeEdges.size(); joinedEdge++) {
                int neighbourIndex = currentNodeEdges.get(joinedEdge).getNeighbourIndex(nextNode);
                // only if not visited
                if (!this.nodes[neighbourIndex].isVisited()) {
                    int tentative = this.nodes[nextNode].getDistanceFromSource() + currentNodeEdges.get(joinedEdge).getLength();
                    if (tentative < nodes[neighbourIndex].getDistanceFromSource()) {
                        nodes[neighbourIndex].setDistanceFromSource(tentative);
                    }
                }
            }
            // all neighbours checked so node visited
            nodes[nextNode].setVisited(true);
            // next node must be with shortest distance
            nextNode = getNodeShortestDistanced();
        }
    }

    // now we're going to implement this method in next part !
    public int getNodeShortestDistanced() {
        int storedNodeIndex = 0;
        int storedDist = Integer.MAX_VALUE;
        for (int i = 0; i < this.nodes.length; i++) {
            int currentDist = this.nodes[i].getDistanceFromSource();
            if (!this.nodes[i].isVisited() && currentDist < storedDist) {
                storedDist = currentDist;
                storedNodeIndex = i;
            }
        }
        return storedNodeIndex;
    }

    public void printResult() {
        String output = "\nTotal de nodos: " + this.noOfNodes + " y total de aristas: " + this.noOfEdges;
        for (int i = 0; i < this.nodes.length; i++) {
            if(i==1){
                output += ("\nLa distancia más corta del almacén A a B es: " + nodes[i].getDistanceFromSource());
            }
            if(i==2){
                output += ("\nLa distancia más corta del almacén A a C es: " + nodes[i].getDistanceFromSource());
            }
            if(i==3){
                output += ("\nLa distancia más corta del almacén A a D es: " + nodes[i].getDistanceFromSource());
            }
            if(i==4){
                output += ("\nLa distancia más corta del almacén A a E es: " + nodes[i].getDistanceFromSource());
            }
            }
        System.out.println(output);
    }
}
