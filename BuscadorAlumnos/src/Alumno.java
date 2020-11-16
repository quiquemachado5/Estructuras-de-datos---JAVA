
public class Alumno implements IAlumno {
    private String nombre;
    private String apellidos;
    private int edad;
    private float nota;
    
    public Alumno(){
        
    }
    public Alumno(String nombre,String apellidos,int edad,float nota){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.nota = nota;
    }
    
    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getApellidos() {
        return this.apellidos;
    }

    @Override
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public int getEdad() {
        return this.edad;
    }

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public float getNota() {
        return this.nota;
    }

    @Override
    public void setNota(float nota) {
        this.nota = nota;
    }
    
    public String toString(){
        return ("Alumno: "+ this.getNombre()+" "+this.getApellidos()+" "+this.getEdad()+" "+this.getNota());
    }
}
