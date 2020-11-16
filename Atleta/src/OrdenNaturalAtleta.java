import java.util.*;

public class OrdenNaturalAtleta implements Comparator<IAtleta>{

    
    @Override
    public int compare(IAtleta o1, IAtleta o2) {
        if(o1.getDorsal()-o2.getDorsal()>0){
            return 1;
        }else{
            if(o1.getDorsal()-o2.getDorsal()<0){
                return -1;
            }else{
                return 0;
            }
        }
    }
    
}
