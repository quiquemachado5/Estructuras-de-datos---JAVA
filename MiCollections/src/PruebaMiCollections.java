import java.util.*;

public class PruebaMiCollections {
    public static void main(String[] args) {
        MiCollections m = new MiCollections();
        List lista = new ArrayList();
        for (int i = 0; i < 10; i++) {
            lista.add(i) ;
        }
        m.reverse(lista);
        
        ListIterator it = lista.listIterator();
        
        while(it.hasNext()){
            System.out.println(""+it.next());
        }
        
        m.reverseSort(lista);
        
        while(it.hasNext()){
            System.out.println(""+it.next());
        }
    }
}
