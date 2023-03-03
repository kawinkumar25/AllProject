package org.example;
import org.example.bank.*;
import org.example.calculator.Calculator;
import org.example.contact.Contacts;
import org.example.creditcard.Creditcard;
import org.example.files.Files;
import org.example.graph.*;
import org.example.hash.Hash;
import org.example.jdbc.Jdbc;
import org.example.linkedlist.LinkedList;
import org.example.shape.*;
import org.example.stackandqueue.Queue;
import org.example.studentgrade.*;
import org.example.studenttest.Studenttest;
import org.example.tictactoe.Tictactoe;
import org.example.stack.Stack;

import java.util.Scanner;

import java.util.logging.Logger;

public class Main  {




    public static void main(String[] args) 

    {
        boolean con= true;
        Scanner scan = new Scanner(System.in);
        Logger l = Logger.getLogger("kawin");
        int choice;
        do {
           l.info( "Enter the Which Program is Run: \n1. BankAccount\n2. Basic Shape\n3. Student\n4. Connection Pool" +
                   "\n5. Point in 2D Space\n6. Credit Card\n7. Student Details\n8. Linked List\n9. Hash\n10. Calculator\n11.Contact" +
                   "\n12. Frequency of words\n13.Tictactoe\n14.Stack\n15.Queue\n16. Exit");
           choice=scan.nextInt();
           switch (choice)
           {
               case 1:
                    Bank bank = new Bank();
                    bank.perfrom();
                    break;
               case 2:
                   Shape shape = new Shape();
                   shape.perfrom();
                   break;
               case 3:
                   Grade grade = new Grade();
                   grade.perfrom();
                   break;
               case 4:
               {
                   Jdbc jdbc = new Jdbc();
                   jdbc.perfrom();
                   break;
               }
               case 5:
               {
                   Graph graph = new Graph();
                   graph.perfrom();
                   break;
               }
               case 6:
               {
                    Creditcard creditcard = new Creditcard();
                   creditcard.perfrom();
                   break;
               }
               case 7:
               {
                   Studenttest student = new Studenttest();
                   student.perfrom();
                   break;
               }
               case 8:
               {
                   LinkedList linkedList = new LinkedList();
                   linkedList.perfrom();
                   break;
               }
               case 9:
               {
                   Hash hash = new Hash();
                   hash.perfrom();
                   break;
               }
               case 10:
               {
                   Calculator calculator = new Calculator();
                   calculator.perfrom();
                   break;
               }
               case 11:
               {
                   Contacts contacts = new Contacts();
                   contacts.perfrom();
                   break;
               }
               case 12:
               {
                   Files files = new Files();
                   files.perfrom();
                   break;
               }
               case 13:
               {
                   Tictactoe tictactoe = new Tictactoe();
                   tictactoe.perfrom();
                   break;
               }
               case 14 :
               {
                   Stack stackk = new Stack();
                   stackk.perfrom();
                   break;
               }
               case 15:
               {
                   Queue queue = new Queue();
                   queue.perfrom();
                   break;
               }
               case 16:
               {
                   con=false;
                   break;
               }
               default:
                   l.info("invaild option");

           }

        }while(con);
    }
}
