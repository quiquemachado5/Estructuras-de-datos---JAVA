package juegojosephus;

public class ArrayQueue implements IQueue{
    int top, low;   //Declaro el elemento más alto y más bajo de la pila
    Object cola[];  //Vector de tipo object
    
    public ArrayQueue(){ //Constructor sin parámetros
        this.top=0;
        this.low=0;
        cola = new Object[1000]; //Creo el vector con suficiente espacio
    }
    
    @Override
    public boolean buscar(Object element) { //Método que busca un elemento en la pila
        boolean buscar = false;
        int i = top;
        while (!buscar && i<top){
            if(cola[i].equals(element)){
                buscar=true;
            }
            else{
                i++;
            }
        }
        return buscar;
    }
    
    @Override
    public void enqueue(Object elemento) { //Método que guarda el elemento pasado por parametro en la pila
        if(elemento!=null){     //si es diferente de nulo:  
            low++;              //incrementa la variable low una unidad
            cola[low]=elemento; //guarda el elemento en la ultima posicion del vector
            
        }
    }
    
    @Override
    public void dequeue() { //Método que "desapila" el elemento más alto de la cola
        Object elemento = null;
        if(isEmpty()== false){ //utilizo el método isEmpty para saber que la cola no está vacía
            cola[top]=null; //establezco a nulo el elemento más alto de la cola
            cola[top]= cola[top-1]; //decremento la variable top en una unidad, para que el 2º elemento por arriba, sea ahora el 1º
            //low--;
        }
        else{
            System.out.println("La cola esta vacia"); // si está vacía la cola, imprimimos por pantalla el mensaje
        }
    }

    @Override
    public Object front(){ //Método que devuelve el elemento más alto de la cola
        return cola[top];
    }

    @Override
    public boolean isEmpty(){ //Método que devuelve un booleano true si está vacía
        boolean vacio=false;
        if(size()<=0){ //llamo al método size para saber si es o no mayor que 0
            vacio=true;
        }
        return vacio;
    }

    @Override
    public int size() { //Me calcula el núm. de elementos que tiene la cola
        int n=0;
        for (int i = 0; i < cola.length; i++) { //Recorro el array y guardo el núm de iteraciones en el contador n 
            n++;
        }
        return n;
    }
    public int josephus(int n,int k){
         if(n==1){ 
             return 1;
         }else{
             return (josephus(n-1,k)+k-1)%n+1; //Algoritmo recursivo que resuelve el problema
         }
     }
}
