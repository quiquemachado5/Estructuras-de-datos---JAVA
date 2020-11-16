
import java.util.*;

public class BinaryTree<Object extends Comparable<Object>> {

    private Nodo raiz;
    Collection a = new ArrayList();
    int altura = 0;

    public BinaryTree() {
        raiz = null;
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

    public void addElement(Object element) {
        Nodo nodo = null;
        if (raiz == null) {
            nodo = new Nodo(element);
            raiz = nodo;
        } else {
            Nodo auxiliar = raiz;
            boolean insertado = false;
            while (!insertado) {
                if (auxiliar.getElement().compareTo(element) > 0) {
                    if (auxiliar.getIzq() != null) {
                        auxiliar = auxiliar.getIzq();
                    } else {
                        nodo = new Nodo(element);
                        nodo.setPadre(auxiliar);
                        auxiliar.setIzq(nodo);
                        insertado = true;
                    }
                } else {
                    if (auxiliar.getDer() != null) {
                        auxiliar = auxiliar.getDer();
                    } else {
                        nodo = new Nodo(element);
                        nodo.setPadre(auxiliar);
                        auxiliar.setDer(nodo);
                        insertado = true;
                    }
                }
            }
        }
        a.add(element);
    }

    public void removeElement(Object element) {
        //tener cuidado con los remove porque: , mirar lo q tngo apuntado en el possit rosa de la mesa
        if (raiz == null) {

        }
        if (raiz.getElement() == element) {
            if (raiz.getIzq() == null) {
                raiz = raiz.getDer();
            } else {
                if (raiz.getDer() == null) {
                    raiz = raiz.getIzq();
                } else {
                    BinaryTree der = this.subArbolDer();
                    raiz = raiz.getIzq();
                    Nodo max = (Nodo) findMax();
                    max.der = der.raiz;
                }
            }
        } else {
            if (raiz.getElement().compareTo(element) > 0) {
                BinaryTree hizq = this.subArbolIzq();
                hizq.removeElement(element);
                raiz.izq = hizq.raiz;
            } else {
                BinaryTree der = this.subArbolDer();
                der.removeElement(element);
                raiz.der = der.raiz;
            }
        }
    }

    public void removeMin() {
        if (raiz != null) {
            if (raiz.getIzq() == null) {
                raiz = raiz.getDer();
            } else {
                Nodo atras = raiz;
                Nodo reco = raiz.getIzq();
                while (reco.getIzq() != null) {
                    atras = reco;
                    reco = reco.getIzq();
                }
                atras.setIzq(null);
            }
        }
    }

    public void removeMax() {
        if (raiz != null) {
            if (raiz.getDer() == null) {
                raiz = raiz.getIzq();
            } else {
                Nodo atras = raiz;
                Nodo reco = raiz.getDer();
                while (reco.getDer() != null) {
                    atras = reco;
                    reco = reco.getDer();
                }
                atras.setDer(null);
            }
        }
    }

    public Object findMin() {
        Nodo reco = raiz;
        while (reco.getIzq() != null) {
            reco = reco.getIzq();
        }
        Object x = (Object) reco.getElement();
        return x;
    }

    public Object findMax() {
        Nodo reco = raiz;
        while (reco.getDer() != null) {
            reco = reco.getDer();
        }
        Object x = (Object) reco.getElement();
        return x;
    }
    public void removeLeftSubtree() {
        raiz.setIzq(null);
    }

    public void removeRightSubtree() {
        raiz.setDer(null);
    }

    public void removeAllElements() {
        raiz.setIzq(null);
        raiz.setDer(null);
        Nodo x = raiz;
        x.setElement(null);

        //funciona,primero borro subarbol izq y dsps dcho y dsps elimino la raiz
    }

    public boolean isEmpty() {
        boolean vacio;
        if (raiz.getElement() == null) {
            vacio = true;
        } else {
            vacio = false;
        }
        return vacio;
    }

    public int size() {
        return (size(raiz));
    }

    private int size(Nodo node) {
        if (node == null) {
            return 0;
        } else {
            return (size(node.izq) + 1 + size(node.der));
        }
        // si borro el arbol entero, por el 1 del return que suma, en vez de salir size=0 sale size=1,arreglar!!!!!
    }

    public boolean contains(Object element) {
        boolean contiene = false;
        if (a.contains(element)) {
            contiene = true;
        } else {
            contiene = false;
        }
        return contiene;
    }

    public Object find(Object elementToFind) {
        Object x;
        if (contains(elementToFind) == true) {
            x = elementToFind;
        } else {
            x = null;
        }
        return x;
    }

    public Iterator inOrder() {
        imprimirInOrden(getRaiz());
        Iterator it = a.iterator();
        return it;
    }

    private void imprimirInOrden(Nodo reco) {
        if (reco != null) {
            imprimirInOrden(reco.getIzq());
            System.out.println(reco.getElement() + "");
            imprimirInOrden(reco.getDer());
        }
    }

    public Iterator PreOrder() {
        imprimirPreOrden(getRaiz());
        Iterator it = a.iterator();
        return it;
    }

    private void imprimirPreOrden(Nodo reco) {
        if (reco != null) {
            System.out.println(reco.getElement() + "");
            imprimirPreOrden(reco.getIzq());
            imprimirPreOrden(reco.getDer());
        }
    }

    public Iterator PostOrder() {
        imprimirPostOrden(getRaiz());
        Iterator it = a.iterator();
        return it;
    }

    private void imprimirPostOrden(Nodo reco) {
        if (reco != null) {
            imprimirPostOrden(reco.getIzq());
            imprimirPostOrden(reco.getDer());
            System.out.println(reco.getElement() + "");
        }
    }

    public Iterator LevelOrder() {
        altura(raiz, 1);
        Iterator it = a.iterator();
        return it;
    }

    public void altura(Nodo aux, int nivel) {
        if (aux != null) {
            altura(aux.getIzq(), nivel + 1);
            if (nivel < altura) {
                altura = nivel;
            }
            altura(aux.getDer(), nivel + 1);
        }
    }

    /*@Override
     public String toString() {
     return ("\n "+raiz.getElement()+
     "\n Padre: ");
     7
     Padre: Nulo
     Hijo Izquierdo: 5
     Hijo Derecho: 9
     Factor de equilibrio: -1
     }*/
    private BinaryTree subArbolDer() {
        BinaryTree der = new BinaryTree();
        der.raiz = this.raiz.getDer();
        return der;
    }

    private BinaryTree subArbolIzq() {
        BinaryTree izq = new BinaryTree();
        izq.raiz = this.raiz.getIzq();
        return izq;
    }
    public void actualizarFE() {
        Iterator<Nodo> it = inOrder();
        while (it.hasNext()) {
            Nodo siguiente = it.next();
            siguiente.setFactorEquilibrio(siguiente.ajustarFE(siguiente));
        }
    }
    /*public Nodo insertar(Nodo nuevo, Nodo subAr) {
        Nodo nuevoPadre = subAr;
        if (nuevo.getElement().compareTo(subAr.getElement()) < 0) {
            if (subAr.izq == null) {
                subAr.izq = nuevo;
            } else {
                subAr.izq = insertar(nuevo, subAr.izq);
                if ((obtenerFe(subAr.izq) - (obtenerFe(subAr.der))) == 2) {
                    if (nuevo.getElement().compareTo(subAr.izq.getElement()) < 0) {
                        nuevoPadre = rotacionIzq(subAr);
                    } else {
                        nuevoPadre = rotacionDobleIzq(subAr);
                    }
                }
            }
        } else {
            if (nuevo.getElement().compareTo(subAr.getElement()) > 0) {
                if (subAr.der == null) {
                    subAr.der = nuevo;
                } else {
                    subAr.der = insertar(nuevo, subAr.der);
                    if ((obtenerFe(subAr.der) - (obtenerFe(subAr.izq))) == 2) {
                        if (nuevo.getElement().compareTo(subAr.izq.getElement()) > 0) {
                            nuevoPadre = rotacionDer(subAr);
                        } else {
                            nuevoPadre = rotacionDobleDer(subAr);
                        }
                    }
                }
            }else{
                System.out.println("Nodo duplicado");
            }

        }
        if((subAr.izq==null)&&(subAr.der!=null)){
            subAr.setFactorEquilibrio(subAr.der.getFactorEquilibrio()+1);
        }else{
            if((subAr.der==null)&&(subAr.izq!=null)){
                subAr.setFactorEquilibrio(subAr.izq.getFactorEquilibrio()+1);
            }else{
                subAr.setFactorEquilibrio(Math.max(obtenerFe(subAr.izq), obtenerFe(subAr.der))+1);
            }
        }
        return nuevoPadre;
    }
    public int obtenerFe(Nodo t){
        if(t==null){
            return -1;
        }else{
            return t.getFactorEquilibrio();
        }
    }
    public Nodo rotacionIzq(Nodo t){
        Nodo aux = t.izq;
        t.izq = aux.der;
        aux.der=t;
        t.setFactorEquilibrio(Math.max(obtenerFe(t.izq), obtenerFe(t.der))+1);
        aux.setFactorEquilibrio(Math.max(obtenerFe(t.izq), obtenerFe(t.der))+1);
        return aux;
    }
    public Nodo rotacionDer(Nodo t){
        Nodo aux = t.der;
        t.der = aux.izq;
        aux.izq=t;
        t.setFactorEquilibrio(Math.max(obtenerFe(t.izq), obtenerFe(t.der))+1);
        aux.setFactorEquilibrio(Math.max(obtenerFe(t.izq), obtenerFe(t.der))+1);
        return aux;
    }
    public Nodo rotacionDobleIzq(Nodo t){
        Nodo temp;
        t.izq=rotacionDer(t.izq);
        temp=rotacionIzq(t);
        return temp;
    }
    public Nodo rotacionDobleDer(Nodo t){
        Nodo temp;
        t.der=rotacionDer(t.der);
        temp=rotacionDer(t);
        return temp;
    }*/
}
    
