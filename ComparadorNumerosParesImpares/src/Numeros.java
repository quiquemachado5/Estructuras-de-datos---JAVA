import java.util.*;

public class Numeros implements INumeros{
    List<INumero> numeros;
  
    public Numeros(){
        numeros = new ArrayList<>();      
    }
    @Override
    public void agregar(INumero numero){
        numeros.add(numero);
    }
    @Override
    public void ordenar(){
         numeros.sort(new Comparador());
    }
    @Override
    public void imprimir(){
        ListIterator it = numeros.listIterator();
        while(it.hasNext()){
            System.out.println(""+it.next());
        }
    }
  
}