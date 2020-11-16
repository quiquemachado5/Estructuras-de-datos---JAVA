
import java.util.Comparator;


public class ConjuntoOrdenado extends Conjunto{
   private Comparator criterio; 
   
   public ConjuntoOrdenado(){
       this.datos = new Object[100];
       this.criterio = criterio;
   }
   public ConjuntoOrdenado( Comparator criterio ){
       this.datos = new Object[100];
       this.criterio = null;
   }
   
   public ConjuntoOrdenado( Conjunto c ){
       this.numDatos = c.numDatos;
       this.datos = new Object[this.numDatos];
       for (int i = 0; i < numDatos; i++) {
          this.datos[i]=c.datos[i];
       }
       this.criterio = null;
   }
   public ConjuntoOrdenado( Comparator criterio, Conjunto c ){
       this.numDatos = c.numDatos;
       this.datos = new Object[this.numDatos];
       for (int i = 0; i < numDatos; i++) {
          this.datos[i]=c.datos[i];
       }
       this.criterio = criterio;
   }
}
