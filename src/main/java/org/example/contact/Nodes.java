package org.example.contact;

public class Nodes {
    String name;
    String email;
    long number;

    Nodes next;
    Nodes(String name,long number,String email)
    {
        this.name=name;
        this.number=number;
        this.email=email;
        next=null;
    }

}
