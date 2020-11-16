import java.util.*;

public class PruebaAtletas {
    public static void main(String[] args) {
        Atleta a1 = new Atleta("Enrique",44,2,45,07);
        Atleta a2 = new Atleta("Anastasio",4,2,25,46);
        Atleta a3 = new Atleta("Lucas",55,1,00,07);
        Atleta a4 = new Atleta("Andrea",24,3,45,07);
        
        Atletas grupoAtletas = new Atletas();
        grupoAtletas.agregarAtleta(a1);
        grupoAtletas.agregarAtleta(a2);
        grupoAtletas.agregarAtleta(a3);
        grupoAtletas.agregarAtleta(a4);
        
        Iterator it = grupoAtletas.getDorsalAnterior(1200).iterator();
        while(it.hasNext()){
            System.out.println(""+it.next());
        }
        
        Iterator ot = grupoAtletas.getDorsalPosterior(9).iterator();
        while(it.hasNext()){
            System.out.println(" "+ot.next());
        }
    }
}
