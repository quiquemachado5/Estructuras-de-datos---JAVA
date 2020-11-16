
public interface ICuenta {
    public double getSaldo();
    public void setSaldo(double saldo);
    
    public double getDisponible();
    public void setDisponible(double disponible);
    
    public String getNumeroCuenta();
    public void setNumeroCuenta(String numeroCuenta);
    
    public String getTitular();
    public void setTiular(String titular);
    
    public double getReintegro();
    public void  setReintegro(double reintegro);
    
    public double getDeposito(); 
    public void setDeposito(double deposito);
    
    public String getDescripcionTipoCuenta();
    public void setDescripcionTipoCuenta(String descripcionTipoCuenta);
    
}
