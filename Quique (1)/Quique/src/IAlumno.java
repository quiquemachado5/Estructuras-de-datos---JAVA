import java.util.*;

public interface IAlumno {
    public String getNombre();
    public void setNombre(String nombre);
    
    public String getDNI();
    public void setDNI(String DNI);
    
    public void agregarAsignaturasMatriculadas(IAsignatura asignatura);
    public void eliminarAsignaturasMatriculadas(IAsignatura asignatura);
    public void borrarAsignaturasMatriculadas();
    //Recuerda he tenido que cambiar la definición del método en la interfaz.
    //Los métodos get deben devolver algo distinto de void siempre.
    //Si te das cuenta aqui pongo coleccion pero en la redefinicion del método es un set. QUE TAMBIÉN ES UNA COLECCIÓN.
    public Collection getConjuntoAsignaturasMatriculadas();
    
    public void agregarAsignaturasAprobadas(IAsignatura asignatura);
    public void eliminarAsignaturasAprobadas(IAsignatura asignatura);
    public void borrarAsignaturasAprobadas();
    public Collection getConjuntoAsignaturasAprobadas();
   
}
