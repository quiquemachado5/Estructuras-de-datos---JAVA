
public class Bombilla {

    private boolean encendida;

    public boolean isEncendida() {
        return encendida;
    }

    public void setEncendida(boolean encendida) {
        this.encendida = encendida;
    }

    public void encender() {
        this.encendida = true;
    }

    public void apagar() {
        this.encendida = false;
    }

    public void cambiar() {
        if (encendida) {
            this.encendida = false;
        } else {
            this.encendida = true;
        }
    }

    public void mostrar() {
        if (encendida ) {
            System.out.println("*");
        } else {
            System.out.println("·");
        }
    }
}
