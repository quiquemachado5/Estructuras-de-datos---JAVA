
class ArbolRojoNegro {

    static class Nodo {

        Comparable clave;
        Nodo izq;
        Nodo der;
        Nodo padre;
        boolean color;
    }
    private static final boolean NEGRO = false;
    private static final boolean ROJO = true;
    private static final Nodo NULO;

    static {
        NULO = new Nodo();
        NULO.clave = null;
        NULO.padre = NULO;
        NULO.izq = NULO;
        NULO.der = NULO;
        NULO.color = NEGRO;
    }
    void insertar(Nodo z){
        Nodo y = NULO;
        Nodo x = root;
    }
}
