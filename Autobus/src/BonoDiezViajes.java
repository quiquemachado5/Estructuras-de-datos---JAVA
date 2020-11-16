public class BonoDiezViajes implements IBonoBus{
    private int ViajesRestantes;
    private boolean validez;
    
    public BonoDiezViajes(){
        this.ViajesRestantes = 10;
        this.validez = true;
    }

    public int getViajesRestantes() {
        return ViajesRestantes;
    }

    private void setViajesRestantes(int ViajesRestantes) {
        this.ViajesRestantes = ViajesRestantes;
    }

    @Override
    public boolean getPicarViaje() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPicarViaje(int linea, int dia, int mes, int año, int hora, int minutos) {
    
        for(int i=0;i<10;i++){
            this.ViajesRestantes = ViajesRestantes - 1;   
            if(this.ViajesRestantes>0){
                this.validez = true;  
            }else{
                this.validez = false;
            }
        }
    }
    
    
}
