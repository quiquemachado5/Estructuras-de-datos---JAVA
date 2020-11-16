import java.util.Scanner;

public class Encriptador {
    protected int numero;
    protected boolean encriptado;
    protected String clave;
    
    public Encriptador(int numero, String clave){
        this.numero = numero;
        this.clave = clave;
        encriptado = false;
    }
    
    public int getNumero(){
        return this.numero;
    }
    public boolean getEncriptado(){
        return this.encriptado;
    }
    protected boolean compruebaClave(){
        Scanner s = new Scanner(System.in);
        String c;
        boolean resultado;
        System.out.println("Introduzca la clave:");
        c = s.next();
        if(c.equals(this.clave)){
            resultado = true;
        }else{
            resultado = false;
        }
        return resultado;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Número: "+this.numero+"Encriptado: "+this.encriptado);
        return sb.toString();
    }
}   
