import java.util.*;

public class Alumnos implements IAlumnos{
        
    Set<IAlumno> alumnos;
    
    public Alumnos(){
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
  
    @Override
     public Collection getMatriculados(IAsignatura asignatura){
         Set<IAlumno> matriculadosAsignatura = new HashSet<>();
         Iterator<IAlumno> itAlumno = alumnos.iterator();
         while(itAlumno.hasNext()){
             IAlumno alu = itAlumno.next();
             if(alu.getConjuntoAsignaturasMatriculadas().contains(asignatura)){
                   matriculadosAsignatura.add(alu);
              }
         }
         return matriculadosAsignatura; 
    }
    
    @Override
    public Collection getNoMatriculados (IAsignatura asignatura){
            Set<IAlumno> noMatriculados = new HashSet<>();
            Iterator<IAlumno> itAlumnos = alumnos.iterator();
            while(itAlumnos.hasNext()){
                   IAlumno alu =  itAlumnos.next();
                   if(!alu.getConjuntoAsignaturasMatriculadas().contains(asignatura)){
                        noMatriculados.add(alu);
                   }
            }
            return noMatriculados;
    }
    
    public void imprimir(){
        Iterator it = alumnos.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    
    @Override
    public Collection getAprobados(IAsignatura asignatura){
        Set<IAlumno> aprobados = new HashSet<>();
        Iterator<IAlumno> it = alumnos.iterator();
        while(it.hasNext()){
            IAlumno alu =  it.next();
            if(alu.getConjuntoAsignaturasAprobadas().contains(asignatura)){
                aprobados.add(alu);
            } 
        }
        return aprobados;
    }
    
    @Override
    public Collection getNingunaAprobada(){
        Set<IAlumno> noAprobados = new HashSet<>();
        Iterator<IAlumno> it = alumnos.iterator();
        while(it.hasNext()){
            IAlumno a = it.next();
            if(a.getConjuntoAsignaturasAprobadas()==null){
                noAprobados.add(a);
            }
        }
        return noAprobados;
    }
    
    @Override
    public Collection getMatriculadosYAprobados(IAsignatura asignatura1,IAsignatura asignatura2){
        Set<IAlumno> matriculadosYAprobados = new HashSet<>();
            Iterator<IAlumno> itAlumnos = alumnos.iterator();
            while(itAlumnos.hasNext()){
                   IAlumno alu =  itAlumnos.next();
                   if(alu.getConjuntoAsignaturasMatriculadas().contains(asignatura1) && alu.getConjuntoAsignaturasAprobadas().contains(asignatura2)){
                        matriculadosYAprobados.add(alu);
                   }
               }
            
            return matriculadosYAprobados;
    }
    
    
}

