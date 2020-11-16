import java.util.*;

public class PruebaAlumnos {
    public static void main(String[] args){
        Alumno a1 = new Alumno("Quique","Machado",19,9);
        Alumno a2 = new Alumno("Celedonia","Diaz",79,10);
        Alumno a3 = new Alumno("Marta","Machado",47,6);
        Alumno a4 = new Alumno("Pepe","Navarro",32,2);
        
        Alumnos grupoAlumnos = new Alumnos();
        grupoAlumnos.agregarAlumno(a1);
        grupoAlumnos.agregarAlumno(a2);
        grupoAlumnos.agregarAlumno(a3);
        grupoAlumnos.agregarAlumno(a4);
        grupoAlumnos.imprimir();
        
        System.out.println("\nAhora vamos a buscar si hay algun alumno que se apellide Machado");
        grupoAlumnos.buscarPorApellidos("Navarro");
        grupoAlumnos.imprimir();
        
    }
}
