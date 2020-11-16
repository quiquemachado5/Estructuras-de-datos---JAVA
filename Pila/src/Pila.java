
        
public class Pila extends Nodo implements IPila {

    private int cima;
    private Object v[];

    public Pila(){
        this.cima = 0;
        v = new Object[5];
    }

    @Override
    public boolean isEmpty() {
         if(tamanyo() <= 0){
            return true;
        }else{
            return false;
         }
    }

    @Override
    public int tamanyo() {
        return cima;
    }

    @Override
    public void apilar(Object element) {
        if(tamanyo()==v.length){
            System.out.println("Pila llena");
        }
        v[cima]=element;
        cima++;
    }

    @Override
    public Object desapilar() {
        if(tamanyo()<0){
            System.out.println("La pila está vacía");
        }
        Object o = v[cima-1];
        v[cima-1]=null;
        cima--;
        return o;
    }
    
    @Override
   public Object cima() throws FullStackException{
       if(cima==v.length){
           throw new FullStackException("Pila llena");
       }else{
           return v[cima-1];
       }
       
   }
   
   
}