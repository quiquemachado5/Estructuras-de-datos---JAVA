
import java.util.*;

public class Empleados implements IEmpleados {

    Set<IEmpleado> empleados;

    public Empleados() {
        empleados = new HashSet<>();
    }

    @Override
    public boolean agregarEmpleado(IEmpleado empleado) {
        boolean agregado = false;
        empleados.add(empleado);
        return agregado;
    }

    @Override
    public Collection getPrejubilables() {
        Set<IEmpleado> prejubilables = new HashSet<>();
        Iterator<IEmpleado> itEmpleados = empleados.iterator();
        while (itEmpleados.hasNext()) {
            IEmpleado e = itEmpleados.next();
            if (e.getEdad() > 60) {
                e.setSueldo(e.getSueldo() + (0.03F*e.getSueldo()));
                prejubilables.add(e);
            }

        }
        return prejubilables;
    }

    @Override
    public Collection getCasados() {
        Iterator<IEmpleado> itEmpleados = empleados.iterator();
        Set<IEmpleado> casados = new HashSet<>();

        while (itEmpleados.hasNext()) {
            IEmpleado e = itEmpleados.next();
            if (e.isCasado() == true) {
                casados.add(e);
            }

        }
        return casados;
    }

    @Override
    public Collection getFamiliasNumerosas() {
        Iterator<IEmpleado> itEmpleados = empleados.iterator();
        Set<IEmpleado> familiasNumerosas = new HashSet<>();

        while (itEmpleados.hasNext()) {
            IEmpleado e = itEmpleados.next();
            if (e.getnHijos() > 2) {
                familiasNumerosas.add(e);
            }

        }
        return familiasNumerosas;

    }

    @Override
    public void imprimir() {
        Iterator it = empleados.iterator();
        while (it.hasNext()) {
            System.out.println("Empleado: " + it.next());
        }
    }

}
