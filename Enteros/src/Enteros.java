
import java.util.*;
import java.util.Random;

public class Enteros implements IEnteros {
    Collection c;
    private int[] vector = {1,2,3,4,5,6,7,8,9};
    
    
    public Enteros(int[] vector){
        c = new ArrayList();
        c.add(vector);
    }

    public Enteros() {
        
    }
        
    @Override
    public void desordenar() {
        int pos = (int)Math.round(Math.random()*5);

        for (int i = 0; i < vector.length; i++) {
            vector[pos] = vector[i];
        }
        
    }

    @Override
    public void intercambio(int e1, int e2) {
        int aux;
        for (int i = 0; i < vector.length; i++) {
            aux = vector[e1];
            vector[e1] = vector[e2];
            vector[e2] = aux;
        }
        
    }
    
    @Override
    public String toString(){
        for (int i = 0; i < vector.length; i++) {
            System.out.print("\n"+vector[i]);
        }
        return this.vector.toString();
    }

   
}
