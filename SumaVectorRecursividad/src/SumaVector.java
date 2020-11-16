
public class SumaVector {

    public static void main(String[] args) {
        int v[] = {4, 10, 34, 4, 21, 19};
        System.out.println("Suma:" + suma(v, 5));
        //System.out.println("Mayor:" + mayorVector(v,0));
        int m[][]={{1,2,3},{4,5,6},{7,8,9}};
        int n[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Suma: "+sumaMatrices(m,n,3,3));

    }

    public static int suma(int v[], int n) {
        int suma = 0;
        if (n >= 0) {
            suma = v[n] + suma(v, n - 1);
        } else {
            suma = 0;
        }
        return suma;
    }

    /*public static int mayorVector(int v[], int n) {
        int mayor1 = 0;
        int mayor2 = 0;
        int r =  n%2;
        if(n=0 && n<r){
            if(v[n]>v[n+1]){
                mayor1 = v[n];
                mayorVector(v,n+1);
            }
            else{
                mayorVector(v,n+1);
            }
        }
        else if(n>=v.length%2 && n<=v.length){
            if(v[n]>v[n+1]){
                mayor2 = v[n];
                mayorVector(v,n+1);
            }
            else{
                mayorVector(v,n+1);
            }
        }
        return mayor1;
    }*/
   /*public static int sumaMatrices(int m[][],int n[][],int i,int j){
        int suma=0;
        if(m!=n){
            return suma;
        }else{
            suma
        }
        return suma;
    }*/
    public static int conteoValor(int a[],int n,int x){
        int conteo=0;
        
    }
}
