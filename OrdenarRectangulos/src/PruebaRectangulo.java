import java.util.*;

public class PruebaRectangulo {
    public static void main(String[] args) {
            Rectangulo r1 = new Rectangulo(12,34);
            Rectangulo r2 = new Rectangulo(2,23);
            Rectangulo r3 = new Rectangulo(1,9);
            Rectangulo r4 = new Rectangulo(56,2);
            
            r1.calcularArea(12, 34);
            r2.calcularArea(2, 23);
            r3.calcularArea(1, 9);
            r4.calcularArea(56, 2);
            
            List c = new ArrayList();
            c.add(r1);
            c.add(r2);
            c.add(r3);
            c.add(r4);
          
            
            Collections.sort(c,new PrimerComparador());
            
            Iterator it = c.listIterator();
            while(it.hasNext()){
                System.out.println(" "+it.next());
            }
            
            Collections.sort(c, new SegundoComparador());
            
            Iterator ot = c.listIterator();
            while(ot.hasNext()){
                System.out.println(" "+ot.next());
            }
    }
}
