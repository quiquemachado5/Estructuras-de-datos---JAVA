import java.util.*;


public class PruebaAlumnos {
    public static void main(String[] args) {
        
        Alumno alumno1 = new Alumno("Enrique","29502554V");
        Alumno alumno2 = new Alumno("Pepe","29502054V");
        Alumno alumno3 = new Alumno("Amalia","12345678P");
         
        Alumnos grupoAlumnos = new Alumnos();
        
        grupoAlumnos.agregarAlumnos(alumno1);
        grupoAlumnos.agregarAlumnos(alumno2);
        grupoAlumnos.agregarAlumnos(alumno3);
        
        Asignatura asignatura1 = new Asignatura("Matemáticas",2010);
        Asignatura asignatura2 = new Asignatura("Lengua",2007);
        Asignatura asignatura3 = new Asignatura("Física",2019);
        Asignatura asignatura4 = new Asignatura("Cálculo",2018);
        Asignatura asignatura5 = new Asignatura("Estructura de datos",2019);
        
        System.out.println("Estas son las asignaturas disponibles: ");
        System.out.println(asignatura1.toString());
        System.out.println(asignatura2.toString());
        System.out.println(asignatura3.toString());
        System.out.println(asignatura4.toString());
        System.out.println(asignatura5.toString());
        
 
        //Agregamos las asignaturas matriculadas de cada alumno
        alumno1.agregarAsignaturasMatriculadas(asignatura1);
        alumno1.agregarAsignaturasMatriculadas(asignatura2);
        alumno1.agregarAsignaturasMatriculadas(asignatura3);
        alumno1.agregarAsignaturasMatriculadas(asignatura4);
        
        alumno2.agregarAsignaturasMatriculadas(asignatura4);
        alumno2.agregarAsignaturasMatriculadas(asignatura2);
        alumno2.agregarAsignaturasMatriculadas(asignatura5);
        
        alumno3.agregarAsignaturasMatriculadas(asignatura2);
        alumno3.agregarAsignaturasMatriculadas(asignatura4);
        
        //Agregamos las asignaturas que ha aprobado cada alumno
        alumno1.agregarAsignaturasAprobadas(asignatura1);
        alumno1.agregarAsignaturasAprobadas(asignatura3);
        
        alumno2.agregarAsignaturasAprobadas(asignatura3);
        alumno2.agregarAsignaturasAprobadas(asignatura4);
        
        alumno3.agregarAsignaturasAprobadas(asignatura1);
        alumno3.agregarAsignaturasAprobadas(asignatura2);
        alumno3.agregarAsignaturasAprobadas(asignatura3);
   
        grupoAlumnos.getNoMatriculados(asignatura5);
       
        grupoAlumnos.getMatriculados(asignatura5);
        
        Iterator it = alumno1.getConjuntoAsignaturasAprobadas().iterator();
        while(it.hasNext()){
            System.out.println("El alumno1 ha aprobado: "+it.next());
        }
        
        
        /*Collection collectionAlumnosMatriculados = grupoAlumnos.getMatriculados(asignatura1);
        //Iteramos la coleccion y mostramos la info:
        /*Iterator<IAlumno> iterador = collectionAlumnosMatriculados.iterator();
        while(iterador.hasNext()){
            System.out.println(iterador.next().getNombre());*/
        
        
        
    
    }
}
