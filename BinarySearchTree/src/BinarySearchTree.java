
import java.util.*;

public class BinarySearchTree implements IBinarySearchTree {

    //Falta por implementar : insert, removeElement, removeAllOcurrences
    private MyNode root;
    private Comparador comparador;

    @Override
    public void addElement(Object element) {

        MyNode elemento = (MyNode) element;
        MyNode inicio = root;

        while (inicio.hasChildren(inicio)) {
            if (comparador.compare(inicio, element) < 0) {
                addElement(inicio.getRightChild());
            } else {
                addElement(inicio.getLeftChild());
            }
        }
        if (comparador.compare(inicio, element) < 0) {
            inicio.setRightChild(elemento);
        } else {
            inicio.setLeftChild(elemento);
        }
    }

    @Override
    public Object removeElement(Object element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    public void removeAllOcurrences(Object element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object removeMin() {
        MyNode inicio = root;
        MyNode aux = new MyNode();

        while (inicio.getLeftChild().getLeftChild() != null) {
            inicio = inicio.getLeftChild();
        }
        aux = inicio.getLeftChild();
        inicio.setLeftChild(null);

        return aux;
    }

    @Override
    public Object removeMax() {
        MyNode inicio = root;
        MyNode aux = new MyNode();

        while (inicio.getRightChild().getRightChild() != null) {
            inicio = inicio.getRightChild();
        }
        aux = inicio.getRightChild();
        inicio.setRightChild(null);

        return aux;
    }

    @Override
    public Object findMin() {
        MyNode inicio = root;

        while (inicio.getLeftChild() != null) {
            inicio = inicio.getLeftChild();
        }

        return inicio;
    }

    @Override
    public Object findMax() {
        MyNode inicio = root;

        while (inicio.getRightChild() != null) {
            inicio = inicio.getRightChild();
        }

        return inicio;
    }

    @Override
    public boolean find(Object elementToFind) {
        MyNode elementoAEncontrar = (MyNode) elementToFind;
        MyNode inicio = root;
        boolean encontrado = false;

        while (inicio.hasChildren(root) && !encontrado) {
            if (comparador.compare(inicio, elementoAEncontrar) < 0) {
                find(inicio.getRightChild());
            }
            if (comparador.compare(inicio, elementoAEncontrar) > 0) {
                find(inicio.getLeftChild());
            }
            if (comparador.compare(inicio, elementoAEncontrar) == 0) {
                encontrado = true;
            }
        }

        return encontrado;
    }

    public Object getRoot() {
        return root;
    }

    public void setRoot(MyNode root) {
        this.root = root;
    }

    @Override
    public Iterator findAll(Object elementToFind) {
        Set todos = null;
        MyNode elemento = (MyNode) elementToFind;
        Iterator it = this.entries(root);
        while (it.hasNext()) {
            if (((MyNode) it.next()).getValor() == elemento.getValor()) {
                todos.add(it);
            }
            it = (Iterator) it.next();
        }
        return todos.iterator();
    }

    @Override
    public void insert(Object element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterator entries(MyNode node) {
        Set entries = null;
        MyNode nodo = root;

        if (nodo.getLeftChild() != null) {
            entries(nodo.getLeftChild());
        }
        entries.add(node);
        if (nodo.getRightChild() != null) {
            entries(nodo.getRightChild());
        }

        Iterator it = entries.iterator();
        return it;
    }

    @Override
    public int size() {
        Iterator it = this.entries(root);
        int cont = 0;

        while (it.hasNext()) {
            cont++;

            it = (Iterator) it.next();
        }

        return cont;
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public void removeLeftSubtree() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeRightSubtree() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeAllElements(Object element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void contains() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterator inOrder() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterator PreOrder() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterator PostOrder() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterator LevelOrder() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
