package org.example.files;

import java.io.File;
import java.util.*;
import java.util.logging.Logger;

public class Files
{
    public void perfrom()
    {
        Logger l = Logger.getLogger("kawin");
        StringBuilder str = new StringBuilder();
        try
        {
            String s = "C:\\Users\\Tringapps-User21\\IdeaProjects\\Project\\src\\lib\\data_analyst.txt";
            File file = new File(s);
            Scanner inp = new Scanner(file);
            while(inp.hasNextLine())
            {
                str.append(inp.nextLine());
                str.append(" ");
            }
        }
        catch(Exception e)
        {
            String s = ""+e;
            l.info(s);
        }
        String[] str1 = str.toString().split(" ");
        Fileslogic obj = new Fileslogic(str1);
        obj.hash();

    }
}
