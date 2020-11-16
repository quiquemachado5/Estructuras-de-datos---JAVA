import java.util.*;
import java.util.Comparator;

public class Alumnos implements IAlumnos{
    
    private List<IAlumno> c;
   
    public Alumnos(){
        c = new ArrayList<>();    
    }

    @Override
    public void agregarAlumno(IAlumno alumno) {
        c.add(alumno);
    }
    
    public IAlumno buscarPorNombre(String nombre){
        IAlumno alum = new Alumno();
        alum.setNombre(nombre);
        Collections.sort(c,new ComparadorNombre());
        int a = Collections.binarySearch(c, alum, new ComparadorNombre());
        return c.get(a);
    }
    
    public IAlumno buscarPorApellidos(String apellidos){
        IAlumno alum  = new Alumno();
        alum.setApellidos(apellidos);
        Collections.sort(c, new ComparadorApellidos());
        int a = Collections.binarySearch(c, alum , new ComparadorApellidos());
        return c.get(a);
        
    }
    
    
    public void imprimir(){
        Iterator it = c.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
    }
    /*public IAlumno buscarPorEdad(int edad){
        
    }
    public IAlumno buscarPorNota(float nota){
        
    }*/
}
