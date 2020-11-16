import java.util.*;

public class ModelosCoche implements IModelosCoche {

    List<IModeloCoche> c ;
    public ModelosCoche(){
        c = new ArrayList<>();
    }
    @Override
    public void agregar(IModeloCoche modeloCoche) {
        c.add(modeloCoche);
    }

    @Override
    public void imprimir() {
        c.sort(new ComparadorNombres());
        Iterator it = c.iterator();
        while(it.hasNext()){
            System.out.println(""+it.next());
        }
    }
    
}
