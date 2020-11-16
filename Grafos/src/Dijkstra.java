
public class Dijkstra extends Grafo{
    private int[][] costos;
    private int ultimo[];
    private int D[];
    private boolean F[];
    private int s,n;
    
    public Dijkstra(int s){
        
    }
    
    public void caminoMinimos(){
        for (int i = 0; i < n; i++) {
                F[i]=false;
                D[i]=costos[s][i];
                ultimo[i] = s;
        }
        F[s]=true;
        D[s]=0;
        
        for (int i = 0; i < n; i++) {
            int v = minimo();
            F[v]=true;
            for (int w = 0; w < n; w++) {
                if(!F[w]){
                    if((D[v]+costos[v][w]<D[w])){
                        D[w] = D[v]+costos[v][w];
                        ultimo[w]=v;
                    }
                }
            }
            for ( i = 0; i < 10; i++) {
                System.out.println("costo minimo a"+i+": "+D[i]);
            }
        }
    }

}
