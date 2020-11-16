

public class Cliente implements Comparable{
    private  String nombre;
    private  String apellidos;
    private int edad;
    private int DNI;
    
    public Cliente(String nombre,String apellidos,int edad,int DNI){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.DNI = DNI;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the DNI
     */
    public int getDNI() {
        return DNI;
    }

    /**
     * @param DNI the DNI to set
     */
    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int compareTo(Object o1) {
        Cliente c1 = (Cliente)o1;
        int resultado;
        
        if(this.edad > c1.getEdad()){
            resultado = 1;
        }else{
            if(this.edad == c1.getEdad()){
                resultado = 0;
            }else{
                resultado = -1;
            }
        }
        return resultado;
    }

   
    
}
