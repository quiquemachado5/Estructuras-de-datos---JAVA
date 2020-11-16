
public class EncriptadorDiferenciaComposicion implements IEncriptador{
    private int codigoDiferencia;
    
    private Encriptador encrip;
    
    public EncriptadorDiferenciaComposicion(int numero,String clave,int codigoDiferencia){
        encrip = new Encriptador(numero, clave);
    }

    

    @Override
    public void encriptar() {
        boolean encriptado = false;
        if(encrip.compruebaClave()== true && encriptado == false){
            this.encrip.numero -= this.codigoDiferencia;
            encriptado = true;
        }else{
            System.out.println("Error");
        }
    }

    @Override
    public void desencriptar() {
        boolean desencriptar = false;
        if(encrip.compruebaClave()== true && desencriptar == true){
            this.encrip.numero += this.codigoDiferencia;
            desencriptar = true;
        }else{
            System.out.println("Error");
        }
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString().concat("usando Algoritmo Diferencia Composición"));
        return sb.toString();
    }
    @Override
    public int getNumero() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean getEncriptado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
}
