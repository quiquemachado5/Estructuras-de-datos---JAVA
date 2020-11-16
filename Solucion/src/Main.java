
import static java.time.Clock.system;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //MÉTOD TRADICIONA DE INTRODUCIR POR TECLADO LOS VALORES DE LAS MATRICES
        /*Scanner sc = new Scanner(System.in);
        System.out.println("\n ¿Qué dimensión tendrá su matriz?");
         int dimension = sc.nextInt();

        int matriz1[][] = new int[dimension][dimension];
        int matriz2[][] = new int[dimension][dimension];
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.println("Introduzca un valor para el elemento [" + i + "][" + j + "] de la MATRIZ 1:");
                matriz1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.println("Introduzca un valor para el elemento [" + i + "][" + j + "] de la MATRIZ 2:");
                matriz2[i][j] = sc.nextInt();
            }
        }*/
        
        int contador = 10;
        for (int i = 1; i < contador; i++) {
            int dimension = i;
            int matriz1[][] = new int[dimension][dimension];
            int matriz2[][] = new int[dimension][dimension];
            for (int k = 0; k < matriz1.length; k++) {
                for (int j = 0; j < matriz1.length; j++) {
                    matriz1[k][j] = (int)(Math.random()*9+1);
                }
            }
            for (int k = 0; k < matriz2.length; k++) {
                for (int j = 0; j < matriz2.length; j++) {
                    matriz2[k][j] = (int)(Math.random()*9+1);
                }
            }
            experimento(matriz1, matriz2, i);
        }/*Basicamente esta parte del código me va rellenado las matrices con valores aleatorios de 1 a 10 y después
        llama al método experimento pasandole las dos matrices */

    }

    public static void experimento(int matriz1[][], int matriz2[][], int i) {
        Solucion s = new Solucion();
        SolucionITERATIVA si = new SolucionITERATIVA();
        int fila = matriz1.length;
        long inicio = System.nanoTime();
        s.sonMatricesIguales(matriz1, matriz2, fila);
        long fin = System.nanoTime();
        long sumatorioTiempos = fin - inicio;
        long iniciosi = System.nanoTime();
        si.sonMatricesIguales(matriz1, matriz2, fila);
        long finsi = System.nanoTime();
        long sumatorioTiempossi = finsi - iniciosi;
        
        //Imprimo los valores de los sumatorios y el resultado del método de la clase Solución
        System.out.println("\nDIMENSIÓN RECURSIVA             TIEMPO // DIMENSION ITERATIVA              TIEMPO");
        System.out.println(+matriz1.length + " x " + matriz2.length+"                           "+sumatorioTiempos+"  "+matriz1.length + " x " + matriz2.length+"                            "+sumatorioTiempossi);

    }

}
