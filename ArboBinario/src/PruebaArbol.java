
public class PruebaArbol {
    public static void main(String[] args) {
        ArbolBinario abo = new ArbolBinario();
        abo.insertar(23);
        abo.insertar(3);
        abo.insertar(19);
        abo.insertar(11);
        abo.insertar(17);
        
        System.out.println("\nElementos preOrden: ");
        abo.imprimirPre();
        System.out.println("\nElementos InOrden: ");
        abo.imprimirEntre();
        System.out.println("\nElementos postOrden: ");
        abo.imprimirPost();
    }
}
