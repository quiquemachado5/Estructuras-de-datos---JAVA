package juegojosephus;

public class LinkedQueue implements IQueue {

    Nodo top, low; //Declaro los nodos top(arriba) y low(abajo)

    public LinkedQueue() { //Constructor sin parámetros
        top = low = null;
    }

    @Override
    public boolean buscar(Object elemento) {
        return true;
    }

    @Override
    public void enqueue(Object elemento) {
        Nodo temporal = new Nodo(elemento);
        if (this.low == null) { //si el nodo low es nulo, la cola esta vacía y añadimos el elemento directamente
            this.top = this.low = temporal;
        }
        this.low.siguiente = temporal; //si no el nodo siguiente a low es donde añadimos el elemento
        this.low = temporal; //ahora el último nodo pasa a ser el elemento
    }

    @Override
    public void dequeue() { //método para desencolar
        if (this.top != null) {  //si top no es nulo
            Nodo temp = this.top;
            this.top = this.top.siguiente; //el elemento siguiente de top es el nuevo top
        }
    }

    @Override
    public Object front() {
        return this.top; //Devuelve el elemento más alto de la cola
    }

    @Override
    public boolean isEmpty() { //método para comprobar si está o no vacía la cola
        boolean vacio = false;
        if (size() <= 0) {
            vacio = true;
        }
        return vacio;
    }

    @Override
    public int size() {
        int n = 0;
        while (this.low.siguiente != null) {
            n++;
        }
        return n;
    }

    public int josephus(int n, int k) {
        if (n == 1) {
            return 1;
        } else {
            return (josephus(n - 1, k) + k - 1) % n + 1; //Algoritmo que resuelve el problema
        }
    }
}
