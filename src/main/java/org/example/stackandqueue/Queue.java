package org.example.stackandqueue;

public class Queue {

    public void perfrom() {
        queuemethods queue = new queuemethods();
        queue.addElement(12);
        queue.addElement(4);
        queue.addElement(10);
        queue.printElements();
        queue.removeElement();
        queue.printElements();
    }
}
