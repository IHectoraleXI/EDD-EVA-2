package eva2_01_lista_simple;

public class Lista {

    private Nodo inicio;
    private Nodo fin;
    private int cont;

    //Por default, la lista esta vacía.
    public Lista() {
        this.inicio = null; //No hay nodos en la lista.
        this.fin = null;
        cont = 0;
    }

    public void agregar(int valor) { //Agregar un nodo al final de la lista.
        Nodo nuevoNodo = new Nodo(valor);

        //Verificar si hay nodos en la lista.
        if (inicio == null) { //No hay nodos en la lista.
            inicio = nuevoNodo;
            fin = nuevoNodo;
        } else { //Hay nodos en la lista.
            //Se mueve por la lista usando un nodo temporal hasta el final.
            /*Nodo temp = inicio;
            while (temp.getSiguiente() != null) {
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(nuevoNodo);*/
            fin.setSiguiente(nuevoNodo);
            fin = nuevoNodo;
        }
        cont++;
    }

    public boolean listaVacia() { //Comprueba si la lista está vacía.
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public void imprimir() { //Imprime
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

    public int tamaLista() { //Regresa el tamaño de la lista.
        /*int cont = 0;
        Nodo temp = inicio;
        while (temp != null) {
            cont++;
            temp = temp.getSiguiente();
        }*/
        return this.cont;
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
                inicio = nuevoNodo;
            } else {
                Nodo temp = inicio;
                int cont = 0;
                while (cont < (pos - 1)) {
                    temp = temp.getSiguiente();
                    cont++;
                }
                nuevoNodo.setSiguiente(temp.getSiguiente());
                temp.setSiguiente(nuevoNodo);
            }
            this.cont++;
        }
    }

    public void vaciarLista() {
        inicio = null;
        fin = null;
        cont = 0;
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
            Nodo objSig = temp.getSiguiente();
            temp.setSiguiente(objSig.getSiguiente());
            //Mover a "Fin" para mantener la lista. Recolectar a "Fin".
            if (pos == (cantNodos - 1)) { //Si se borra el último nodo de la lista.
                fin = temp;
            }
        }
        this.cont--;
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
}
