import java.util.*;

public class GrupoAlumnos implements IGrupoAlumnos{

    Collection<IAlumno> c;
    
    public GrupoAlumnos(){
        c = new ArrayList<>();
    }
    public boolean obtenerGrupoPrueba(){
        boolean agregados = false;
        
     
        return agregados;
    }
    public  void reverse(List c){
        Collections.reverse(c);
    }
    
    public  void reverseSort(List c){
        Collections.sort(c);
        Collections.reverseOrder();
    }
    
    @Override
    public Collection getNombre() {
        return this.c;
    }

    public boolean agregar(IAlumno alumno) {
        boolean agregado = false;
        if(c.contains(alumno)){
            agregado = false; 
        }else{
            c.add(alumno);
            agregado = true;
        }
        return agregado;
    }
    
    @Override
    public void imprimir(){
        Iterator it = c.iterator();
        while(it.hasNext()){
            System.out.println(""+it.next());
        }  
    }

    @Override
    public void eliminarMayoresDe() {
        Iterator it = c.iterator();
        while(it.hasNext()){
            if(c.equals(30)){
                c.remove(c);
            }
            it.next();
        }

    }
    

    @Override
    public boolean eliminar(IAlumno alumno) {
        boolean eliminado = false;
        c.remove(alumno);
        return eliminado;
    }

}