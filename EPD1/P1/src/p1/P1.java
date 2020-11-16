
package p1;

import poo.io.*;

public class P1 {
    

    public static void main(String[] args) {
        int n1,n2,opcion,suma,resta,multiplicacion,division;
        System.out.println("Dame dos numeros enteros");
        n1= (int) IO.readNumber();
        n2= (int) IO.readNumber();
        do{
            System.out.println("Elige una opcion");
            opcion = (int) IO.readNumber();
            switch(opcion){
                    case 1: suma = sumar(n1,n2);
                            System.out.println("La suma es:" +suma);
                            break;
                    case 2: resta = restar(n1,n2);
                            System.out.println("La resta es:" +resta);
                            break;
                    case 3: multiplicacion = multiplicar(n1,n2);
                            System.out.println("La multiplicacion es:" +multiplicacion);
                            break;
                    case 4: division = dividir(n1,n2);
                            System.out.println("La division es:" +division);
                            break;
            }
        }while(opcion!=0);
    }
    
        private static int sumar(int x, int y){
            return (x + y);
        }
        private static int restar(int x, int y){
            return (x - y);
        }
        private static int multiplicar(int x, int y){
            return (x * y);
        }
        private static int dividir(int x, int y){
            return (x / y);
        }
    
}
