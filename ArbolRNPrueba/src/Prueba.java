
public class Prueba {

    public static void main(String[] args) throws Exception {
        Arbol a = new Arbol(); //Creo el objeto Árbol a
        //Insertamos los 10 "procesos" (tiempo)
        a.insertar(13);
        a.insertar(8);
        a.insertar(11);
        a.insertar(6);
        a.insertar(1);
        a.insertar(15);
        a.insertar(17);
        a.insertar(25);
        a.insertar(22);
        a.insertar(27);
        int numProcesosEliminados = 0;
        System.out.println("\tBIENVENIDO A CFS con 10 PROCESOS"); 
        int cont = a.sizeSubArbolIzquierdo(); //El contador es el núm. total de elementos del subárbol izquierdo
        while (cont > 1) { //mientras que sea > 1
            if((cont%2)==0){ //Si es par el contador, "hago como que se ha detenido un proceso y lo reinserto"
                System.out.println("\n¡¡Proceso "+a.findMin()+" abortado involuntariamente!!");
                a.eliminar(a.findMin()); //Elimino al menor que hay en ese momento
                System.out.println("\nProcedemos a reinsertarlo con tiempo: "+(cont+15));
                System.out.println("\n");
                a.insertar((cont+15)); //Lo reinserto con un "tiempo" de la suma del contador + 15 (por poner un número)
                
            }
            //Aquí llegarían los procesos que no entran en el if anterior
            System.out.println("\nEl proceso con menor tiempo de ejecucción es: " + a.findMin()); //Digo cual es el proceso mínimo
            System.out.println("\n.....Esperamos a que se ejecute....."); 
            a.eliminar(a.findMin()); //Lo elimino
            System.out.println("\n----> Proceso eliminado");
            System.out.println("\n");
            cont--; //Decremento el contador
            numProcesosEliminados++;
        }
        System.out.println("\nSe han eliminado los "+numProcesosEliminados+" procesos con menos tiempo de ejecucción");
    }
}
