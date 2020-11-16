import java.util.Comparator;


public class ComparadorNombre implements Comparator<IAlumno>{
    
    @Override
    public int compare(IAlumno o1, IAlumno o2) {
        int pos;
        if(o1.getNombre().compareToIgnoreCase(o2.getNombre())>0){
            pos = 1;
        }else{
            if(o1.getNombre().compareToIgnoreCase(o2.getNombre())<0){
                pos = -1;
            }else{
                pos = 0;
            }
        }
        return pos;
    }
    
}
