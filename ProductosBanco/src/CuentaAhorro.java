
public class CuentaAhorro extends Cuenta{
    private double interes;

    public CuentaAhorro(String titular, String numeroCuenta, double saldo,double interes) {
        super(titular, numeroCuenta, saldo);
        this.interes = 2;
    }
    
    public double getInteres() {
        return interes;
    }
    
    public void setInteres(double interes) {
        this.interes = interes;
    }
   
    @Override
    public String toString() {
       StringBuilder cadenaSalida = new StringBuilder();
       cadenaSalida.append(this.getDescripcionTipoCuenta());
       cadenaSalida.append(" ");
       cadenaSalida.append("Titular: ");
       cadenaSalida.append(this.getTitular());
       cadenaSalida.append("\n");
       cadenaSalida.append("Numero de cuenta:");
       cadenaSalida.append(this.getNumeroCuenta());
       cadenaSalida.append("\n");
       cadenaSalida.append("Saldo: ");
       cadenaSalida.append(this.getSaldo());
       cadenaSalida.append("\n");
       cadenaSalida.append("Interes: ");
       cadenaSalida.append(this.getInteres());
       return cadenaSalida.toString();

   }

  
    
    
    
}
