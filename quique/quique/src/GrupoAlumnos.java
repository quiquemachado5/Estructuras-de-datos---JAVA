import java.util.*;


public class GrupoAlumnos implements IGrupoAlumnos{

    //No entiendo porque hacemos esto si dsps no sirve paranada cuando lo pruebo
    //en la clase PruebaAlumnos xd
    
    private Collection<IAlumno> c;
    
    public GrupoAlumnos(){
        c = new ArrayList<>();
    }
    public boolean obtenerGrupoPrueba(){
        boolean agregados = false;
        
        //Este metodo no lo entiendo porq el enunciado está mal explicado, no le eches cuenta
        return agregados;
    }
    @Override
    public Collection getNombre() {
        return this.getC();
    }

    public boolean agregar(IAlumno alumno) {
        boolean agregado = false;
        if(getC().contains(alumno)){
            agregado = false; 
        }else{
            getC().add(alumno);
            agregado = true;
        }
        return agregado;
    }
    
    public void imprimir(){
        Iterator it = getC().iterator();
        while(it.hasNext()){
            it.next();
        }  
    }

    /*@Override
    public void eliminarMayoresDe() {
        Iterator it = c.iterator();
        while(it.hasNext()){
            if(){
                c.remove(it);
                it.next();
            }
            it.next();
        }
    }*/

    @Override
    public void eliminarMayoresDe() {
        /*Este método me pide que elimine a todos los alumnos mayores de 30 años de un grupo 
        ,pero no entiendo como coño le paso la edad si x parametros me dice el enunciado que no.. entnces
         no tengo ni idea...he pensado en hacerlo así,pero de condicion del if iria la edad q nose d dnd sacarla
        
        Iterator it = c.iterator();
        while(it.hasNext()){
            if(){
                c.remove(it);
                it.next();
            }
            it.next();
        }*/
    }

    @Override
    public boolean eliminar(IAlumno alumno) {
        boolean eliminado = false;
        Iterator it = getC().iterator();
        while(it.hasNext()){
            if(getC().contains(alumno)){
                getC().remove(alumno);
                it.next();
                eliminado = true;
            }else{
                it.next();
                eliminado = false;
            }
        }
        return eliminado;
    }

    /**
     * @return the c
     */
    public Collection<IAlumno> getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(Collection<IAlumno> c) {
        this.c = c;
    }
    
    

}
    

