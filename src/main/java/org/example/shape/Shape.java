package org.example.shape;


import java.util.Scanner;

import java.util.logging.Logger;

public class Shape {

    public void perfrom() {
        while (true) {

            Scanner inputobj = new Scanner(System.in);
            Logger l = Logger.getLogger("kawin");
            l.info(" 1 Triangle \n 2 Rectangle \n 3 circle\n 4 Exit ");
            int choice = inputobj.nextInt();
            if(choice==4)
            {
                break;
            }
            Shapemethods shapeobj = new Shapemethods(choice);
            shapeobj.perimeter(choice);
            shapeobj.area(choice);

        }
    }


}
