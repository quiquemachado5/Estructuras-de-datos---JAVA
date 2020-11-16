
public class Nodo<Object extends Comparable<Object>> {

    private Object element;
    private Nodo padre;
    public Nodo izq;
    public Nodo der;
    private int factorEquilibrio;

    public Nodo() {
        
    }
    
    public Nodo(Object element) {
        this.element = element;
    }

    public Nodo(Object element, Nodo padre, Nodo izq, Nodo der) {
        this.element = element;
        this.padre = padre;
        this.izq = izq;
        this.der = der;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public void setPadre(Nodo padre) {
        this.padre = padre;
    }

    public Nodo getPadre() {
        return this.padre;
    }

    public Nodo getIzq() {
        return izq;
    }

    public void setIzq(Nodo izq) {
        this.izq = izq;
    }

    public Nodo getDer() {
        return der;
    }

    public void setDer(Nodo der) {
        this.der = der;
    }

    public int getFactorEquilibrio() {
        return factorEquilibrio;
    }

    public void setFactorEquilibrio(int factorEquilibrio) {
        this.factorEquilibrio = factorEquilibrio;
    }
    
    public int ajustarFE(Nodo nodo) {

        int pHijosD = profundidadHijos(nodo.getDer());
        if (pHijosD >= 0 && pHijosD < 999) {
            pHijosD++;// esto se debe a que al partir el metodo en sus hijos no cuenta el nivel de profundiad de esos hijos, por lo que le sumamos uno
        }
        else{
            pHijosD=0; // a no ser que no tenga hijos por lo que no se le suma
        }
        int pHijosI = profundidadHijos(nodo.getIzq());
        if (pHijosI >= 0 && pHijosI < 999) {
            pHijosI++; 
        }
        else{
            pHijosI=0;
        }
        int pHijos = pHijosD - pHijosI;
        return pHijos;
    }

    public int profundidadHijos(Nodo nodo) {
        int pi = 0;
        int pd = 0;

        if (nodo == null) {
            return 999; // esto es una señal de que si no tiene hijos, en el metodo anterior pondra un 0
        } else {
            if (nodo.getDer() != null) {
                pd = 1 + profundidadHijos(nodo.getDer());
            }
            if (nodo.getIzq() != null) {
                pi = 1 + profundidadHijos(nodo.getIzq());
            }

            return Math.max(pd, pi);
        }

    }
    
}

