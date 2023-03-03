package org.example.stack;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Stack {

    public void perfrom() {
        stackmethods stack = new stackmethods();
        stack.addElement(30);
        stack.addElement(8);
        stack.addElement(37);
        stack.addElement(41);
        stack.printElements();
        stack.removeElement();
        stack.removeElement();
        stack.printElements();
    }
}