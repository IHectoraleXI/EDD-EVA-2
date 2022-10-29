package eva2_5_stack;

public class MyStack {

    private Nodo inicio;
    private Nodo fin;
    private int cont;

    public MyStack() {
        this.inicio = null;
        this.fin = null;
        this.cont = 0;
    }

    public boolean listaVacia() { //Comprueba si la lista está vacía.
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public void imprimir() {
        if (inicio == null) {
            System.out.println("La lista está vacía.");
        } else {
            Nodo temp = inicio;
            while (temp != null) {
                System.out.print(temp.getValor() + " - ");
                temp = temp.getSiguiente();
            }
            System.out.println("");
        }
    }

    public int tamaLista() {
        return this.cont;
    }

    public int obtenValorEn(int pos) throws Exception {
        int cantNodos = tamaLista();
        int valor = 0;
        if (pos < 0) { //Posiciones negativas.
            throw new Exception("No puede insertarse un nodo en posición negativa.");
        } else if (pos >= cantNodos) { // Posiciones mayores a la cantidad de elementos.
            throw new Exception(pos + " no es una posición válida en la lista.");
        } else {
            Nodo temp = inicio;
            int cont = 0;
            while (cont < pos) {
                temp = temp.getSiguiente();
                cont++;
            }
            valor = temp.getValor();
        }
        return valor;
    }

    public void vaciarLista() {
        inicio = null;
        fin = null;
        cont = 0;
    }

    public void push(int valor) { //Agregar un nodo al final de la lista.
        Nodo nuevoNodo = new Nodo(valor);

        //Verificar si hay nodos en la lista.
        if (inicio == null) { //No hay nodos en la lista.
            inicio = nuevoNodo;
            fin = nuevoNodo;
        } else {
            fin.setSiguiente(nuevoNodo);
            fin = nuevoNodo;
        }
        cont++;
    }

    public void insertarEn(int valor, int pos) throws Exception { //Inserta un elemento en la lista en cierta posición.
        int cantNodos = tamaLista();
        if (pos < 0) { //Posiciones negativas.
            throw new Exception("No puede insertarse un nodo en posición negativa.");
        } else if (pos >= cantNodos) { // Posiciones mayores a la cantidad de elementos.
            throw new Exception(pos + " no es una posición válida en la lista.");
        } else {
            Nodo nuevoNodo = new Nodo(valor);
            if (pos == 0) { //Insertar al inicio de la lista.
                nuevoNodo.setSiguiente(inicio);
                inicio.setPrevio(nuevoNodo);
                inicio = nuevoNodo;
            } else {
                Nodo temp = inicio;
                int cont = 0;
                while (cont < pos) {
                    temp = temp.getSiguiente();
                    cont++;
                }
                nuevoNodo.setSiguiente(temp);
                nuevoNodo.setPrevio(temp.getPrevio());
                temp.getPrevio().setSiguiente(nuevoNodo);
                temp.setPrevio(nuevoNodo);
            }
            this.cont++;
        }
    }

    public void borrarEn(int pos) throws Exception {
        int cantNodos = tamaLista();
        if (pos < 0) { //Posiciones negativas.
            throw new Exception("No puede insertarse un nodo en posición negativa.");
        } else if (pos >= cantNodos) { // Posiciones mayores a la cantidad de elementos.
            throw new Exception(pos + " no es una posición válida en la lista.");
        } else if (cantNodos == 1) { //Si hay un único nodo en la lista.
            vaciarLista();
        } else if (pos == 0) { //Si hay más nodos en la lista y se borra el primer nodo.
            inicio = inicio.getSiguiente();
        } else { //Si se borra un nodo que no es el primero ni el último en la lista.
            Nodo temp = inicio;
            int cont = 0;
            while (cont < (pos - 1)) {
                temp = temp.getSiguiente();
                cont++;
            }
            Nodo objPrev = temp.getPrevio();
            Nodo objSig = temp.getSiguiente();
            objPrev.setSiguiente(objSig);
            if (pos == (cantNodos - 1)) {
                fin = temp;
            } else {
                objSig.setPrevio(objPrev);
            }
        }
        this.cont--;
    }

    public Integer peek() { //Solo lee el último nodo de la lista.
        if (listaVacia()) {
            return null;
        } else {
            return inicio.getValor();
        }
    }

    public Integer pop() throws Exception { //Lee y borra el elemento en la cima (último nodo).
        if (listaVacia()) {
            return null;
        } else {
            int valor = fin.getValor();
            borrarEn(tamaLista() - 1);
            return valor;
        }
    }
}
