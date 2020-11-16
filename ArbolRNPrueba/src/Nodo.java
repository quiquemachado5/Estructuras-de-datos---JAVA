public class Nodo {
    public int dato;
    public Nodo izq;
    public Nodo der;
    public Nodo padre;
    public char color = 'R'; //N para negro y R para rojo

    public Nodo(int data) { //Constructor para nodos internos
        dato = data;
        color = 'N';
    }

    public Nodo(Nodo pa, int data) { //Constructor para nodos hoja
        dato = data;
        padre = pa;
        izq = der = null;
        color = 'R';
    }

    public double getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
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

    public Nodo getPadre() {
        return padre;
    }

    public void setPadre(Nodo padre) {
        this.padre = padre;
    }

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }
    
}
