
import java.util.Comparator;

public class Comparador implements Comparator<INumero> {

    @Override
    public int compare(INumero o1, INumero o2) {
        if (o1.getN1() % 2 == 0) {
            if (o2.getN2() % 2 == 0) {
                if (o1.getN1() < o2.getN2()) {
                    return -1;
                } else {
                    return 1;
                }
            } //if (o2 % 2 != 0)
            else {
                return -1;
            }
        } else {
            if (o2.getN2() % 2 != 0) {
                if (o1.getN1() < o2.getN2()) {
                    return 1;
                } else {
                    return -1;
                }
            } //if (o2 % 2 == 0)
            else {
                return 1;
            }
        }

    }

   
}
