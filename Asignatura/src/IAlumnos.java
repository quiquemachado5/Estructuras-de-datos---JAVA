import java.util.*;
public interface IAlumnos {
    public void agregarAlumnos(IAlumno alumno);
    public void eliminarAlumnos(IAlumno alumno);
    public void borrarAlumnos(IAlumno alumno);
    public Collection getMatriculados(IAsignatura asignatura);
    public Collection getNoMatriculados(IAsignatura asignatura);
    public Collection getAprobados(IAsignatura asignatura);
    public Collection getNingunaAprobada();
    public Collection getMatriculadosYAprobados(IAsignatura asignatura1,IAsignatura asignatura2);
    
}
