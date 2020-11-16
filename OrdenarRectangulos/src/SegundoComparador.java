import java.util.Comparator;

public class SegundoComparador implements Comparator<IRectangulo>{

    @Override
    public int compare(IRectangulo o1, IRectangulo o2) {
        if(o1.getAncho()-o2.getAncho()>0){
            return 1;
        }
        else{
            if(o1.getAncho()-o2.getAncho()<0){
                return -1;
            }
            else{
                return o1.getLargo()-o2.getLargo();
            }
        }
    }
    
}
