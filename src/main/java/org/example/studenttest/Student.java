package org.example.studenttest;


class Student {
    private String name;
    private int age;
    private double gpa;

    Student(String name,int age,double gpa)
    {
        set(name,age,gpa);
    }

    void set(String name,int age,double gpa)
    {
        this.name=name;
        this.age=age;
        this.gpa=gpa;
    }

    String getname() {
        return name;
    }
    int getage()
    {
        return age;
    }
    double getgpa()
    {
        return gpa;
    }
}