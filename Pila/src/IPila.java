
public interface IPila<E> {
    public int tamanyo();
    public boolean isEmpty();
    public E cima () throws FullStackException;
    public void apilar(E element);
    public E desapilar();
}
