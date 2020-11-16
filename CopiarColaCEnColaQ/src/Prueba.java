
public class Prueba {
    public static void main(String[] args) {
        int colaC[]={15,34,29,53,2};
        int tam = colaC.length;
        int colaQ[]=new int[tam];
        for (int i = 0; i < tam; i++) {
            colaQ[i]=colaC[i];
        }
        for (int i = 0; i < tam; i++) {
            System.out.println(colaQ[i]);
        }
    }
    
}
