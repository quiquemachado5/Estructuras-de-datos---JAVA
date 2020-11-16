package juegojosephus;

public interface IQueue {
    boolean buscar(Object o);
    void dequeue()throws EmptyQueueException;; 
    void enqueue(Object o);
    Object front()throws EmptyQueueException; ; 
    boolean isEmpty();
    int size(); 
}
