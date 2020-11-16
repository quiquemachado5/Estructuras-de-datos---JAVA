import java.util.*;

public interface IAtletas {
    public void agregarAtleta(IAtleta atleta);
    public void eliminarAtleta(IAtleta atleta);
    public int getDorsalMayor();
    public int getDorsalMenor(); 
    public Set getDorsalAnterior(int dorsal);
    public Set getDorsalPosterior (int dorsal);
    public void imprimir();
}
