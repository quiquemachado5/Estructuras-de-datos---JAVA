import java.util.*;

public interface IAtletas {
    public void agregarAtleta(IAtleta atleta);
    public void eliminarAtleta(IAtleta atleta);
    //public int getDorsalMayor();
    //public int getDorsalMenor(); 
    public Collection getDorsalAnterior(int dorsal);
    public Collection getDorsalPosterior (int dorsal);//
}
