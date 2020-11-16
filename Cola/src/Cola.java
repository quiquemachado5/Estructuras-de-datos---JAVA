
public class Cola {

    private Object v[];
    private int tail;
    private int top;
    Nodo cabeza;
    Nodo cola;
    int tamanyo = 0;

    public Cola() {
        v = new Object[5];
        tail = 0;
        top = 0;
    }

    public int size() {
        return top;
    }

    public boolean buscar(Object o) {
        boolean encontrado = false;
        int i = tail;
        while (encontrado = false && i < size()) {
            if (v[i].equals(o)) {
                encontrado = true;
            } else {
                i++;
            }
        }
        return encontrado;
    }

    public boolean isEmpty() {
        if (size() < 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (top == v.length) {
            return true;
        } else {
            return false;
        }
    }
//devuelve el primer elemento de la cola 

    public Object front() throws EmptyQueueException {
        if (isEmpty() == true) {
            throw new EmptyQueueException("getFront: Queue is empty!!");
        }
        return v[tail];
    }

    public void enqueue(Object element) throws QueueFullException {
        /*if (isFull() == true) {
            throw new QueueFullException("Queue is full");
        }
        v[top] = element;
        top++;*/
        
        if(element!=null){
            Nodo n = new Nodo();
            n.setElement(element);
            if(cola!=null){
                cola.setNext(n);
                cola = n;
            }else{
                cola = n;
                cabeza = n;
            }
            tamanyo++;
        }
    }

    public Object dequeue() throws EmptyQueueException {
        /*Object o = null;
        if (isEmpty() == true) {
            throw new EmptyQueueException("dequeue: Queue is empty!!");
        } else {
            o = v[tail];
            for (int i = tail; i < (size() - 1); i++) {
                v[i] = v[i + 1];
            }
            v[top - 1] = null;
            top--;
        }*/
        
        if (isEmpty() == true) {
            throw new EmptyQueueException("dequeue: Queue is empty!!");
        } else {
            if (cabeza != null) {
            Nodo n = cabeza;
            cabeza = cabeza.getNext();
            n.setNext(null);
            this.tamanyo--;
        }
        }
        
        return o;

    }
    

}
