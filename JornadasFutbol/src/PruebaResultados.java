
import java.util.*;

public class PruebaResultados {
    public static void main(String[] args) {
        ResultadosFutbol r1 = new ResultadosFutbol("Sevilla FC",4,"Betis",2);
        ResultadosFutbol r2 = new ResultadosFutbol("Madrid CF",3,"Valencia CF",2);
        ResultadosFutbol r3 = new ResultadosFutbol("Villareal",0,"Calavera CF",2);
        ResultadosFutbol r4 = new ResultadosFutbol("FC Barcelona ",1,"Chelsea",1);
        
        
        DatosJornada datosJornada = new DatosJornada();
        
        datosJornada.agregarPartido(r1);
        datosJornada.agregarPartido(r2);
        datosJornada.agregarPartido(r3);
        datosJornada.agregarPartido(r4);
        
        datosJornada.imprimir();
        
        datosJornada.eliminarPartido(r4);
        
        datosJornada.imprimir();
        
        datosJornada.resultadosJornada();
                
    }
}
