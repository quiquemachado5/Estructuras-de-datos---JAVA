
public interface ICola {

    public int size();

    public boolean isEmpty();

    public boolean isFull();

    public Object front() throws EmptyQueueException;

    public void enqueue(Object element) throws QueueFullException ;
    
    public Object dequeue() throws EmptyQueueException ;
}
