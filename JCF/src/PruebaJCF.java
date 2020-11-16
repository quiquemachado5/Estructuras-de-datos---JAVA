import java.util.*;

public class PruebaJCF {
    
    public static void main(String[] args){
        
        JCF cliente1 = new JCF("Rafa Nadal","2345",34);
        JCF cliente2 = new JCF("Enrique Machado","5834",19);
        JCF cliente3 = new JCF("Patricia Conde","0595",45);
        JCF cliente4 = new JCF("Patricia Conde","0595",45);
        
        Set<JCF> clientes = new HashSet<>();
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        clientes.add(cliente4);
        
        for (JCF cliente : clientes) {
            if(cliente.getEdad()>=20){
                System.out.println(cliente.getNombre()+" "+cliente.getDNI()+" "+cliente.getEdad());
            }
        }
        
        
        if(cliente1.compareTo(cliente2)>0){
            System.out.println(cliente1+"es mayor que"+cliente2);  
        }else{
            System.out.println(cliente2+"es mayor que"+cliente1);
        }
    }
}
