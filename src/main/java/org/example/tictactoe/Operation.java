package org.example.tictactoe;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;


class Operation {
    protected int size;
    protected char[][] arr;
    protected   Operation(char[][] arr, int size)
    {
        this.arr=arr;
        this.size=size;
    }
    int inc=0;
    PrintStream p= new PrintStream(new FileOutputStream(FileDescriptor.out));

    protected   void main()
    {
        Operation obj = new Operation(arr,size);
        Methods m = new Methods(arr,size);
        m.assign();
        p.println("player 1 --> X");
        p.println("player 2 --> O");


        Scanner inpobject = new Scanner(System.in);
        while((obj.inc)<size*size)
        {

            if(obj.inc%2==0)
            {
                p.println("enter the position to insert 1 to 9 \nPlayer 1-> X");
                char x='X';
                int pos = inpobject.nextInt();
                int inval=m.insert(pos,x);
                if(inval==1)
                {
                    obj.inc--;
                }
                m.display();
                m.daigonalchks(inc,obj);
                m.rightdaigonal(obj);
                m.check(obj);
                m.cheaks(obj);
            }
            else
            {
                p.println("enter the position to insert 1 to 9 \nPlayer 2-> O");
                char o='O';
                int pos = inpobject.nextInt();
                int inval=m.insert(pos,o);
                if(inval==1)
                {
                    obj.inc--;
                }
                m.display();
                m.daigonalchks(inc,obj);
                m.rightdaigonal(obj);
                m.check(obj);
                m.cheaks(obj);
            }
            obj.inc++;
            if(obj.inc==size*size)
            {
                p.println("Match Draw!!");
            }
        }


    }
}
