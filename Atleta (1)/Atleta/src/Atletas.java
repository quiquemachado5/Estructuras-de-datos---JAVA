
import java.util.*;

public class Atletas implements IAtletas {

    Set<IAtleta> atletas;

    public Atletas() {
        atletas = new HashSet<>();
    }

    @Override
    public void agregarAtleta(IAtleta atleta) {
        atletas.add(atleta);
    }

    @Override
    public void eliminarAtleta(IAtleta atleta) {
        atletas.remove(atleta);
    }


    @Override
    public int getDorsalMayor() {
        Set atletas2 = new HashSet(atletas);
        IAtleta e = (IAtleta) Collections.max(atletas2);
        int maxdorsal = e.getDorsal();
        return maxdorsal;
    }

    @Override
    public int getDorsalMenor() {
        Set atletas2 = new HashSet(atletas);
        IAtleta e = (IAtleta) Collections.min(atletas2);
        int mindorsal = e.getDorsal();
        return mindorsal;
    }

    @Override
    public Set getDorsalAnterior(int dorsal) {
        Set dorsalesAnteriores = new HashSet();
        Iterator<IAtleta> it = atletas.iterator();
        while(it.hasNext() ){
            IAtleta atleta = it.next();
            if(atleta.getDorsal()<dorsal){
                dorsalesAnteriores.add(atleta);
            }
        }
        return dorsalesAnteriores;
    }

    @Override
    public Set getDorsalPosterior(int dorsal) {
    Set dorsalesPosteriores = new HashSet();
        List<IAtleta> a = new ArrayList<>(atletas);
        for(IAtleta atleta : a){
            if(atleta.getDorsal()>dorsal){
                dorsalesPosteriores.add(atleta);
            }
        }
        return dorsalesPosteriores;
    }

    @Override
    public void imprimir() {
        Iterator it = atletas.iterator();
        while(it.hasNext()){
            System.out.println(" "+it.next());
        }
    }

}
