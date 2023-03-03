package org.example.hash;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Hashset {

        Logger l = Logger.getLogger("kawin");
        void hashset() {
            HashSet<String> hs = new HashSet<>();
            hs.add("5");
            hs.add("10");
            hs.add("15");
            hs.add("20");
            hs.add("5");
            l.log(Level.INFO, () -> String.valueOf(hs));
            hs.remove("20");
            l.log(Level.INFO, () -> String.valueOf(hs));
            l.log(Level.INFO, () -> String.valueOf(hs.size()));
            LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
            lhs.add(5);
            lhs.add(3);
            lhs.add(1);
            l.log(Level.INFO, () -> String.valueOf(lhs));

            LinkedList<Integer> ll = new LinkedList<Integer>();
            ll.add(10);
            ll.add(100);
            ll.add(20);
            ll.add(20);
            l.log(Level.INFO, () -> String.valueOf(ll));

            LinkedHashSet<Integer> e = new LinkedHashSet<>(ll);
            l.log(Level.INFO, () -> String.valueOf(e));
            e.clear();
            l.log(Level.INFO, () -> "size " + e.size());
        }
    }

