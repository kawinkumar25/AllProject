package org.example.hash;

import java.util.Scanner;
import java.util.logging.Logger;

public class Hash {
    public void perfrom(){

        Logger l = Logger.getLogger("kawin");
        int choice;
        Scanner inputobject = new Scanner(System.in);
        boolean cond = true;
        while (cond) {
            l.info("1 Hashmap\n2 Hashset\n3Treeset\n4 exit");
            choice = inputobject.nextInt();

            switch (choice) {
                case 1:
                    Hashmap obj = new Hashmap();
                    obj.hashmap();
                    break;
                case 2:
                    Hashset obj1 = new Hashset();
                    obj1.hashset();
                    break;
                case 3:
                    Treset obj2 = new Treset();
                    obj2.treeset();
                    break;
                case 4:
                    cond = false;
                    break;

                default:
                    l.info("Invalid option");
                    break;

            }
            l.info("If You want to discontinue press->2 or to continue press any number?");
            int cont=inputobject.nextInt();
            if(cont==2)
            {
                l.info("Hash closed");
                cond = false;

            }

        }
    }
}
