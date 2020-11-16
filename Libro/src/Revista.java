
public class Revista implements IPublicacion {
    public Revista(){}
    
    public void establecerCodigo(int codigo){
        System.out.println("El código de la revista es: "+ codigo);
    }
    public void establecerAutor(String autor){
        System.out.println("El autor de la revista es: "+autor);
    }
    public void establecerTitulo(String titulo){
        System.out.println("El título de la revista es: "+titulo);
    }
    public void establecerAñoPublicacion(int añoPublicacion){
        System.out.println("El año de publicacion de la revista es:"+añoPublicacion);
    }
    public void Prestado(boolean prestado){
        System.out.println("La revista es prestada o no"+prestado);
    }
}
