
import java.util.*;
import java.io.*;

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

    
    /*@Override
    public int getDorsalMayor() {

    }

    @Override
    public int getDorsalMenor() {

    }*/

    @Override
    public Collection getDorsalAnterior(int dorsal) {
        Collection dorsalesAnteriores = new HashSet();
        Iterator<IAtleta> it = atletas.iterator();
        while(it.hasNext() && (it.next().getDorsal()<dorsal)){
            dorsalesAnteriores.add(it.next());
        }
        return dorsalesAnteriores;
  
    }

    @Override
    public Collection getDorsalPosterior(int dorsal) {
        Collection dorsalesPosteriores = new HashSet();
        Iterator<IAtleta> it = atletas.iterator();
        IAtleta e;
        while(it.hasNext() && e.getDorsal()>dorsal)){
            dorsalesPosteriores.add(it.next());
        }
        return dorsalesPosteriores;
    }

}
