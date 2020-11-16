package javaapplication41;

public class sumar {

    int suma(int v[], int n) {
        int total = 0;
        if (n < v.length) {
            return v[n] + suma(v, n + 1);
        }
        return 0;
    }

    int cuenta(int v[], int x, int n) {
        int total = 0;
        if (n < v.length) {
            if (v[n] == x) {
                return 1 + cuenta(v, x, n + 1);
            } else {
                return 0 + cuenta(v, x, n + 1);
            }
        }
        return 0;
    }

    int sumaMatriz(int m[][],int nF,int nC){
        int matriz = m.length;
        System.out.println(" "+matriz);
        if (nF == 0 && nC == 0) {
            return m[nF][nC];
        } else {
            if (nF > -1){
                nC--;
                if(nC>=-1){
                    return m[nF][nC+1] + sumaMatriz(m,nF,nC);
                }else{
                    return sumaMatriz(m,nF-1,2);
                }
            }else return 0;
    } 
}
}
