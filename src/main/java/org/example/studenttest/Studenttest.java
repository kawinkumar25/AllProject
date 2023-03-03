package org.example.studenttest;

import java.util.*;

import java.util.logging.*;



public class Studenttest {
    public void perfrom() {
        Logger l = Logger.getLogger("kawin");
        Scanner inputobj = new Scanner(System.in);
        String name;
        int age;
        double gpa;
        ArrayList<Student> list = new ArrayList<>();
        while (true) {
            while (true) {
                l.info("Enter name");
                name = inputobj.next();
                l.info("Enter age");
                age = inputobj.nextInt();
                l.info("Enter gpa double");
                gpa = inputobj.nextDouble();

                Student object1 = new Student(name, age, gpa);

                list.add(object1);
                l.info("Do You want to Add yes->1 / no->2?");
                int cont = inputobj.nextInt();
                if (cont == 2) {
                    l.info("Getting values is closed");
                    break;
                }
            }


            l.info("before sorting");
            for (int i = 0; i < list.size(); i++) {
                l.info(list.get(i).getname() + " " + list.get(i).getage() + " " + list.get(i).getgpa());
            }

            l.info("after sorting");
            Collections.sort(list, new Comparator<Student>() {

                public int compare(Student o1, Student o2) {
                    return Double.compare(o2.getgpa(), o1.getgpa());
                }
            });


            for (int i = 0; i < list.size(); i++) {
                l.info(list.get(i).getname() + " " + list.get(i).getage() + " " + list.get(i).getgpa());
            }
            l.info("Do You want to continue yes->1 / no->2?");
            int cont = inputobj.nextInt();
            if (cont == 1) {
                list.clear();
            }
            else if(cont==2)
            {
                l.info("Student test is closed");
                break;
            }
        }
    }
}