import java.util.*;


public class Atleta implements IAtleta,Comparable<IAtleta> {
    private String nombre;
    private int dorsal;
    private int hora;
    private int minutos;
    private int segundos;
    
    public Atleta(String nombre,int dorsal,int hora,int minutos,int segundos){
        this.nombre = nombre;
        this.dorsal = dorsal;
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int getDorsal() {
        return this.dorsal;
    }

    @Override
    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora)throws ExcepcionTiempo {
        if(this.hora<0 || this.hora>24){ 
            throw new ExcepcionTiempo();
        }else{
            this.hora = hora;
        }
    }

    public int getMinutos() {
        return minutos;
    }

   
    @Override
    public void setMinutos(int minutos) throws ExcepcionTiempo {
        if(this.minutos<0 || this.minutos>60){
            throw new ExcepcionTiempo();
        }else{
            this.minutos = minutos;
        }
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) throws ExcepcionTiempo {
        if(this.segundos<0 || this.segundos>60){
            throw new ExcepcionTiempo();
        }else{
            this.segundos = segundos;
        }
    }
    
    
    @Override
    public String toString(){
        return this.getNombre()+this.getDorsal()+this.getHora()+this.getMinutos()+this.getSegundos();
    }
    
   
    public boolean equals(Atleta obj){
        boolean res = false;
        Atleta atleta1 = obj ;
        if(this.compareTo(obj)==0){
            res = true;
        }else{
           res = false;
        }
        return res;
    }   
    @Override
    public int compareTo(IAtleta o1) {
        int res = 0;
        if(this.getDorsal()-o1.getDorsal()>0){
            res = 1;
        }else{
            if(this.getDorsal()-o1.getDorsal()<0){
                res = -1;
            }
        }
        return res;
    }
    
    
}