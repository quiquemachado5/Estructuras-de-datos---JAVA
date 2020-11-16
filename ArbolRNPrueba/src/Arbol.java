
public class Arbol<Object extends Comparable<Object>> {

    public Nodo raiz;
    Nodo insertado, tio;  //Nodos que usaré después

    public void insertar(int d) throws Exception {
        int x = d;
        if (raiz == null) { // si la raiz es nula, creo un nuevo nodo raiz con el valor pasado por parámetro
            raiz = new Nodo((int) d);
        } else {
            insertar(x, raiz); // sino, llamo a otro método privado de la clase
        }
    }

    private void insertar(int dato, Nodo raiz) throws Exception {
        if (dato < raiz.dato) { // si el dato es menor que la raiz
            if (raiz.izq == null) { // si es nulo el hijo izq de la raiz entra en el if
                raiz.izq = new Nodo(raiz, (int) dato); // crea el nodo hijo izq de la raiz con el valor pasado por parametro
                insertado = raiz.izq; // Nodo insertado siempre me dice cual es el último nodo agregado al arbol
                if (raiz.padre != null) { // si el padre de la raiz no es nulo:
                    cambiaColor(); // llamo al método que cambia de color
                }
            } else { // si no es nulo el hijo izq de la raiz
                raiz = raiz.izq; // hago que la raiz sea el hijo izq  
                insertar(dato, raiz); //y llamo de forma recursiva de nuevo al método
            }
        } else if (dato > raiz.dato) { // si el dato es mayor que la raiz
            if (raiz.der == null) { // si es nulo el hijo der de la raiz entra en el if
                raiz.der = new Nodo(raiz, (int) dato); // crea el nodo hijo izq de la raiz con el valor pasado por parametro
                insertado = raiz.der; // Nodo insertado siempre me dice cual es el último nodo agregado al arbol
                if (raiz.padre != null) { // si el padre de la raiz no es nulo:
                    cambiaColor(); // llamo al método que cambia de color
                }
            } else { // si no es nulo el hijo der de la raiz
                raiz = raiz.der; // hago que la raiz sea el hijo der  
                insertar(dato, raiz); //y llamo de forma recursiva de nuevo al método
            }
        }
    }

    private void cambiaColor() { //recibe el nodo al que se le insertó, no el insertado
        if (insertado.getPadre().getPadre() != null) { // si el abuelo del insertado no es nulo entra en el if
            if (insertado.getPadre().getPadre().getDer() == insertado.getPadre()) {
                tio = insertado.getPadre().getPadre().getIzq();
            } else {
                tio = insertado.getPadre().getPadre().getDer();
            }
        }

        if (tio != null) { // si el tio no es nulo
            if (tio.getColor() == 'R') { // pregunta si el color del tio es rojo
                insertado.setColor('N'); // cambia el color del insertado a negro
                tio.setColor('N'); // cambia el color del tio a negro tambien
                //System.out.println("Se cambió el color de pa " + insertado.getPadre().getDato() + " y de tio " + tio.getDato());
                if (insertado.getPadre() != raiz) { // pregunta si el padre del inserado no es la raiz
                    insertado.padre.setColor('R'); // si no lo es cambia el color del padre del insertado a rojo

                }
            }
        } else // si el tio es nulo
        if (insertado.getDato() < insertado.getPadre().getPadre().getDato()) { // si el valor del insertado < el valor del abuelo del insertado
            //System.out.println("Rotación derecha.");
            rotacion_Derecha(); // llama al método rotacion a la derecha
        } else {
            //System.out.println("Rotación izquierda.");
            rotacion_Izquierda(); // llama al método rotación a la izquierda
        }
    }

    private void rotacion_Derecha() {
        try {

        } catch (Exception dispatchUncaughtException) { // captura la excepción que podría generar el métod
            Nodo pa = insertado.getPadre(); // pa = padre del nodo insertado
            Nodo ab = pa.getPadre(); // ab = abuelo del nodo insertado
            if (insertado.getDato() < pa.getDato()) { // si valor insertado < valor padre insertado
                if (ab.getPadre().getIzq() == ab) { // si el hijo izq del bisabuelo del insertado es igual al abuelo
                    ab.padre.setIzq(pa); // establezco que el padre del abuelo sea el padre
                } else { // si el hijo izq del bisabuelo del insertado no es igual al abuelo
                    ab.padre.setDer(pa);
                    pa.setDer(ab);
                    pa.der.setIzq(null);
                    pa.setPadre(ab.getPadre());
                    pa.der.setPadre(pa);
                    pa.setColor('N');
                    pa.der.setColor('R');
                }
            } else { // si el valor insertado > valor padre insertado
                if (ab.getPadre().getIzq() == ab) {
                    ab.padre.setIzq(insertado);
                } else {
                    ab.padre.setDer(insertado);
                    insertado.setDer(ab);
                    ab.setPadre(insertado);
                    insertado.setIzq(pa);
                    pa.setDer(null);
                    ab.setIzq(null);
                    pa.setPadre(insertado);
                    insertado.setColor('N');
                    insertado.der.setColor('R');
                    insertado.izq.setColor('R');
                }
            }//rotacion derecha
        }
    }

