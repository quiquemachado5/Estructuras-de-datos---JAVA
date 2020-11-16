
import java.util.Arrays;

public class Solucion {

    

    public boolean sonMatricesIguales(int matriz1[][], int matriz2[][], int fila) { //Método propuesto
        int vector1[] = new int[100]; //Declaro e inicializo con un tamaño grande los dos vectores a usar
        int vector2[] = new int[100]; //" "
        int columna = matriz1.length - 1; //Declaro la columna con el mismo tamaño que la matriz - 1, para que siempre que llame al método se me inicialize con el mismo valor para después poder ir decrementándola
        boolean sonIguales = true;

        if (fila == 0) { //Caso BASE
            System.out.println(""); //No hago nada ya que está todo calculado
        } else { 
            if (fila > 0) { //Si la fila es mayor a 0,entra al CASO GENERAL
                for (int i = 0; i < matriz1.length; i++) { //for que me recorre de 0 a la dimensión de la matriz
                    vector1[i] = matriz1[fila - 1][columna]; //agrego en las diferentes posiciones del vector, los valores sucesivos de las filas y columnas
                    vector2[i] = matriz2[fila - 1][columna];
                    columna--;
                }
                if (sonVectoresIguales(vector1, vector2) == true) { //llamo al método sonIguales y si son true:
                    sonIguales = true; //booleano a true
                    System.out.println("\nFila " + fila + " de ambas matrices es igual: " + sonIguales); //Imprimo mensaje por pantalla informando
                } else { //sino
                    sonIguales = false; //booleano a false
                    System.out.println("\nFila " + fila + " de ambas matrices es igual: " + sonIguales); //" "
                }
                sonMatricesIguales(matriz1, matriz2, fila - 1);//vuelvo a llamar a la función recursivamente, pero esta vez con una fila menos
            } else { //Aquí nunca entrará ya que solo sería si fila<0, pero por aclarar que pasaría lo he dejado puesto en el código
                System.out.println("\n No hay más filas que comparar");
            }
        }
        return sonIguales; //Devuelvo el booleano con el valor de la respuesta
    }

    public boolean sonVectoresIguales(int vector1[], int vector2[]) { 
        boolean sonIguales = false; // declaro el booleano resultado
        int vector1Fila[] = new int[vector1.length]; //Declaro ambos vectores con los que trabajaré con la misma dimensión del vector que recibo por parámetros
        int vector2Fila[] = new int[vector2.length]; //" "
        vector1Fila = Arrays.copyOfRange(vector1, 0, vector1.length); //Empleo la función copyOfRange para relleanr el vector anteriormente declarado con el valor desde 0 a vector.length y a continunación poder trabajar ccon él
        vector2Fila = Arrays.copyOfRange(vector2, 0, vector2.length); // " "

        int contador = 0; //declaro un contador a 0
        for (int j = 0; j < vector1Fila.length; j++) { // recorro desde 0 a la dimensión de los vectores e
            if (vector1Fila[j] == vector2Fila[j]) { // voy comprobando si son iguales los dos vectores posición a posición
                contador++; // si lo son, añado uno al contador
            }
        }
        
        if (contador == vector1.length) { //si el contador al terminar el bucle es igual a la dimensión de vector:
            sonIguales = true; //booleano es true 
        } else {
            sonIguales = false; //booleano es false
        }
        return sonIguales; //devuelvo el resultado al método sonMatricesIguales
    }
}
