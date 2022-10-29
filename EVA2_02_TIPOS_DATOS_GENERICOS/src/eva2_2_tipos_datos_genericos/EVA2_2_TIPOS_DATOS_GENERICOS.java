/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_2_tipos_datos_genericos;

import java.util.LinkedList;

/**
 *
 * @author aleta
 */
public class EVA2_2_TIPOS_DATOS_GENERICOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList <String> miLista = new LinkedList<String>();
        TiposDatosGenericos<Integer> miObj = new TiposDatosGenericos<Integer>();
        //<> Solo acepta clases, ejemplos: <String>, <Integer>...
        miObj.setValor(100);
        System.out.println(miObj.getValor());
    }
    
}

class TiposDatosGenericos<T> {
    private T valor;

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }
    
    
}