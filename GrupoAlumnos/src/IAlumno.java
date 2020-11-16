
public interface IAlumno {
    
    public void setNombre(String nombre);
    public String getNombre();
    public void setApellidos(String apellidos);
    public String getApellidos();
    public void setDNI(String DNI);
    public String getDNI();
    public void setEdad(int edad);
    public int getEdad();
    
    @Override
    public String toString();
    
}
