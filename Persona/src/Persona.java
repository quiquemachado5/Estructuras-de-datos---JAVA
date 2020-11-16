
public class Persona {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int edad;
    private int estatura;
    private int peso;
    private int estado;
    private boolean interruptor;
    
    public Persona(){
        nombre = "" ;
        apellido1 = "" ;
        apellido2 = "" ;
        edad = 0 ;
        estatura = 0 ;
        peso = 0 ;
        estado = 0;
        interruptor = false ;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 0 || edad>150){
            System.out.println("La edad tiene que estar entre 0 y 150 años");
        } else{
             this.edad = edad;
        }
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        if ((edad<0)&&(edad>3)){
            System.out.println("La estatura tiene que estar entre on y 3 metros");
        }
        else{
            this.estatura = estatura;
        }
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        if((peso<0)&&(peso>300)){
            System.out.println("El peso tiene que estar entre 0 y 300 kg");
        }
        else{
            this.peso = peso;
        } 
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    public String cadenaEstado(){
        String cadena = new String();
        switch(this.estado){
            case 1: 
                cadena = "SOLTERO";
                break;
            case 2: 
                cadena = "CASADO";
                break;
            case 3: 
                cadena = "SEPARADO";
                break;
            case 4: 
                cadena = "DIVORCIADO";
                break;
            case 5: 
                cadena = "VIUDO";
                break;     
        }
        return cadena;
    }

    public boolean isInterruptor() {
        return interruptor;
    }

    public void setInterruptor(boolean interruptor) {
        this.interruptor = interruptor;
    }
    
}
