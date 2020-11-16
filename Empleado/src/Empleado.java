
public class Empleado implements IEmpleado{
    private String nombre;
    private String DNI;
    private int edad;
    private boolean casado;
    private int nHijos;
    private float sueldo;
    
    public Empleado(String nombre,String DNI,int edad,boolean casado,int nHijos,float sueldo){
        this.nombre = nombre;
        this.DNI = DNI;
        this.edad = edad;
        this.casado = casado;
        this.nHijos = nHijos;
        this.sueldo = sueldo;
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
     * @return the DNI
     */
    public String getDNI() {
        return DNI;
    }

    /**
     * @param DNI the DNI to set
     */
    public void setDNI(String DNI) {
        this.DNI = DNI;
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
     * @return the casado
     */
    public boolean isCasado() {
        return casado;
    }

    /**
     * @param casado the casado to set
     */
    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    /**
     * @return the nHijos
     */
    public int getnHijos() {
        return nHijos;
    }

    /**
     * @param nHijos the nHijos to set
     */
    public void setnHijos(int nHijos) {
        this.nHijos = nHijos;
    }

    /**
     * @return the sueldo
     */
    public float getSueldo() {
        return sueldo;
    }

    /**
     * @param sueldo the sueldo to set
     */
    @Override
    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
    
    @Override
    public String toString(){
        return this.getNombre()+" "+this.getDNI()+" "+this.getEdad()+" años "+this.getSueldo()+"€ "+this.getnHijos();
    }
    
    
    public boolean equals(Empleado oct){
        Empleado emp1 =  oct;
        return this.DNI.equals(emp1.DNI);
    }
    
    @Override
    public int hashCode(){
        return this.DNI.hashCode();
    }
}
