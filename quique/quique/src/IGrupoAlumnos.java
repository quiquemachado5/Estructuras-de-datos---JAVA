import java.util.*;

public interface IGrupoAlumnos {
    
    public void imprimir();
    public Collection getNombre();
    public boolean agregar(IAlumno alumno);
    public void eliminarMayoresDe();
    public boolean eliminar(IAlumno alumno);
}
