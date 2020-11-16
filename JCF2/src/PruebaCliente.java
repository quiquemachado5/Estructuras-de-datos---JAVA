import java.util.*;

public class PruebaCliente {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Rafa","Nadal",37,1234);  //Creamos cuatro objetos
        Cliente c2 = new Cliente("Pepe","Navarro",32,9458);
        Cliente c3 = new Cliente("Amalia","Ferrer",12,4954);
        Cliente c4 = new Cliente("Rafa","Nadal",37,1234);
        
        List<Cliente> clientes = new ArrayList<>(); //Creamos una lista de tipo Cliente como genérico
        clientes.add(c1);                           //Introducimos los diferentes objetos en la lista
        clientes.add(c2);
        clientes.add(c3);     
        clientes.add(c4);
        
        
        /*for (Cliente cliente : clientes) {      //Utilizamos un bucle for each para impirmir los objetos de la lsita
            System.out.println(cliente.getNombre()+" "+cliente.getApellidos()+" "+cliente.getEdad()+" "+cliente.getDNI());
        }*/
        
        if(c1.equals(c4)){  //Utilizamos método equals para comprobar si c1 y c4 son o no iguales
            System.out.println("Los clientes son iguales");
        }else{
            System.out.println("Los clientes no son iguales");
        }
        
        System.out.println("El nº de elementos de nuesta lista es: "+clientes.size()); //Imprimimos el numero de elementos de nuestra lista
        
        Iterator<Cliente> it = clientes.iterator(); //Recorrer con un iterador una coleccion 
        
        while(it.hasNext()){
            String nombreCliente = it.next().getNombre();
            if(nombreCliente.equals("Rafa")){
                it.remove();  //eliminar con un iterador un nombre 
            }
            System.out.println(nombreCliente);
        }
        
       if(c1.compareTo(c4)==1){
           System.out.println(c1.getNombre()+" es mayor que"+ c4.getNombre());            
        }else{
           if(c1.compareTo(c4)==0){
               System.out.println(c1.getNombre()+" y "+c4.getNombre()+" tienen la misma edad");
           }else{
               System.out.println(c4.getNombre()+"es mayor que"+c1.getNombre());
           }
       }
       
       if(c1.equals(c4)){
           System.out.println("Los dos son iguales");
       }else{
           System.out.println("Son distintos");
       }
       
    }
}
