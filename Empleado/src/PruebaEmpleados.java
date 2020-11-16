import java.util.*;

public class PruebaEmpleados {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Enrique","29502554V",19,false,0,500);
        Empleado empleado2 = new Empleado("Ana","29899765Q",45,true,1,1500);
        Empleado empleado3 = new Empleado("Lucía","12345678L",62,true,3,3000);
        Empleado empleado4 = new Empleado("Sebastián","29349431J",33,true,0,2000);
        
        Empleados grupoEmpleados = new Empleados();
        grupoEmpleados.agregarEmpleado(empleado1);
        grupoEmpleados.agregarEmpleado(empleado2);
        grupoEmpleados.agregarEmpleado(empleado3);
        grupoEmpleados.agregarEmpleado(empleado4);
        
        grupoEmpleados.imprimir();
        
        Iterator itCasados = grupoEmpleados.getCasados().iterator();
        System.out.println("Casados: ");
        while(itCasados.hasNext()){
            System.out.println(""+itCasados.next());
        }
        
        Iterator itFamiliaNumerosa = grupoEmpleados.getFamiliasNumerosas().iterator();
        System.out.println("Familias numerosas: ");
        while(itFamiliaNumerosa.hasNext()){
            System.out.println(""+itFamiliaNumerosa.next());
            
        }
        
        Iterator itPrejubilables = grupoEmpleados.getPrejubilables().iterator();
        System.out.println("Prejubilables: ");
        while(itPrejubilables.hasNext()){
            System.out.println(""+itPrejubilables.next());
        }
        
        
    }
}
