package org.example.hash;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Hashmap {

    Logger l = Logger.getLogger("kawin");

    void hashmap() {

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("idly", 20);
        hm.put("dosa", 30);
        hm.put("poori", 30);
        hm.put("rice", 50);
        l.log(Level.INFO, () -> String.valueOf(hm));
        HashMap<String, Integer> hm1 = new HashMap<>(hm);
        l.log(Level.INFO, () -> String.valueOf(hm1));
        l.log(Level.INFO, () -> String.valueOf(hm1.get("idly")));
        l.log(Level.INFO, () -> String.valueOf(hm1.containsKey("idly")));
        l.log(Level.INFO, () -> String.valueOf(hm1.containsValue(30)));
        l.log(Level.INFO, () -> String.valueOf(hm1.remove("idly")));
        l.log(Level.INFO, () -> String.valueOf(hm1.remove("dosa", 300)));
        l.log(Level.INFO, () -> String.valueOf(hm1.size()));
        l.log(Level.INFO, () -> String.valueOf(hm1.isEmpty()));
        hm1.clear();
        l.log(Level.INFO, () -> String.valueOf(hm1.isEmpty()));
        Set<Map.Entry<String, Integer>> s = hm.entrySet();
        l.log(Level.INFO, () -> String.valueOf(s));
        Collection<Integer> c = hm.values();
        l.log(Level.INFO, () -> String.valueOf(c));
        l.log(Level.INFO, () -> String.valueOf(hm.keySet()));
        Iterator<Map.Entry<String, Integer>> i = s.iterator();
        while (i.hasNext()) {
            l.log(Level.INFO, () -> String.valueOf(i.next()));
        }
        Iterator<Map.Entry<String, Integer>> ii = s.iterator();
        while (ii.hasNext()) {
            Object o = ii.next();
            Map.Entry<String, Integer> e = (Map.Entry) o;
            l.log(Level.INFO, () -> String.valueOf(e.getKey()));
            l.log(Level.INFO, () -> String.valueOf(e.getValue()));
        }
        Iterator<Map.Entry<String, Integer>> it = s.iterator();
        while (it.hasNext()) {
            Object o = it.next();
            Map.Entry<String, Integer> e = (Map.Entry) o;
            if (e.getValue().equals(30)) {
                e.setValue(40);
            }
        }
        l.log(Level.INFO, () -> String.valueOf((s)));
    }
}