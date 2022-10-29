package eva2_5_stack;

import java.util.logging.Level;
import java.util.logging.Logger;

public class EVA2_5_STACK {

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        myStack.push(50);
        try {
            myStack.pop();
        } catch (Exception ex) {
            Logger.getLogger(EVA2_5_STACK.class.getName()).log(Level.SEVERE, null, ex);
        }
        myStack.imprimir();
    }

}
