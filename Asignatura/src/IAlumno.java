import java.util.*;
public interface IAlumno {
    public String getNombre();
    public void setNombre(String nombre);
    
    public String getDNI();
    public void setDNI(String DNI);
    
    public void agregarAsignaturasMatriculadas(IAsignatura asignatura);
    public void eliminarAsignaturasMatriculadas(IAsignatura asignatura);
    public void borrarAsignaturasMatriculadas();
    public Collection getConjuntoAsignaturasMatriculadas();
    
    public void agregarAsignaturasAprobadas(IAsignatura asignatura);
    public void eliminarAsignaturasAprobadas(IAsignatura asignatura);
    public void borrarAsignaturasAprobadas();
    public Collection getConjuntoAsignaturasAprobadas();
   
}
