import java.util.*;

public interface IEmpleados {
    public boolean agregarEmpleado(IEmpleado empleado);
    public Collection getPrejubilables();
    public Collection getCasados();
    public Collection getFamiliasNumerosas();
    public void imprimir();
}
