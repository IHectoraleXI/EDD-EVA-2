package eva2_6_arbol_binario;

public class ArbolBinario {

    private Nodo root;

    public ArbolBinario() {
        this.root = null;
    }

    public void agregar(int valor){ 
        if(root == null) {
            root = new Nodo(valor);
        }else {
            agregarRecur(valor, root);
        }
    }

    //Método recursivo "agregar" necesita 2 parametros: valor y nodo actual
    private void agregarRecur(int valor, Nodo nodoActual) {
        Nodo nuevo = new Nodo(valor);
        if (valor < nodoActual.getValor()) {
            if (nodoActual.getIzquierdo() == null) {
                nodoActual.setIzquierdo(nuevo);
            } else {
                agregarRecur(valor, nodoActual.getIzquierdo());
            }
        } else if (valor > nodoActual.getValor()) {
            if (nodoActual.getDerecho() == null) {
                nodoActual.setDerecho(nuevo);
            } else {
                agregarRecur(valor, nodoActual.getDerecho());
            }
        } else {
            System.out.println("ELEMENTO REPETIDO");
        }
    }

    public void inOrder() {
        inOrderRecu(root);
        System.out.println("");
    }

    private void inOrderRecu(Nodo nodo) {
        if (nodo != null) {
            inOrderRecu(nodo.getIzquierdo());
            System.out.print(nodo.getValor() + " - ");
            inOrderRecu(nodo.getDerecho());
        }
    }

    public void preOrder() {
        preOrderRecu(root);
        System.out.println("");
    }

    private void preOrderRecu(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.getValor() + " - ");
            preOrderRecu(nodo.getIzquierdo());
            preOrderRecu(nodo.getDerecho());
        }
    }
    
    public void posOrder() {
        preOrderRecu(root);
        System.out.println("");
    }

    private void posOrderRecu(Nodo nodo) {
        if (nodo != null) {
            posOrderRecu(nodo.getIzquierdo());
            posOrderRecu(nodo.getDerecho());
            System.out.print(nodo.getValor() + " - ");
        }
    }
}
