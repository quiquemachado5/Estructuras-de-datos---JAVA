import java.util.*;


public class Atletas implements IAtletas{
    
    SortedSet<IAtleta> atletas;
    
    public Atletas(){
        atletas = new TreeSet<>();

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
    public int getDorsalMayor(){
        Set atletas2 = new HashSet(atletas); 
        IAtleta e =  (IAtleta) Collections.max(atletas2);
        int pos = e.getDorsal();
        return pos;
    }

    @Override
    public int getDorsalMenor() {
        Set atletas2 = new HashSet(atletas); 
        IAtleta e = (IAtleta) Collections.min(atletas2);
        int pos = e.getDorsal();
        return pos;
    }

    /*@Override
    public Collection getDorsalAnterior(int dorsal) {
        SortedSet dorsalesAnteriores = new TreeSet();
        Iterator<IAtleta> it = atletas.iterator();
        while(it.hasNext()){
            IAtleta a = it.next();
            if(a.getDorsal()== dorsal){
                Collections.
            }else{
                
            }
            dorsalesAnteriores.add(dorsalesAnteriores.tailSet(dorsal));
            
        }
        return dorsalesAnteriores;
    }*/

    /*Override
    public Collection getDorsalPosterior(int dorsal) {
    }*/
    public void imprimir(){
        Iterator it = atletas.iterator();
        while(it.hasNext()){
            System.out.println(""+it.next());
        }
    }
}