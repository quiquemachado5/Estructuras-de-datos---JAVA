import java.util.*;

public class Alumno implements IAlumno{
    private String nombre;
    private String DNI;
    Set<IAsignatura> AsignaturasMatriculadas;
    Set<IAsignatura> AsignaturasAprobadas;
    
    public Alumno(String nombre,String DNI){
        this.nombre = nombre;
        this.DNI = DNI;
        AsignaturasMatriculadas = new HashSet<>();
        AsignaturasAprobadas = new HashSet<>();
    }
    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getDNI() {
        return this.DNI;
    }

    @Override
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    @Override
    public void agregarAsignaturasMatriculadas(IAsignatura asignatura) {
        boolean agregada = false;
        agregada = AsignaturasMatriculadas.add(asignatura);
    }

    @Override
    public void eliminarAsignaturasMatriculadas(IAsignatura asignatura) {
        boolean eliminada = false;
        eliminada = AsignaturasMatriculadas.remove(asignatura);
    }

    @Override
    public void borrarAsignaturasMatriculadas() {
        AsignaturasMatriculadas.clear();
    }

    @Override
    public Set<IAsignatura> getConjuntoAsignaturasMatriculadas() {
       
        
            //System.out.println("Asignaturas Matriculadas: "+it.next());
            //System out print dentro de los métodos no.
            //El syso sirve para depurar.
            //Este método debe devolver el conjunto de asignaturas matriculadas del alumno. 
            //Sería un get camuflado de este atributo:
            return this.AsignaturasMatriculadas;
        }
    

    @Override
    public void agregarAsignaturasAprobadas(IAsignatura asignatura) {
        boolean agregada = false;
        if(AsignaturasMatriculadas.contains(asignatura)){
            AsignaturasAprobadas.add(asignatura);
            agregada = true;
        }else{
            agregada = false;
        }
    }

    @Override
    public void eliminarAsignaturasAprobadas(IAsignatura asignatura) {
        boolean eliminada = false;
        if(AsignaturasMatriculadas.contains(asignatura)){
            AsignaturasAprobadas.remove(asignatura);
            eliminada = true;
        }else{
            eliminada = false;
        }
    }

    @Override
    public void borrarAsignaturasAprobadas() {
        AsignaturasAprobadas.clear();
    }

    @Override
    public Collection getConjuntoAsignaturasAprobadas() {
       return this.AsignaturasAprobadas;
    }
    
    @Override
    public String toString(){
        return("Alumno: "+ this.getNombre()+" DNI: "+this.getDNI());
    }
    
    @Override
    public int hashCode(){
        return this.DNI.hashCode();
    }
    
    @Override
    public boolean equals(Object oct){
        Alumno a = (Alumno) oct;
        return a.getDNI().equals(this.getDNI());
    }
    
   
}
