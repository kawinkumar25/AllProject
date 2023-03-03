package org.example.graph;

import java.util.logging.Logger;

class Graphclone
{
    Integer x;
    Integer y;
    Logger l = Logger.getLogger("kawin");
    Graphclone(Integer x,Integer y)
    {
        this.x=x;
        this.y=y;
    }
    boolean equals()
    {
        return x.equals(y);
    }

    Graphclone gp()
    {
        try
        {
            return (Graphclone) super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            l.info("cloned error");
            return this;
        }
    }
}
