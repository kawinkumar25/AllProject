package org.example.creditcard;

import java.util.logging.Logger;


class Credit
{
    String name;
    Long cardno;
    String expdate;
    Logger l = Logger.getLogger("kawin");
    Credit(String name,Long cardno,String expdate)
    {
        this.name=name;
        this.cardno=cardno;
        this.expdate=expdate;
    }
    boolean equalss(Long validcardno)
    {
        return cardno.equals(validcardno);
    }
    Credit cloning()
    {
        try
        {
            return (Credit) super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            l.info("cloned error");
            return this;
        }
    }
}
