
public class ResultadosFutbol implements IResultadosFutbol {
    private String nombreEquipoLocal;
    private String nombreEquipoVisitante;
    private int golesEquipoLocal;
    private int golesEquipoVisitante;
    
    public ResultadosFutbol(String nombreEquipoLocal,int golesEquipoLocal,String nombreEquipoVisitante,int golesEquipoVisitante){
        this.nombreEquipoLocal = nombreEquipoLocal;
        this.golesEquipoLocal = golesEquipoLocal;
        this.nombreEquipoVisitante = nombreEquipoVisitante;
        this.golesEquipoVisitante = golesEquipoVisitante;
    }
    
    @Override
    public String getNombreEquipoLocal() {
        return this.nombreEquipoLocal;
    }

    @Override
    public void setNombreEquipoLocal(String nombreEquipoLocal) {
        this.nombreEquipoLocal = nombreEquipoLocal;
    }

    @Override
    public String getNombreEquipoVisitante() {
        return this.nombreEquipoVisitante;
    }

    @Override
    public void setNombreEquipoVisitante(String nombreEquipoVisitante) {
        this.nombreEquipoVisitante = nombreEquipoVisitante;
    }

    @Override
    public int getGolesEquipoLocal() {
        return this.golesEquipoLocal;
    }

    @Override
    public void setGolesEquipoLocal(int golesEquipoLocal) {
        this.golesEquipoLocal=golesEquipoLocal;
    }

    @Override
    public int getGolesEquipoVisitante() {
        return this.golesEquipoVisitante;
    }

    @Override
    public void setGolesEquipoVisitante(int golesEquipoVisitante) {
        this.golesEquipoVisitante = golesEquipoVisitante;
    }
    
    @Override
    public String toString(){
       return this.nombreEquipoLocal+" "+this.golesEquipoLocal+"  -  "+this.nombreEquipoVisitante+" "+this.golesEquipoVisitante; 
    }
}