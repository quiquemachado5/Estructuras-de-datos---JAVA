
package javaapplication41;
public class JavaApplication41 {
    public static void main(String[] args) {
        int v[]={1,2,3,4,3,6};
        int n=0;
        int m[][]={{1,4,3},{4,5,6},{7,8,9}};
        int x=3;
        sumar s = new sumar();
        System.out.println("Total: "+s.suma(v, n));
        System.out.println("Total: "+s.cuenta(v, x,n));
        System.out.println("Total: "+s.sumaMatriz(m,2,2));
    }
 
}
