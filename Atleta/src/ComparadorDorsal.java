import java.util.Comparator;

public class ComparadorDorsal implements Comparator<IAtleta>{

    @Override
    public int compare(IAtleta o1, IAtleta o2) {
        int res = 0;
        if(o1.getDorsal()-o2.getDorsal()>0){
            res = 1;
        }else{
            if(o1.getDorsal()-o2.getDorsal()<0){
                res = -1;
            }
        }
        return res;
    }
    
}
