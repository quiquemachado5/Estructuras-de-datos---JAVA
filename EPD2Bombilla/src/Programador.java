
public class Programador {
  
    private Bombilla bomb1;
    private Bombilla bomb2;
    private Bombilla bomb3;
    private Bombilla bomb4;
    private Bombilla bomb5;
    private Bombilla bomb6;
    
    public Programador(){
        this.bomb1 = new Bombilla();
        this.bomb2 = new Bombilla();
        this.bomb3 = new Bombilla();
        this.bomb4 = new Bombilla();
        this.bomb5 = new Bombilla();
        this.bomb6 = new Bombilla();
    }

    /**
     * @return the bomb1
     */
    public Bombilla getBomb1() {
        return bomb1;
    }

    /**
     * @param bomb1 the bomb1 to set
     */
    public void setBomb1(Bombilla bomb1) {
        this.bomb1 = bomb1;
    }

    /**
     * @return the bomb2
     */
    public Bombilla getBomb2() {
        return bomb2;
    }

    /**
     * @param bomb2 the bomb2 to set
     */
    public void setBomb2(Bombilla bomb2) {
        this.bomb2 = bomb2;
    }

    public Bombilla getBomb3() {
        return bomb3;
    }

    public void setBomb3(Bombilla bomb3) {
        this.bomb3 = bomb3;
    }

    public Bombilla getBomb4() {
        return bomb4;
    }

    public void setBomb4(Bombilla bomb4) {
        this.bomb4 = bomb4;
    }

    public Bombilla getBomb5() {
        return bomb5;
    }

    public void setBomb5(Bombilla bomb5) {
        this.bomb5 = bomb5;
    }

    public Bombilla getBomb6() {
        return bomb6;
    }

    public void setBomb6(Bombilla bomb6) {
        this.bomb6 = bomb6;
    }
    
    public void Programa1(){
        this.bomb1.encender();
        this.bomb1.mostrar();
        this.bomb2.mostrar();
        this.bomb3.encender();
        this.bomb3.mostrar();
        this.bomb4.mostrar();
        this.bomb5.encender();
        this.bomb5.mostrar();
        this.bomb6.mostrar();
    }
    public void Programa2(){
        this.bomb1.encender();
        this.bomb2.encender();
        this.bomb3.encender();
        this.bomb4.encender();
        this.bomb5.encender();
        this.bomb6.encender();
        
        this.bomb1.mostrar();
        this.bomb2.mostrar();
        this.bomb3.mostrar();
        this.bomb4.mostrar();
        this.bomb5.mostrar(); 
        this.bomb6.mostrar();
            
            
            
        
    }
}