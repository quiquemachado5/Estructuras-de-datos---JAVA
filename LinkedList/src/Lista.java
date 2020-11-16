
public class Lista {
    private Nodo cabeza;
    private Nodo cola;
    private int tamanyo;
    
    public Lista(){
        this.cabeza = null;
        this.cola = null;
        this.tamanyo = 0;
    }
    
    public boolean isEmpty(){
        return(cabeza==null);
    }
    public int size(){
        return tamanyo-1;
    }
    public Nodo getNodo(int index){
        if(isEmpty() || (index < 0 || index > size())){
            return null;
        }else{
            Nodo buscado = cabeza;
            int cont = 0;
            while(buscado.getNext()!=null && cont<index){
                cont++;
                buscado = buscado.getNext();
            }
            return buscado;
        }
    }
    public void add(Object element,int index){
        if(index==0){
           addFront(element);
        }else if (index==size()){
            addEnd(element);
        }else if(index<0 || index>=size()){
            System.out.println("Error al agregar");
        }else{
            if(element!=null){
                Nodo n = new Nodo(element);
                if(cabeza==null){
                    n.setNext(null);
                    cabeza = n;
                    cola = n;
                }else{
                    Nodo puntero = cabeza;
                    int cont = 0;
                    while(puntero.getNext()!=null && cont<index){
                        puntero = puntero.getNext();
                        cont++;
                    }
                    n.setNext(puntero.getNext());
                    puntero.setNext(n);
                }
            }else{
                System.out.println("Posicion invalida");
            }
            /*Nodo anterior = getNodo(index - 1 );
            Nodo actual = getNodo(index);
            Nodo n = new Nodo(element,actual);
            anterior.setNext(n);*/
        }
        this.tamanyo++;
    }
    public void addFront(Object element){
        if(element!=null){
            Nodo n = new Nodo();
            n.setElement(element);
            if(cabeza!=null){
                n.setNext(cabeza);
                cabeza = n;
            }else{
                n.setNext(null);
                cabeza = n;
                cola = n;
            }
            this.tamanyo++;
        }else{
            System.out.println("Error..NULO");
        }
    }
    public void addEnd(Object element){
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
            this.tamanyo++;
        }else{
            System.out.println("Error..NULO");
        }
        
    }
    
    public Object getElement(int index) throws IndexOutOfBoundsException{
        Object elemento = null;
        if(index>=0 && index<tamanyo){
            if(cabeza!=null){
                Nodo n = cabeza;
                int cont = 0;
                while(n.getNext()!=null && cont<index){
                    n = n.getNext();
                    cont++;
                }
                elemento = n.getElement();
            }
        }else{
            throw new IndexOutOfBoundsException("Posición inválida");
        }
        return elemento;
    }
    
    public void remove(int index){
        if(!isEmpty()){
            if(index>0 && index<size()){
                Nodo n = cabeza;
                int cont = 0;
                while(n.getNext()!=null && cont<size()){
                    n = n.getNext();
                    cont++;
                }
                n.setNext(null);
                this.tamanyo--;
            }else{
                System.out.println("Error");
            }
        }else{
            System.out.println("Lista vacía");
        }
    }
    
    public void removeEnd(){
        Nodo n = cabeza;
        while(n.getNext()==cola){
            cabeza = cabeza.getNext();
        }
        n.setNext(null);
        cola = n;
        tamanyo--;
    }
    
    public void removeFront(){
   
        if (cabeza != null) {
            Nodo n = cabeza;
            cabeza = cabeza.getNext();
            n.setNext(null);
            tamanyo--;
        }
    }
    
}
