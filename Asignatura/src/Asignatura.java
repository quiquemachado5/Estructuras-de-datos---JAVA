
import java.util.*;


public class Asignatura implements IAsignatura{
    
    private String asignatura;
    private int curso;
    
    public Asignatura(String asignatura,int curso){
        this.asignatura = asignatura;
        this.curso = curso;
    }

    @Override
    public String getNombreAsignatura() {
        return this.asignatura;
    }

    @Override
    public void setNombreAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public int getCurso() {
        return this.curso;
    }

    @Override
    public void setCurso(int curso) {
        this.curso = curso;
    }
    
    @Override
    public String toString(){
        return (""+this.getNombreAsignatura()+" .Año: "+this.getCurso());
    }
    
    @Override
    public int hashCode(){
        return this.asignatura.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        boolean res = false;
        Asignatura a = (Asignatura) obj;
        return this.getNombreAsignatura().equalsIgnoreCase(a.getNombreAsignatura()) && this.getCurso()==a.getCurso();
    }
   
}
