package cliente;

public class Persona implements IPersona, Comparable<Persona>{
    private String mNombre;
    private String mDNI;
    private String mEmail;
    private String mTlf;

    public Persona(String nombre, String DNI, String email, String tlf) {
        this.mNombre = nombre;
        this.mDNI = DNI;
        this.mEmail = email;
        this.mTlf = tlf;
    }

    public String getNombre() {
        return mNombre;
    }

    public void setNombre(String nombre) {
        this.mNombre = nombre;
    }

    public String getDNI() {
        return mDNI;
    }

    public void setDNI(String DNI) {
        this.mDNI = DNI;
    }

    public String getEmail() {
        return mEmail;
    }

    public void setEmail(String email) {
        this.mEmail = email;
    }

    public String getTlf() {
        return mTlf;
    }

    public void setTlf(String tlf) {
        this.mTlf = tlf;
    }

    @Override
    public String toString() {
        return "Nombre: " + mNombre + ", con DNI " + mDNI 
                + ", Email: " + mEmail + " y teléfono " + mTlf;
    }

}

