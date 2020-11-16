import java.util.Comparator;

public class PrimerComparador implements Comparator<IRectangulo>{

    @Override
    public int compare(IRectangulo o1, IRectangulo o2) {
        if(o1.getLargo()-o2.getLargo()>0){
            return 1;
        }
        else{
            if(o1.getLargo()-o2.getLargo()<0){
                return -1;
            }
            else{
                return o1.getAncho()-o2.getAncho();
            }
        }
    }
    
}
