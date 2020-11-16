
import java.io.*;

public class main {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String sCadena, s = null; //Declaro e inicializo las variables cadena que usaré
        char[] saa = null; //Declaro e inicializo el vector de char donde guardaré cada letra o símbolo 
        BufferedReader bf = new BufferedReader(new FileReader("src/grafo.txt")); //Creo un objeto bf para abrir el fichero donde estan los datos
        System.out.println("\nARCHIVO A LEER: ");
        System.out.println("\n"); //Salto de línea
        while ((sCadena = bf.readLine()) != null) { // sigue leyendo mientras haya lineas disponibles
            System.out.println(sCadena);
            s += sCadena;
        }
        bf.close(); //Cierro el fichero una vez leído y almacenado
        for (int i = 0; i < s.length(); i++) {
            saa = s.toCharArray(); //Recorro mi cadena s para ir metiendo cada carácter en un char de carácteres
        }
        int a=0,b=0,c=0,d=0,e=0; //Variables donde almacenaré el valor de cada letra
        for (int i = 0; i < saa.length; i++) { //Recorro el vector y voy convirtiendo las letras en números
            if(saa[i]=='A'){
                a = 0;
            }else if(saa[i]=='B'){
                b = 1;
            }else if(saa[i]=='C'){
                c = 2;
            }else if(saa[i]=='D'){
                d = 3;
            }else if(saa[i]=='E'){
                e = 4;
            }
        }//He hecho esto de pasar String a int ya que mi constructor de Edge, solo admite int

        Edge[] edges = {
            new Edge(a, b, 6), new Edge(a, d, 1), new Edge(b, a, 6),
            new Edge(b, d, 2), new Edge(b, e, 2), new Edge(b, c, 5),
            new Edge(c, b, 5), new Edge(c, e, 5), new Edge(d, a, 1),
            new Edge(d, b, 2), new Edge(d, e, 1), new Edge(e, d, 1),
            new Edge(e, b, 2), new Edge(e, c, 5)
        };
        CaminoMinimo camino = new CaminoMinimo(edges);
        camino.calculateShortestDistances();
        camino.printResult(); //Imprimo el resultado
    }
}
