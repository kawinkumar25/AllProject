package org.example.creditcard;

import java.util.Scanner;
import java.util.logging.Logger;
public class Creditcard
{
    public void perfrom() {
        Scanner inpobject = new Scanner(System.in);
        Logger l = Logger.getLogger("kawin");
        l.info("Credit card Started");
        while(true) {
            l.info("enter name");
            String name = inpobject.next();
            l.info("enter card no");
            Long cardno = inpobject.nextLong();
            l.info("enter exp date ");
            String expdate = inpobject.next();

            Long validcardno = 1234567890L;

            Credit obj1 = new Credit(name, cardno, expdate);
            Credit obj2 = obj1.cloning();

            if (obj2.equalss(validcardno)) {
                l.info("both are same");
            } else {
                l.info("both are not same");
            }
            l.info("Do You want to continue yes->1 / no->2?");
            int cont = inpobject.nextInt();
            if (cont == 2) {
                l.info("credit card closed");
                break;
            }
        }
    }
}
