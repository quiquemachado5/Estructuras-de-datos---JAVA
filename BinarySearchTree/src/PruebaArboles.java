
public class PruebaArboles {
    public static void main(String[] args) {
        MyNode n1 =  new MyNode();
        MyNode n2 =  new MyNode();
        MyNode n3 =  new MyNode();
        MyNode n4 =  new MyNode();
        
        
        BinarySearchTree b = new BinarySearchTree();
        b.addElement(n1);
        b.addElement(n2);
        b.addElement(n3);
        b.addElement(n4);
        
        System.out.println(b.size());
        System.out.println(n1.hasChildren(n4));
        
    }
}
