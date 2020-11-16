
public class Conjunto {

    protected Object[] datos;
    protected int numDatos = 100;

    public Conjunto() {
        this.datos = new Object[numDatos];
    }

    public Conjunto(Conjunto c) {
        this.numDatos = c.numDatos;
        this.datos = new Object[this.numDatos];
        
        for (int i = 0; i < numDatos; i++) {
            this.datos[i] = c.datos[i];
        }
    }

    public boolean anyadir(Object o) {
        boolean anyadido = false;
        for (int i = 0; i < this.datos.length; i++) {
            if (this.buscar(o) == -1 || i < this.datos.length) {
                this.datos[i] = 0;
                numDatos++;
                anyadido = true;
            } else {
                System.out.println("No se ha podido añadir");
                anyadido = false;
            }
        }
        return anyadido;
    }   
    
    public boolean borrar(Object o){
        boolean borrado = false;
        for (int i = 0; i < numDatos; i++) {
            if(this.buscar(o)!= -1){
                this.datos[i]=this.datos[i+1];
                numDatos--;
                borrado = true;
            }else{
                System.out.println("No se ha podido borrar el elemento");
                borrado = false;
            }
        }
        return borrado;
    }

    public int buscar(Object o) {
        int posicion = 0;
        for (int i = 0; i < numDatos; i++) {
            if (o.equals(this.datos[i])) {
                posicion = i;
            } else {
                System.out.println("Error, no existe ese elemento en el vector");
                posicion = -1;
            }
        }

        return posicion;
    }
    
    public int tamanyo(){
        return this.numDatos;
    }
    
    public Object obternerElemento(int i){
        Object o;
        if(i<numDatos){
            o = this.datos[i];
        }else{
            System.out.println("Posición no encontrada");
            o = null;
        }
        return o;
    }
   
}
