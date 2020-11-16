
public class PruebaModeloCoche {
    public static void main(String[] args) {
        ModeloCoche coche1 = new ModeloCoche("Kaskhai","Nissan",2010,13000,56);
        ModeloCoche coche2 = new ModeloCoche("Cooper","Mercedes",2008,25000,90);
        ModeloCoche coche3 = new ModeloCoche("X4","BMW",2019,5000,200);
        
        ModelosCoche modelo1 = new ModelosCoche();
        modelo1.agregar(coche1);
        modelo1.agregar(coche2);
        modelo1.agregar(coche3);
        
        modelo1.imprimir();
    }
}
