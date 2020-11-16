import java.util.*;
public class PruebaLista {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        num.add(2);
        num.add(23);
        num.add(41);
        num.add(15);
        num.add(41);
        
        System.out.println("Tamaño de la lista de elementos: "+num.size());
        
        for (Integer nums : num) {
            System.out.println(nums);
        }
        
        Iterator<Integer> it = num.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
        System.out.println(Collections.binarySearch(num, 41));
        
        System.out.println(Collections.max(num)+" "+Collections.min(num));
        
        System.out.println(Collections.frequency(num, 41));
    }
}
