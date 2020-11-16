
public class Cola {
    int tam = 5;
    int colaC[]={15,34,29,53,2};
    public static void copia (int colaC[]){
        int colaQ[]=new int[5];
        for (int i = 0; i < colaC.length; i++) {
            colaQ[i]=colaC[i];
        }
        for (int i = 0; i < colaQ.length; i++) {
            System.out.println(colaQ[i]);
        }
    }
}
