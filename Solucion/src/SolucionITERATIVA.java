
public class SolucionITERATIVA {
    int vector1[] = new int[100];
    int vector2[] = new int[100];

    public boolean sonMatricesIguales(int matriz1[][], int matriz2[][], int fila) {
        int contador = 0;
        boolean resultado = false;
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                if(matriz1[i][j]==matriz2[i][j]){
                    contador++;
                }
            }
        }
        if(contador == matriz1.length){
            resultado = true;
        }else{
            resultado = false;
        }
        return resultado;
    }
}
