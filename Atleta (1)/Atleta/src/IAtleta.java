import java.util.*;

public interface IAtleta {
    public String getNombre();
    public void setNombre(String nombre);
    public int getDorsal();
    public void setDorsal(int dorsal);
    public int getHora();
    public void setHora(int hora)throws ExcepcionTiempo;
    public int getMinutos();
    public void setMinutos(int minutos)throws ExcepcionTiempo;
    public int getSegundos();
    public void setSegundos(int segundos)throws ExcepcionTiempo;
    
}
