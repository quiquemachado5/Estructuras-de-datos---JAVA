
public class Numero implements INumero{
    private int n1;
    private int n2;
    
    
    public Numero(int n1,int n2){
        
        this.n1 = n1;
        this.n2 = n2;
        
    }
    
    @Override
    public String toString(){
        return (""+this.getN1());
    }

    @Override
    public int getN1() {
        return this.n1;
    }

    @Override
    public void setN1(int n1) {
        this.n1 = n1;
    }
    @Override
    public int getN2() {
        return this.n2;
    }

    @Override
    public void setN2(int n2) {
        this.n2 = n2;
    }

    
}
