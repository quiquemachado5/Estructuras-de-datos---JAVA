package juegojosephus;

import java.util.Scanner;

public class JuegoJosephus {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        int n = 0, k = 0, opcion = 0; //Declaro e iniciliazo las variables
        System.out.println("Introduce un número de reclusos:    "); //Le pregunto al usuario por n y k y lo almaceno
        n = s.nextInt();
        System.out.println("Introduce el paso (k)");
        k = s.nextInt();
        System.out.println("\nElige LINKEDQUEUE[1] O ARRAYQUEUE[2]"); //Le pregunto por la opción para resolver el problema
        opcion = s.nextInt();
        if (opcion == 1 || opcion == 2) { //Si la opción es 1 o 2, entra dentro 
            if (opcion == 1) {
                LinkedQueue cola = new LinkedQueue(); //Creo el objeto cola de tipo LINKEDQUEUE
                for (int i = 1; i <= n; i++) { //Utilizo este for para almacenar en la cola los elementos desde 1 hasta n
                    cola.enqueue(i);
                }
                System.out.println("La posición segura es: " + cola.josephus(n, k)); //Imprimo el valor que me devuelve el método josephus con la posición segura
            } else {
                ArrayQueue cola = new ArrayQueue(); //Creo el objeto cola de tipo ARRAY
                for (int i = 1; i <= n; i++) { //Utilizo este for para almacenar en la cola los elementos desde 1 hasta n
                    cola.enqueue(i);
                }
                System.out.println("La posición segura es: " + cola.josephus(n, k)); //Imprimo el valor que me devuelve el método josephus con la posición segura
            }
        } else {
            System.out.println("\n Opción no válida"); //Opción no valida y fin del programa
        }
    }
}
