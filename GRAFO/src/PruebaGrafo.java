import java.io.*;

public class PruebaGrafo {
    public static void main(String [] arg) {
      String vectorLinea[] = null;
      File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;
      int cont=0;
      try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         archivo = new File ("C:\\Users\\QM5\\Desktop\\grafo.txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);

         // Lectura del fichero
         String linea;
         while((linea=br.readLine())!=null && cont<5 )
            System.out.println(linea);
            guardarLinea(linea);
      }
      catch(Exception e){
         e.printStackTrace();
      }finally{
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
        for (int i = 0; i < cont; i++) {
            System.out.println("\nLinea [%d]:"+i+" %s "+ vectorLinea[i]);
        }
   }
    public static void guardarLinea(String linea){
        
    }
}
