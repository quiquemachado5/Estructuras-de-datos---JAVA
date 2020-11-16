public class Cuenta implements ICuenta {
    public double saldo;
    private double disponible;
    private String numeroCuenta;
    private String titular;
    private double reintegro;
    private double deposito;
    private String descripcionTipoCuenta;

    public Cuenta(String titular,String numeroCuenta,double saldo){
        this.titular = "Enrique Machado Domínguez";
        this.numeroCuenta = "345678WQISLP";
        this.saldo = 100;
    }
    @Override
    public double getSaldo() {
        return saldo;
    }

    @Override
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public double getDisponible() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setDisponible(double disponible) {
        
    }

    @Override
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    @Override
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public String getTitular() {
        return titular;
    }

    @Override
    public void setTiular(String titular) {
        this.titular = titular;
    }

    @Override
    public double getReintegro() {
        return reintegro;
    }

    @Override
    public void setReintegro(double reintegro) {
        if(saldo>0){
            this.saldo = saldo - this.reintegro;
        }else{
            System.out.println("No tiene saldo disponible");
        }
    }

    @Override
    public double getDeposito() {
        return deposito;
    }

    @Override
    public void setDeposito(double deposito) {
        this.saldo = this.deposito + saldo;
    }

    @Override
    public String getDescripcionTipoCuenta() {
        return descripcionTipoCuenta;
    }

    @Override
    public void setDescripcionTipoCuenta (String descripcionTipoCuenta) {
        if(descripcionTipoCuenta == "Cuenta de Ahorro"){
            this.descripcionTipoCuenta = "Cuenta de Ahorro";
        }else{
            this.descripcionTipoCuenta = "Cuenta de Crédito";
        }
    }
    
    
    
}