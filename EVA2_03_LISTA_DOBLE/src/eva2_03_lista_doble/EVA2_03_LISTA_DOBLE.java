package eva2_03_lista_doble;

import java.util.logging.Level;
import java.util.logging.Logger;

public class EVA2_03_LISTA_DOBLE {

    public static void main(String[] args) {
        ListaDoble ListaDoble = new ListaDoble();
        ListaDoble.agregar(10);
        ListaDoble.agregar(20);
        ListaDoble.agregar(30);
        ListaDoble.agregar(40);
        try {
            ListaDoble.insertarEn(15, 2);
        } catch (Exception ex) {
            Logger.getLogger(EVA2_03_LISTA_DOBLE.class.getName()).log(Level.SEVERE, null, ex);
        }
        ListaDoble.imprimir();
    }
    
}
