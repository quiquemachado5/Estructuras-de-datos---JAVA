import java.util.*;

public interface IBinaryTree {

    void addElement(Object element);

    Object removeElement(Object element);

    Object removeMin();

    Object removeMax();

    Object findMin();

    Object findMax();
    
    void removeLeftSubtree();
    
    void removeRightSubtree();
    
    void removeAllElements(Object element);
    
    boolean isEmpty();
    
    int size();
    
    public boolean contains(Object element);

    Object find(Object elementToFind);
    
    @Override
    String toString();
    
    Iterator inOrder();
    
    Iterator PreOrder();
    
    Iterator PostOrder();

    Iterator LevelOrder();
}
