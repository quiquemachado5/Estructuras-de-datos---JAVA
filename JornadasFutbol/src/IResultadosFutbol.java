
public interface IResultadosFutbol {
    public String getNombreEquipoLocal();
    public void setNombreEquipoLocal(String nombreEquipoLocal);
    public String getNombreEquipoVisitante();
    public void setNombreEquipoVisitante(String nombreEquipoVisitante);
    public int getGolesEquipoLocal();
    public void setGolesEquipoLocal(int golesEquipoLocal);
    public int getGolesEquipoVisitante();
    public void setGolesEquipoVisitante(int golesEquipoVisitante);
    
    @Override
    public String toString();
    
}
