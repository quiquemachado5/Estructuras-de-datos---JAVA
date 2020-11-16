
public class PruebaCola {
    public static void main(String[] args) throws EmptyQueueException, QueueFullException {
        Cola cola = new Cola();
        System.out.println(cola.isEmpty());
        System.out.println(cola.isFull());
        System.out.println(cola.front());
        cola.enqueue(23);
        cola.enqueue(24);
        cola.enqueue(25);
        cola.enqueue(26);
        cola.enqueue(27);
        System.out.println(cola.isEmpty());
        System.out.println(cola.isFull());
        System.out.println(cola.front());
        System.out.println(cola.size());
        cola.dequeue();
        cola.dequeue();
        System.out.println(cola.size());
        System.out.println(cola.front());
        
    }
}
