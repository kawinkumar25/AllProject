package org.example.studentgrade;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


class Greadopertions
{
    String name;
    String gradeLevel;
    float gpa;
    float ugpa;
    Logger l = Logger.getLogger("kawin");
    Scanner i =new Scanner(System.in);
    Greadopertions(String name,String gradeLevel,float gpa)
    {
        this.name=name;
        this.gradeLevel=gradeLevel;
        this.gpa=gpa;
    }
    void update()
    {
        l.info("enter yur updated gpa");
        ugpa=i.nextFloat();
        gpa=ugpa;
    }
    void show()
    {
        l.log(Level.INFO, ()->name+" has GPA of "+gpa);
    }
}