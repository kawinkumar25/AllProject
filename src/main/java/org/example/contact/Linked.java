package org.example.contact;

import java.util.logging.Logger;

public class Linked {
    Nodes rootnode;
    Logger log = Logger.getLogger("kawin");
    int count =0;
    Linked()
    {
        rootnode = null;
    }
    public void addContact(String name,long number,String email)
    {
        if (searchContact(name) == 1) {
            log.info("Already this contact name is inside given see!!");
        }
        else
        {
            Nodes newnode = new Nodes(name, number, email);
            if (rootnode == null) {
                rootnode = newnode;
                count++;
            } else {
                Nodes temp = rootnode;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newnode;
                count++;
            }
        }
    }
    public void display()
    {
        Nodes temp = rootnode;
        if(temp == null)
        {
            log.info("Contact List is Empty");
        }
        else {
            while(temp!=null)
            {
                String namecontact = "ContactName:" + temp.name;
                String numberphone = "PhoneNumber:"+ temp.number;
                String addressemail = "EmailAddress:" +temp.email;
                log.info(namecontact);
                log.info(numberphone);
                log.info(addressemail);
                temp=temp.next;
            }
        }
    }
    public int searchContact(String searchname)
    {
        int flag =0;
        Nodes temp = rootnode;
        if(temp == null)
        {
            log.info("Contacts is empty");
            return 0;
        }
        else {
            while(temp != null)
            {
                if(searchname.equals(temp.name))
                {
                    flag =1;
                    String namecontact = "ContactName:" + temp.name;
                    String numberphone = "PhoneNumber:"+ temp.number;
                    String addressemail = "EmailAddress:" +temp.email;
                    log.info(namecontact);
                    log.info(numberphone);
                    log.info(addressemail);
                    return flag;

                }
                else
                {
                    temp = temp.next;
                }
            }
            if(flag == 0)
            {
                log.info("No contact found");

            }
            return flag;
        }
    }

    public void deleteContact(String deletename)
    {
        Nodes temp = rootnode;
        Nodes prev=temp;
        int flag=0;
        while(temp!=null)
        {
            if(deletename.equals(rootnode.name))
            {
                flag=1;
                log.info("Deleted Contact Sucessfully");
                rootnode =temp.next;
                temp = null;

            }
            else if(deletename.equals(temp.name))
            {
                flag=1;
                log.info("Deleted Contact Sucessfully");
                prev.next =temp.next;
                temp = null;

            }
            else
            {
                prev=temp;
                temp=temp.next;
            }
        }
        if(flag == 0)
        {
            log.info("No Contact found");
        }
    }
}