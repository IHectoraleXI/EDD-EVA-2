package eva2_01_lista_simple;

import java.util.logging.Level;
import java.util.logging.Logger;

public class EVA2_01_LISTA_SIMPLE {

    public static void main(String[] args) {
        Lista miLista = new Lista();
        System.out.println("Cantidad de nodos: " + miLista.tamaLista());
        miLista.agregar(10);
        miLista.agregar(20);
        miLista.agregar(30);
        miLista.agregar(40);
        miLista.agregar(50);
        miLista.agregar(60);
        System.out.println("Cantidad de nodos: " + miLista.tamaLista());
        miLista.imprimir();
        try {
            miLista.insertarEn(70, 3);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("Cantidad de nodos: " + miLista.tamaLista());
        miLista.imprimir();
        try {
            miLista.borrarEn(0);
        } catch (Exception ex) {
            Logger.getLogger(EVA2_01_LISTA_SIMPLE.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Cantidad de nodos: " + miLista.tamaLista());
        miLista.imprimir();
        try {
            System.out.println("Valor en 4: " + miLista.obtenValorEn(4));
        } catch (Exception ex) {
            Logger.getLogger(EVA2_01_LISTA_SIMPLE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
