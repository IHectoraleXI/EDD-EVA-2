package eva2_4_queue;

import java.util.logging.Level;
import java.util.logging.Logger;

public class EVA2_4_QUEUE {

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        //Lista tipo FIFO (First In, FIrst Out)
        myQueue.agregar(10);
        myQueue.agregar(20);
        myQueue.agregar(30);
        myQueue.agregar(40);
        myQueue.agregar(50);
        System.out.println("Primer valor en llegar es: " + myQueue.peek());
        myQueue.imprimir();
        try {
            System.out.println("Primer valor en llegar es: " + myQueue.poll());
        } catch (Exception ex) {
            Logger.getLogger(EVA2_4_QUEUE.class.getName()).log(Level.SEVERE, null, ex);
        }
        myQueue.imprimir();
    }

}
