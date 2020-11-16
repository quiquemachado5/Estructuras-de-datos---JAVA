
public class PruebaPersona {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        System.out.println("Los valores por defecto de la persona son");
        System.out.println("Nombre: " +p1.getNombre()+ "Apellidos:" +p1.getApellido1()+".."+p1.getApellido2());
        
        
        if(p1.isInterruptor()){
            System.out.println("No se pueden acceder a los datos porque el interruptor está apagado");
        }
        else{
            p1.setNombre("Enrique");
            p1.setApellido1("Machado");
            p1.setApellido2("Dominguez");
            p1.setEdad(19);
            p1.setEstatura(2);
            p1.setPeso(82);
            p1.setEstado(1);
        }
        
        System.out.println("Nombre: "+p1.getNombre());
        System.out.println("Primer apellido: "+p1.getApellido1());
        System.out.println("Segundo apellido: "+p1.getApellido2());
        System.out.println("La edad es: "+p1.getEdad());
        System.out.println("La estatura es: "+p1.getEstatura());
        System.out.println("El peso es: "+p1.getPeso());
        System.out.println("El estado civil es: "+p1.cadenaEstado());
    }
    
    
}
