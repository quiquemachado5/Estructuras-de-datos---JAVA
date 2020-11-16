

package ej3;

import poo.io.*;

public class EJ3 {

    public static void main(String[] args) {
        int n,nu;
        n = new java.util.Random().nextInt(100)+1;
        System.out.println("\nADIVINA EL NUMERO ALEATORIO");
        System.out.println("Tienes infinitos intentos");
        int i=0;
        while(i<3){
            System.out.println("Escriba el numero que cree que es");
            nu = (int) IO.readNumber();
            if(nu!=n){
                System.out.println("Has fallado!!");
                if(n<nu){
                    System.out.println("El numero a adivinar es más pequeño que el tuyo");
                }
                else if(n>nu){
                    System.out.println("El numero a adivinar es más grande que el tuyo");
                }
            }
            else{
                System.out.println("Has acertado!!");
            }
            i++;
        }
    }
}
       
        
    
    
