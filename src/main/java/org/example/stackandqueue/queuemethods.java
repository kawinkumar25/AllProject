package org.example.stackandqueue;

import java.util.logging.Level;
import java.util.logging.Logger;

public class queuemethods {
    Logger log=Logger.getLogger("queue.class");
    Node1 rootNode=null;
    int count =0;

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
        this.rootNode = this.rootNode.nextNode;
        this.count--;
    }

    public void printElements() {
        Node1 temp = this.rootNode;
        if (temp == null) {
            log.info("Is empty!");
        }
        else {
            while (temp != null) {
                int result = temp.data;
                log.log(Level.INFO, () -> "" + result);
                temp = temp.nextNode;
            }
        }
        log.log(Level.INFO,()-> "Size of the Queue is:" + this.count);
    }
}
