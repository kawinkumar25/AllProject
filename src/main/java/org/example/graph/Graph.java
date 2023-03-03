package org.example.graph;

import java.util.Scanner;
import java.util.logging.Logger;

public class Graph
{
    public void perfrom()
    {

        Logger l = Logger.getLogger("kawin");
        l.info("Graph Started");
        Scanner inpobject = new Scanner(System.in);
        while(true) {

            l.info("enter x");
            Integer x = inpobject.nextInt();
            l.info("enter y");
            Integer y = inpobject.nextInt();

            Graphclone obj1 = new Graphclone(x, y);
            Graphclone obj2 = obj1.gp();
            if (obj2.equals()) {
                l.info("x and y are same");
            } else {
                l.info("x and y are not same");
            }
            l.info("Do You want to continue yes->1 / no->2?");
            int cont=inpobject.nextInt();
            if(cont==2)
            {
                l.info("Graph Gpa closed");
                break;
            }
        }
    }
}
