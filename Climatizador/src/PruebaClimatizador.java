
public class PruebaClimatizador {
    public static void main(String[] args) {
        Climatizador c1 = new Climatizador();
        System.out.println("El climatizador está a una temperatura: "+c1.getTemperaturaActual()+" grados");
        System.out.println("El climatizador le gustaría estar a :"+c1.getTemperaturaDeseada()+" grados");
        System.out.println("El climatizador está: "+c1.isEncendido());
        
        if(c1.isEncendido() == false){
            c1.setTemperaturaActual(28);
            c1.setTemperaturaDeseada(33);
            System.out.println("El climatizador está a una temperatura: "+c1.getTemperaturaActual()+" grados");
            System.out.println("El climatizador le gustaría estar a :"+c1.getTemperaturaDeseada()+" grados");
        }
        else{
            System.out.println("El climatizador tiene que estar apagado para realizar las modificaciones en las temperaturas");
            c1.encender();
        }
        
        
    }
}
