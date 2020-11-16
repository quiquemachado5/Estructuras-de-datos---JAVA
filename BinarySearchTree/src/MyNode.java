
public class MyNode {
    private Object valor;
    private MyNode parent;
    private MyNode leftchild;
    private MyNode rightchild;

    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }

    public MyNode getParent() {
        return parent;
    }

    public void setParent(MyNode parent) {
        this.parent = parent;
    }

    public MyNode getLeftChild() {
        return leftchild;
    }

    public void setLeftChild(MyNode leftchild) {
        this.leftchild = leftchild;
    }

    public MyNode getRightChild() {
        return rightchild;
    }

    public void setRightChild(MyNode rightchild) {
        this.rightchild = rightchild;
    }

    public boolean hasChildren(MyNode node) {
        boolean hasChildren = false;
        if (node.getLeftChild() != null && node.getRightChild() != null) {
            hasChildren = true;
        }
        return hasChildren;
    } 
}
