package org.example.stack;

import java.util.logging.Level;
import java.util.logging.Logger;

public class stackmethods {
    Logger log = Logger.getLogger("kawin");
    Node1 rootNode = null;
    int count = 0;

    public void addElement(int value) {
        if (this.rootNode == null) {
            this.rootNode = new Node1(value);
            this.count++;
        } else {
            Node1 temp = this.rootNode;
            while (temp.nextNode != null) {
                temp = temp.nextNode;
            }
            temp.nextNode = new Node1(value);
            this.count++;
        }
    }

    public void removeElement() {
        Node1 temp = this.rootNode;
        if (this.count == 1) {
            this.rootNode = temp.nextNode;
        } else {
            Node1 prev = temp;
            while (temp.nextNode != null) {
                prev = temp;
                temp = temp.nextNode;
            }
            prev.nextNode = temp.nextNode;
        }
        this.count--;
    }


    public void printElements() {
        Node1 temp = this.rootNode;
        if (temp == null) {
            log.info("Is empty!");
        } else {
            while (temp != null) {
                int result = temp.data;
                log.log(Level.INFO, () -> "" + result);
                temp = temp.nextNode;
            }
        }
        log.log(Level.INFO, () -> "Size :" + this.count);
    }
}
