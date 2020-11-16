import java.util.*;

public class MiCollections {
    
    private List c;
    
    public MiCollections(){
        c = new ArrayList();
    }
    public  void reverse(List c){
        Collections.reverse(c);
    }
    
    public  void reverseSort(List c){
        Collections.sort(c);
        Collections.reverse(c);
        
    }
    
}
