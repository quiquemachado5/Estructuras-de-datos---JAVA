
public class Libro implements IPublicacion {
   
    public Libro(){}
    
    public void establecerCodigo(int codigo){
        System.out.println("El código del libro es: "+ codigo);
    }
    public void establecerAutor(String autor){
        System.out.println("El autor del libro es: "+autor);
    }
    public void establecerTitulo(String titulo){
        System.out.println("El título del libro es: "+titulo);
    }
    public void establecerAñoPublicacion(int añoPublicacion){
        System.out.println("El año de publicacion del libro es:"+añoPublicacion);
    }
    public void Prestado(boolean prestado){
        System.out.println("El libro es prestado o no"+prestado);
    }
}
