
public class CuentaCredito extends Cuenta {
    public final double LIMITECREDITO = 2000.0;

    public CuentaCredito(String titular, String numeroCuenta, double saldo) {
        super(titular, numeroCuenta, saldo);
    }
    
    @Override
    public double getDisponible() {
        return saldo;
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
       cadenaSalida.append("Limite credito: ");
       cadenaSalida.append(this.LIMITECREDITO);
       return cadenaSalida.toString();
    }
}
