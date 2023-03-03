package org.example.linkedlist;

import java.util.Scanner;
import java.util.logging.*;

public class LinkedList {
    Node head;
    int size;
    Logger l = Logger.getLogger("kawin");

    public LinkedList() {
        head = null;
        size = 0;
    }

    void add(String nm) {
        Node node = new Node(nm);
        Node current;
        if (head == null) {
            head = node;
        } else {
            current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
        size++;
    }

    void insert(String nm, int index) {
        Node node = new Node(nm);
        Node current;
        Node prev = null;
        if (index == 0) {
            current = node;
            current.next = head;
            head = current;
        } else if (index > 0) {
            current = head;
            for (int i = 0; i < index; i++) {
                prev = current;
                current = current.next;
            }
            node.next = current;
            prev.next = node;
        }
        size++;
    }

    void remove(int index) {
        Node current = head;
        Node prev = null;
        if (index == 0) {
            head = current.next;
        } else if (index > 0) {
            for (int i = 0; i < index; i++) {
                prev = current;
                current = current.next;
            }
            prev.next = current.next;
        }
        size--;
    }

    void print() {
            Node current = head;
            while (current != null) {
                String name =  current.name;
                l.info(name);
                current = current.next;
            }
    }

        public void perfrom()
        {
        LinkedList c = new LinkedList();
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        Logger l1 = Logger.getLogger("com.api.jar");
        int ch;
        do {
            l1.info("Enter your choice\n1. Add the Element\n2. Print the Element\n3. Insert the Element\n4. Remove the Element\n5. Exit");
            ch = s1.nextInt();
            switch (ch) {
                case 1:
                    l1.info("Enter the Number of Details store in linkedlist:");
                    int n = s1.nextInt();
                    for (int i = 0; i < n; i++) {
                        l1.info("Enter the Name:");
                        String addname = s2.nextLine();
                        c.add(addname);
                    }
                    break;
                case 2:
                    c.print();
                    break;
                case 3:
                    l1.info("Enter the insert Name:");
                    String insertname = s2.nextLine();
                    l1.info("Enter the Position");
                    int position = s1.nextInt();
                    c.insert(insertname, position);
                    break;
                case 4:
                    l1.info("Enter the Remove Position");
                    position = s1.nextInt();
                    c.remove(position);
                    break;
                default:
                    l1.info("Invalid Enter correctly");
            }
            l.info("if You don't want to continue press no->2?");
            int cont=s1.nextInt();
            if(cont==2)
            {
                l.info("LinkedList closed");
                break;
            }
        } while (true);
    }
}
