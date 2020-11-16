
import java.util.Random;
import java.util.Arrays;

public class Matriz {

    private double[][] m;
    private int f;
    private int c;
    private int numElementos;

    public Matriz() {
        this.m = new double[3][3];
        this.numElementos = 0;
        this.f = 3;
        this.c = 3;
    }

    public void valores() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                Random rnd = new Random();
                m[i][j] = rnd.nextInt();
                this.numElementos++;

            }
        }
    }

    public void ordena() {
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                for (int x = 0; x < f; x++) {
                    for (int y = 0; y < c; y++) {
                        if (m[i][j] > m[x][y]) {
                            int t = (int) m[i][j];
                            m[i][j] = m[x][y];
                            m[x][y] = t;
                        }
                    }
                }
            }
        }
    }

    public void mostrar() {
        for (int i = 0; i < this.m.length; i++) {
            for (int j = 0; j < this.m.length; j++) {
                System.out.println(this.m[i][j]);
            }
        }
    }
}
