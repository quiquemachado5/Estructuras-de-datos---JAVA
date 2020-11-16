
import java.util.Comparator;

public class ComparadorApellidos implements Comparator<IAlumno> {

    //ComparadorApellidos comp = new ComparadorApellidos();

    @Override
    public int compare(IAlumno o1, IAlumno o2) {
        int pos;
        if(o1.getApellidos().compareToIgnoreCase(o2.getApellidos())>0){
           pos = 1;
        }else{
            if(o1.getApellidos().compareToIgnoreCase(o2.getApellidos())<0){
                pos = -1;
            }else{
                pos = 0;
            }
        }
        return pos;
    }
}
