package Material;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VentanaMateriales {
    
    private CentralMateriales materiales;
    
    public VentanaMateriales(CentralMateriales materiales){
        this.materiales = materiales;
    }
    public void mostrarMenuGestionMateriales() {
        Scanner s = new Scanner(System.in);
        int opc = -1;

        do {
            System.out.println("\n\n\n\tMenú Gestión Materiales:\n");
            System.out.println("\t1. Alta de tabla de surf");
            System.out.println("\t2. Baja de tabla de surf");
            System.out.println("\t3. Listado de tablas de surf");
            System.out.println("\t4. Alta de traje de neopreno");
            System.out.println("\t5. Baja de traje de neopreno");
            System.out.println("\t6. Listado de trajes de neopreno");
            System.out.println("\t---------------------");
            System.out.println("\t\t0. Salir");
            System.out.print("\n\n--> Introduzca una opción: ");
            opc = s.nextInt();
            while (opc < 0 || opc > 6) {
                System.out.print("--> Introduzca una opción valida: ");
                opc = s.nextInt();
                System.out.println("\n");
            }
            if (opc != 0) {
                realizarOpcionGestionMaterial(opc);
            }
        } while (opc != 0);
    }
    
    private void realizarOpcionGestionMaterial(int opc){
        if(opc==1){
            mostrarAltaTabla();
        }
        else if(opc==2){
            mostrarBajaTabla();
        }
        else if(opc==3){
            mostrarListadoTablas();
        }
        else if(opc==4){
            mostrarAltaTraje();
        }
        else if(opc==5){
            mostrarBajaTraje();
        }
        else if(opc==6){
            mostrarListadoTrajes();
        }
    }
    private void mostrarAltaTabla(){
        Scanner m = new Scanner(System.in);
        System.out.println("Introduzca la marca de la tabla: ");
        String marca = m.next();
        System.out.println("Introduzca el tipo de la tabla: ");
        String tipo = m.next();
        System.out.println("Introduzca el volumen [ 10 - 100 ]");
        int volumen = m.nextInt();
        System.out.println("Introduzca la talla");
        double talla = m.nextDouble();
        System.out.println("Introduzca el tipo de construcción: ");
        int construccion = 0;
        
        System.out.println("\t PARA TIPO DE POLIESTER. INSERTE 1.");
        System.out.println("\t PARA TIPO DE EPOXY. INSERTE 2.");
        System.out.println("\t PARA TIPO DE SOFTBOARD. INSERTE 3.");
        System.out.println("\t PARA TIPO DE HINCHABLE. INSERTE 4.");
        System.out.println("\t PARA TIPO DE INDETERMINADA. INSERTE 5.");
        construccion = m.nextInt();   
        if(construccion<1 || construccion>5){
            construccion = 5;
        }
        
        System.out.println("Introduzca el suplemento [ 0 - 1 ]");
        double suplemento = m.nextDouble();
        this.materiales.nuevaTabla(marca, tipo, volumen, talla, construccion, suplemento);
    }
    private void mostrarBajaTabla(){
        Scanner m = new Scanner(System.in);
        this.materiales.tablasToString();
        System.out.println("Introduzca el ID de la tabla que desee dar de baja:");
        int id = m.nextInt();
        TablaSurf t = this.materiales.getTabla(id);
        if(t != null){
            System.out.println("¿Seguro que quiere dar de baja la tabla: ");
            System.out.println(t.toString() + " ? ");
            
            System.out.println("Introduzca una S e intro para CONFIRMAR. Cualquier otra tecla para CANCELAR");
            String opc = m.next();
            if(opc.equalsIgnoreCase("s")){
                System.out.println("Realizando baja la tabla"+ t.toString());
                this.materiales.eliminaTabla(t);
                System.out.println("Baja de tabla de surf realizada correctamente");
            }else{
                System.out.println("Se ha cancelado la baja de la tabla de surf");
            }
        }else{
            System.out.println("Error.Esa tabla no se encuentra disponible");
        }
    }
    private void mostrarAltaTraje(){
        Scanner m = new Scanner(System.in);
        System.out.println("Introduzca la marca del traje: ");
        String marca = m.next();
        System.out.println("Introduzca la categoria del traje: ");
        String categoria = m.next();
        System.out.println("Introduzca la talla del traje: ");
        int talla = 0;
        try{
             talla = m.nextInt();
            
        }catch(InputMismatchException e){
            
        }
        
        System.out.println("Introduzca las mangas del traje [TRUE - FALSE]: ");
        String opcCadenaMangas = m.next();
        boolean mangasLargas;
        if(opcCadenaMangas.equalsIgnoreCase("s") && opcCadenaMangas.length()==1){
            mangasLargas =true;
        }else{
            mangasLargas =false;
        }
        
        System.out.println("Introduzca las piernas del traje [TRUE - FALSE]:");
        String opcCadenaPiernas = m.next();
        boolean piernasLargas;
        if(opcCadenaPiernas.equalsIgnoreCase("s") && opcCadenaPiernas.length()==1){
            piernasLargas = true;
        }else{
            piernasLargas = false;
        }
        System.out.println("Introduzca la cremallera del traje:  ");
        int cremallera = 0;
        do{
            System.out.println("\t PARA CREMALLERA DELANTERA. INSERTE 1.");
            System.out.println("\t PARA CREMALLERA TRASERA. INSERTE 2.");
            System.out.println("\t PARA SIN CREMALLERA. INSERTE 3.");
            cremallera = m.nextInt();   
        }while(cremallera<1 && cremallera>3);
        
        System.out.println("Introduzca el suplemento [0 - 1]: ");
        double suplemento = m.nextDouble();
        this.materiales.nuevoTraje(marca, categoria, talla, mangasLargas,piernasLargas, cremallera, suplemento);
    }
    private void mostrarBajaTraje(){
        Scanner m = new Scanner(System.in);
        this.materiales.trajesToString();
        System.out.println("Introduzca el ID del traje que desee dar de baja:");
        int id = m.nextInt();
        Neopreno n = this.materiales.getTraje(id);
        if(n != null){
            System.out.println("¿Seguro que quiere dar de baja el traje: ");
            System.out.println(n.toString() + " ? ");
            
            System.out.println("Introduzca una S e intro para CONFIRMAR. Cualquier otra tecla para CANCELAR");
            String opc = m.next();
            if(opc.equalsIgnoreCase("s")){
                System.out.println("Realizando baja del traje"+ n.toString());
                this.materiales.eliminaTraje(n);
                System.out.println("Baja del traje realizada correctamente");
            }else{
                System.out.println("Se ha cancelado la baja del traje");
            }
        }else{
            System.out.println("Error.Ese traje no se encuentra disponible"); 
        } 
    }
    private void mostrarListadoTablas(){
        System.out.println(this.materiales.tablasToString());
    }
    private void mostrarListadoTrajes(){
        System.out.println(this.materiales.trajesToString());
    }
            
}
