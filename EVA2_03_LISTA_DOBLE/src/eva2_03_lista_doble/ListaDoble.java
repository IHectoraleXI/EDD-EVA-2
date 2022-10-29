package eva2_03_lista_doble;

public class ListaDoble {
    private Nodo inicio;
    private Nodo fin;
    private int cont;

    public ListaDoble() {
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
    
    public void agregar(int valor) { //Agregar un nodo al final de la lista.
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
}
