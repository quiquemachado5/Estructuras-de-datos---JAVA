
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author QM5
 */
public interface IBinarySearchTree {
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
    
    public void contains();

    boolean find(Object elementToFind);
    
    @Override
    String toString();
    
    Iterator inOrder();
    
    Iterator PreOrder();
    
    Iterator PostOrder();

    Iterator LevelOrder();
    
    
    
    
    
    
    
    
    
    
    
    Iterator findAll(Object elementToFind);

    void insert(Object element);
    
    Iterator entries(MyNode node);
    
    
    
    

    
}
