
public class PruebaNumeros {
    public static void main(String[] args) {
            Numero n1 = new Numero(2,5);
            Numero n2 = new Numero(21,77);
            Numero n3 = new Numero(34,3);
            
            Numeros numeros = new Numeros();
            numeros.agregar(n1);
            numeros.agregar(n2);
            numeros.agregar(n3);
            
            numeros.ordenar();
            
            numeros.imprimir();
    }
}
