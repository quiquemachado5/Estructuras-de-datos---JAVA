
public class PruebaPila {
    public static void main(String[] args) throws FullStackException {
        Pila p = new Pila();
        if(p.isEmpty()){
            System.out.println("Pila vacía");
        }else{
            System.out.println("Pila no vacía");
        }
        p.apilar((int)2);
        p.apilar((int)4);
        p.apilar((int)16);
        System.out.println(p.cima());
        if(p.isEmpty()){
            System.out.println("Pila vacía");
        }else{
            System.out.println("Pila no vacía");
        }
        System.out.println(p.desapilar());
        System.out.println(p.cima());
        System.out.println(p.desapilar());
         System.out.println(p.cima());
        if(p.isEmpty()){
            System.out.println("Pila vacía");
        }else{
            System.out.println("Pila no vacía");
        }
    }
}