    private void rotacion_Izquierda() {
        try {

        } catch (Exception dispatchUncaughtException) {
            Nodo pa = insertado.getPadre();
            Nodo ab = pa.getPadre();
            if (insertado.getDato() > insertado.getPadre().getDato()) {
                if (ab.getPadre().getDer() == ab) {
                    ab.padre.setDer(pa);
                } else {
                    ab.padre.setIzq(pa);
                    pa.setIzq(ab);
                    pa.setPadre(ab.getPadre());
                    pa.izq.setPadre(pa);
                    pa.izq.setDer(null);
                    pa.setColor('N');
                    pa.izq.setColor('R');
                }
            } else {
                //Doble rotación
                if (ab.getPadre().getDer() == pa) {
                    ab.padre.setDer(insertado);
                } else {
                    ab.padre.setIzq(insertado);
                    insertado.setIzq(ab);
                    ab.setPadre(insertado);
                    insertado.setDer(pa);
                    pa.setIzq(null);
                    ab.setDer(null);
                    pa.setPadre(insertado);
                    insertado.setColor('N');
                    insertado.der.setColor('R');
                    insertado.izq.setColor('R');
                }
            }//rotacion izquierda
        }
    }

    public void eliminar(double num) throws Exception {
        try {
            eliminar(raiz, (int) num); // me redirige al método privado donde le paso el dato y la raiz por parámetros
        } catch (Exception e) {
            System.out.println("El elemento no existe en el árbol");
        }
    }//eliminar

    private Nodo eliminar(Nodo rz, int num) throws Exception {
        if (rz.dato == num)// si el nodo es igual al valor pasado por parámetro
        {
            if (rz.der == null && rz.izq == null) { // si el nodo pasado por param no tiene hijos, es nodo hoja
                if (rz.padre != null) { // si el nodo tiene padre
                    if ((rz.padre.izq == null) || (rz.padre.der == null)) { // si alguno de los hijos del padre son nulos
                        rz.padre.color = 'R'; // cambio el color del padre a rojo
                    }
                }
                rz = null; // pongo a nulo el nodo pasado por parámetro
                return rz;
            }
            if (rz.der == null) { // si el nodo tiene un solo hijo(izquierdo)
                rz = rz.izq;
                return rz; // el hijo ocupa el lugar del padre
            }
            if (rz.izq == null) { // si el nodo tiene un solo hijo(derecho)
                rz = rz.der;
                return rz; // el hijo ocupa el lugar de padre
            }
            rz.dato = encontrarMax(rz.izq); 
            rz = ajustar(rz, rz.izq, rz); 
            return rz;//el nodo igualado (de mayor valor) se debe eliminar para que no quede repetido
        }
        //si no era el nodo que se queria borrar se aprovecha su ordenamiento para buscarlo
        if (num > rz.dato) { //si el valor pasado por param es mayor que el nodo
            rz.der = eliminar(rz.der, num); // llamamos de nuevo al método pero con el hijo derecho por parametro
            return rz; 
        } else { //si el valor pasado por param es menor que el nodo
            rz.izq = eliminar(rz.izq, num);  // llamamos de nuevo al método pero con el hijo izquierdo por parametro
            return rz;
        }
    }

    private int encontrarMax(Nodo rz) {
        if (rz.der == null) //si no hay un nodo con mayor valor retorna el mismo
        {
            return rz.dato;
        }
        return encontrarMax(rz.der); // sigue buscando en los nodos de mayor valor
    }

    private Nodo ajustar(Nodo padre, Nodo hijo, Nodo ancestro) { // método que ajusta
        if (hijo.der == null) { // si el hijo derechon del hijo pasado por param es nulo 
            if (padre.equals(ancestro)) { // si el padre es igual al ancestro
                padre.izq = hijo.izq; //igualo el padre izq al hijo izq
                return padre;
            }
            padre.der = hijo.izq; // hijo izq igual al padre derecho
            return padre;
        }
        // sigue buscando en los nodos de mayor valor
        hijo = ajustar(hijo, hijo.der, ancestro); // vuelvo a llamar a la función,cambiando los parámetros
        if (padre.equals(ancestro)) { // si el padre es igual al ancestro
            padre.izq = hijo; // hijo izq de padre igual al hijo
        } else {
            padre.der = hijo; // hijo der de padre igual al hijo
        }
        return padre;
    }

    public void mostrar() { // me muestra el arbol de forma recursiva inorden pasándole la raiz como parámetro
        if (raiz != null) {
            inorder(raiz);
        }
    }

    private void inorder(Nodo raiz) { // este método privado me va imprimiendo los diferentes atributos del nodo en cuestión
        if (raiz != null) {
            inorder(raiz.getIzq());
            System.out.println("\n -------------------");
            System.out.print("\n VALOR: " + raiz.getDato());
            System.out.print("\n HIJO IZQUIERDO: " + raiz.getIzq());
            System.out.print("\n HIJO DERECHO: " + raiz.getDer());
            System.out.print("\n COLOR:  " + raiz.getColor());
            inorder(raiz.getDer());
        }
    }

    public int sizeSubArbolIzquierdo() {
        return (sizeSubArbolIzquierdo(raiz));
    }

    private int sizeSubArbolIzquierdo(Nodo node) { //método privado que me devuelve el tamaño del subarbol izquiedo a aprtir de la raiz
        if (node == null) {
            return 0;
        } else {
            return (sizeSubArbolIzquierdo(node.izq) + 1); // si hay más nodos de forma recursiva vamos calculando el tamaño del subarbol izq
        }

    }

    public int size() {
        return (size(raiz));
    }

    private int size(Nodo node) { // igual q antes, a partir de la raiz va calculando recursivamente el num de datos del arbol
        if (node == null) {
            return 0;
        } else {
            return (size(node.izq) + 1 + size(node.der));
        }

    }

    public int findMin() { // empezando por la raiz me va comprobando que hay sucesivos hijos izquierdos y
        Nodo reco = raiz;
        while (reco.getIzq() != null) {
            reco = reco.getIzq(); // al llegar al último, sabe que es el valor mínimo que habrá en el árbol
        }
        int x = (int) reco.getDato();
        return x;
    }

}
