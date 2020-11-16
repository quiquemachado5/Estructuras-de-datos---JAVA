
public class Disco implements IPublicacion {
    public Disco(){}
    
    public void establecerCodigo(int codigo){
        System.out.println("El código de la disco es: "+ codigo);
    }
    public void establecerAutor(String autor){
        System.out.println("El autor de la disco es: "+autor);
    }
    public void establecerTitulo(String titulo){
        System.out.println("El título de la disco es: "+titulo);
    }
    public void establecerAñoPublicacion(int añoPublicacion){
        System.out.println("El año de publicacion de la disco es:"+añoPublicacion);
    }
    public void Prestado(boolean prestado){
        System.out.println("La disco es prestada o no"+prestado);
    }
}
