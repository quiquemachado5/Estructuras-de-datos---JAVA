
public class PruebaLista {

    public static void main(String[] args) {
        Nodo n1 = new Nodo();
        Nodo n2 = new Nodo();
        Nodo n3 = new Nodo();
        Nodo n4 = new Nodo();
        
        Lista lista = new Lista();
        
        lista.add("rhe",0);
        lista.add("frr",1);
        lista.add("fef",2);
        lista.add("qm5",3);
        
        System.out.println(lista.getElement(0));
        System.out.println(lista.getElement(1));
        System.out.println(lista.getElement(2));
        System.out.println(lista.getElement(3));
        
        System.out.println(lista.size());
        
        lista.remove(2);
        
        System.out.println(lista.size());
    }
}
