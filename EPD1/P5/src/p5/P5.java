
package p5;
import poo.io.*;
public class P5 {
    public static void main(String[] args) {
        int dia,mes,anyo;
        System.out.println("Introduce un dia"); 
        dia = (int)IO.readNumber();
        System.out.println("Introduce un mes"); 
        mes = (int)IO.readNumber();
        System.out.println("Introduce un año"); 
        anyo = (int)IO.readNumber();
        
        System.out.print("Ha escogido el dia"+dia);
        switch(mes){
                case 1:System.out.println("de Enero");
                      break;
                case 2:System.out.println("de Febrero");
                      break;
                case 3:System.out.println("de Marzo");
                      break;
                case 4:System.out.println("de Abril");
                      break;
                case 5:System.out.println("de Mayo");
                      break;
                case 6:System.out.println("de Junio");
                      break;
                case 7:System.out.println("de Julio");
                      break;
                case 8:System.out.println("de Agosto");
                      break;
                case 9:System.out.println("de Septiembre");
                      break;
                case 10:System.out.println("de Octubre");
                      break;
                case 11:System.out.println("de Noviembre");
                      break;
                case 12:System.out.println("de Diciembre");
                      break;
                       
        
    } 
        System.out.print("del"+anyo);
    }
}
