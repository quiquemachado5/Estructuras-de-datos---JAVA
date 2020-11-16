import java.util.*;

public class PruebaAlumnos {
    public static void main(String[] args) {
        Alumno a1 = new Alumno("Enrique"," Machado"," 29502554V");
        Alumno a2 = new Alumno("Ana"," Machado"," 29502354V");
        Alumno a3 = new Alumno("Manuel"," Ortiz"," 34567890P");
        Alumno a4 = new Alumno("Vicente"," Amigo"," 12345554V");
    
        //Creo 4 objetos de la clase alumno
        
        GrupoAlumnos  g1 = new GrupoAlumnos();
        //Creo 1 objeto de la case GrupoAlumno y meto los objetos alumnos en g1
        g1.agregar(a1);
        g1.agregar(a2);
        g1.agregar(a3);
        g1.agregar(a4);
        //los meto en g1 porq g1 es una coleccion de un grupio de alumnos no?
        // si creara g2 tb seria otra coleccion con otros alumnos no?
        
//Creo una coleccion y añado g1 a la coleccion para q me itere y me muestre q alumnos hay en este grupo
        
        
        //No entiendo muy bien q estoy metiendo en cada coleccion, porque no me muestra nada por pantalla,
        
        Iterator it = g1.getC().iterator();
        while(it.hasNext()){
            System.out.println(""+it.next());
        }
    }
}
