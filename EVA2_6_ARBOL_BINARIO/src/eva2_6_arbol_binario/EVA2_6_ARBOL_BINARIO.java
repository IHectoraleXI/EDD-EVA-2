package eva2_6_arbol_binario;

public class EVA2_6_ARBOL_BINARIO {

    public static void main(String[] args) {
        ArbolBinario arbolBinario = new ArbolBinario();
        
        arbolBinario.agregar(13);
        arbolBinario.agregar(10);
        arbolBinario.agregar(18);
        arbolBinario.agregar(2);
        arbolBinario.agregar(11);
        arbolBinario.agregar(17);
        arbolBinario.agregar(20);
        arbolBinario.agregar(16);
        arbolBinario.agregar(16);
        
        arbolBinario.inOrder();
        arbolBinario.preOrder();
        arbolBinario.posOrder();
    }
    
}
