
import java.util.*;

public class Experimento6 {

    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();
        Iterator it; // Referencia al iterador

        for (int i = 1; i <= 5; i++) // Rellenamos la coleccion
        {
            c.add(i);
        }

        it = c.iterator(); // Obtenemos un iterador para la colección
        while (it.hasNext()) { // Mientras haya más elementos
           int i = (int)it.next();

            if (i % 2 == 0) {
                it.remove();
            }

            if (i % 3 == 0) {
                it.remove();
            }
        }

        it = c.iterator(); // Obtenemos un iterador para la colección
        while (it.hasNext()) // Mientras haya más elementos
        {
            System.out.println( it.next()); // Imprimimos el siguiente elemento
        }
    }
}
