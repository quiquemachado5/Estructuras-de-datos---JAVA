
import java.util.*;

public class Alumnos implements IAlumnos {

    Set<IAlumno> alumnos;

    public Alumnos() {
        alumnos = new HashSet<>();
    }

    @Override
    public void agregarAlumnos(IAlumno alumno) {
        boolean agregado = false;
        agregado = alumnos.add(alumno);
    }

    @Override
    public void eliminarAlumnos(IAlumno alumno) {
        boolean eliminado = false;
        eliminado = alumnos.remove(alumno);
    }

    @Override
    public void borrarAlumnos(IAlumno alumno) {
        alumnos.clear();
    }

    /*public Collection getNingunaAprobada(){
        
    }*/
    public Collection getMatriculados(IAsignatura asignatura) {
        Iterator it = alumnos.iterator();
        Set<IAlumno> setAlumnosMatriculadosEnAsignaturaX = new HashSet<>();
        while (it.hasNext()) {
            IAlumno a = (IAlumno) it.next();
            //Como te gusta usar iteradores usaré iterador de cada lista que contenga cada alumno que se itere:
            Iterator iteradorDeAsignatura = a.getConjuntoAsignaturasMatriculadas().iterator();
            //AHora itero asignaturas matriculadas por cada alumno que itero:
            while (iteradorDeAsignatura.hasNext()) {
                IAsignatura asignaturaIterada = (IAsignatura) iteradorDeAsignatura.next();
                //Si la asignatura iterada en ese momento es igual a la que recibimos por parametro queremos a ese tio:
                if (asignaturaIterada.equals(asignatura)) {
                    //Metemos al tio:
                    //Si quieres mostramos al tio pq quieras ver lo que hacer:
                    System.out.println("El alumno "+a.getNombre()+" está matriculado de la asignatura: "+asignatura.getNombreAsignatura());
                    setAlumnosMatriculadosEnAsignaturaX.add(a);
                }
            }
        }

        

        return setAlumnosMatriculadosEnAsignaturaX;
    }

    public Collection getNoMatriculados(IAsignatura asignatura) {
        Iterator it = alumnos.iterator();
        Set<IAlumno> setAlumnosNoMatriculadosEnAsignaturaX = new HashSet<>();
        while (it.hasNext()) {
            IAlumno a = (IAlumno) it.next();
            //Como te gusta usar iteradores usaré iterador de cada lista que contenga cada alumno que se itere:
            Iterator iteradorDeAsignatura = a.getConjuntoAsignaturasMatriculadas().iterator();
            //AHora itero asignaturas matriculadas por cada alumno que itero:
            while (iteradorDeAsignatura.hasNext()) {
                IAsignatura asignaturaIterada = (IAsignatura) iteradorDeAsignatura.next();
                //Si la asignatura iterada en ese momento es igual a la que recibimos por parametro queremos a ese tio:
                if (asignaturaIterada.equals(asignatura)) {
                    //Metemos al tio:
                    //Si quieres mostramos al tio pq quieras ver lo que hacer:
                    System.out.println("El alumno:  "+a.getNombre()+" NO está matriculado de la asignatura: "+asignatura.getNombreAsignatura());
                    setAlumnosNoMatriculadosEnAsignaturaX.add(a);
                }
            }
        }

        return setAlumnosNoMatriculadosEnAsignaturaX;
    }

    public void imprimir() {
        Iterator it = alumnos.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    /* public Collection getAprobados(IAsignatura asignatura){
        
    }
    
    public Collection getMatriculadosYAprobados(IAsignatura asignatura){
        
    }*/
}
