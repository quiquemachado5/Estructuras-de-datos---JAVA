
public class Alumno implements IAlumno{

    private String nombre;
    private String apellidos;
    private String DNI;
    private int edad;
    
    public Alumno(){
        
    }
    
    public Alumno(String nombre,String apellidos,String DNI,int edad){
        this.nombre = nombre;
        this.apellidos=apellidos;
        this.DNI=DNI;
        this.edad = edad;
    }
    
    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String getApellidos() {
        return this.apellidos;
    }

    @Override
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    @Override
    public String getDNI() {
        return this.DNI;
    }
   
    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public int getEdad() {
        return this.edad;
    }
    
    public String toString(){
        return ("Alumno: " + this.getNombre()+this.getApellidos()+this.getDNI()+this.getEdad());
    }

}
