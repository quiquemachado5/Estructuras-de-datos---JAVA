import java.util.*;

public class PruebaAlumnos {
    public static void main(String[] args) {
        Alumno a1 = new Alumno("Enrique"," Machado"," 29502554V",19);
        Alumno a2 = new Alumno("Ana"," Machado"," 29502354V",32);
        Alumno a3 = new Alumno("Manuel"," Ortiz"," 34567890P",15);
        Alumno a4 = new Alumno("Vicente"," Amigo"," 12345554V",34);
    
      
        GrupoAlumnos  g1 = new GrupoAlumnos();
        g1.agregar(a1);
        g1.agregar(a2);
        g1.agregar(a3);
        g1.agregar(a4);
     
        g1.imprimir();
        
        
        g1.eliminarMayoresDe();
        System.out.println("-------------");
        g1.imprimir();
    }
}
