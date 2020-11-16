import java.util.*;
public class PruebaConjuntos {
    public static void main(String[] args) {
        Set<Integer> conjunto = new HashSet<>();
        conjunto.add(3);
        conjunto.add(24);
        conjunto.add(42);
        conjunto.add(3);
        
        Iterator<Integer> it = conjunto.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println(conjunto.size());
        
        System.out.println(conjunto.isEmpty());
        
        
    }
  
}
