
package colaejemplo;

import java.util.Scanner;

public class ColaEjemplo {

    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int num=0,tam=10,top=0;
        int pila[] = new int[tam];
        do{
            System.out.println("Introduce un número: ");
            num = i.nextInt();
            pila[top]=num;
            top++;
        }while(num!=0);
        
        System.out.println(pila[top]);
        
    
}
}
