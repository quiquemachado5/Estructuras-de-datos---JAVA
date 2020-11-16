import java.util.*;

public class DatosJornada implements IDatosJornada {
    
    Collection<IResultadosFutbol> c ; 
    
    public DatosJornada(){
        c = new ArrayList<>();
    }
    
    @Override
    public void numeroJornada() {
        
    }

    @Override
    public void resultadosJornada() {
        Iterator it = c.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

    @Override
    public boolean agregarPartido(IResultadosFutbol resultado) {
        boolean agregado = false;
        if(c.contains(resultado)){
            agregado = false; 
        }else{
            c.add(resultado);
            agregado = true;
        }
        return agregado;        
    }

    @Override
    public boolean eliminarPartido(IResultadosFutbol resultado) {
        boolean eliminado = false;
        
        c.remove(resultado);
        return eliminado;
    }

    @Override
    public void imprimir() {
        Iterator it = c.iterator();
        while(it.hasNext()){
            System.out.println("Resultados Jornada: " +it.next());
        }
    }
    
}
