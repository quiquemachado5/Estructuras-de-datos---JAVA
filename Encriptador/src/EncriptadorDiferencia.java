
public class EncriptadorDiferencia extends Encriptador implements IEncriptador{
    private int codigoDiferencia;
    
    public EncriptadorDiferencia(int numero, String clave,int codigoDiferencia){
        super(numero,clave);
        this.codigoDiferencia = codigoDiferencia;
    }
    
    @Override
    public void encriptar(){
        boolean encriptado = false;
        if(compruebaClave()== true && encriptado == false){
            this.numero -= this.codigoDiferencia;
            encriptado = true;
        }else{
            System.out.println("Error");
        }
    }
    
    @Override
    public void desencriptar(){
        boolean desencriptar = false;
        if(compruebaClave()== true && desencriptar == true){
            this.numero += this.codigoDiferencia;
            desencriptar = true;
        }else{
            System.out.println("Error");
        }
    }
    
    
    
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString().concat("usando Algoritmo Diferencia"));
        return sb.toString();
    }
}
