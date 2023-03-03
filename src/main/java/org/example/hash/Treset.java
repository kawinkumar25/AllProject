package org.example.hash;

import java.util.LinkedList;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Treset {

    Logger l = Logger.getLogger("kawin");


    void treeset() {

        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(5);
        ts.add(1);
        ts.add(25);
        ts.add(10);
        l.log(Level.INFO, () -> String.valueOf(ts));

        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(5);
        ll.add(26);
        ll.add(20);
        ll.add(11);
        l.log(Level.INFO, () -> String.valueOf(ll));

        TreeSet<Integer> tk = new TreeSet<>(ll);
        l.log(Level.INFO, () -> String.valueOf(tk));
        l.log(Level.INFO, () -> "size " + tk.size());
        tk.clear();
    }
}

