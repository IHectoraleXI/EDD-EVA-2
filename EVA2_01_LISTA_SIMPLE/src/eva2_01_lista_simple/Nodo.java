package eva2_01_lista_simple;

public class Nodo {

    private int valor;
    private Nodo siguiente;

    public Nodo() {
        this.siguiente = null;
        //Por default, un nuevo nodo va al final de la lista.
        //El final de la lista se indica con null.
    }

    public Nodo(int valor) {
        this.valor = valor;
        this.siguiente = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
}
