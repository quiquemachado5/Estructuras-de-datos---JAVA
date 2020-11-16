
import java.util.Comparator;


public class ComparadorNombres implements Comparator<IModeloCoche>{

    

    @Override
    public int compare(IModeloCoche o1, IModeloCoche o2) {
        if(o1.getNombreModelo().compareToIgnoreCase(o2.getNombreModelo())>0){
            return 1;
        }else{
            if(o1.getNombreModelo().compareToIgnoreCase(o2.getNombreModelo())<0){
                return -1;
            }else{
                return o1.getAnyoDeFabricacion()-o2.getAnyoDeFabricacion();
            }
        }
        
        
    }
    
}
