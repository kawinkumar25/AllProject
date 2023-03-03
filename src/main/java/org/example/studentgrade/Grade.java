package org.example.studentgrade;

import java.util.Scanner;
import java.util.logging.Logger;

public class Grade {

    public void perfrom() {

        Logger l = Logger.getLogger("kawin");
        l.info("Student Gpa Stared");
        while (true)
        {
            Scanner inputobj = new Scanner(System.in);
            Scanner inp = new Scanner(System.in);
            l.info("Enter name:");
            String name = inputobj.next();
            l.info("Enter grade  level:");
            String gradeLevel = inputobj.next();
            float gpa;
            boolean con=true;

            while(con)
            {
                try {
                    l.info("Enter gpa:");
                    gpa = inputobj.nextFloat();
                    Greadopertions gradeobj = new Greadopertions(name, gradeLevel, gpa);
                    l.info("Do you want to update your gpa yes->1/no->2 ?");

                    int choice = inp.nextInt();
                    if (choice == 1) {
                        gradeobj.update();
                        gradeobj.show();
                    } else if (choice == 2) {
                        gradeobj.show();
                    } else {
                        l.info("Sorry you have entered worng choice!!");
                    }
                    break;

                }
                catch (Exception e) {
                    l.info("enter float or int type value");
                    inputobj.nextLine();
                }

            }

            l.info("Do You want to continue yes->1 / no->2?");
            int cont = inputobj.nextInt();
            if (cont == 2) {
                l.info("Student Gpa closed");
                break;
            }
        }
    }
}
