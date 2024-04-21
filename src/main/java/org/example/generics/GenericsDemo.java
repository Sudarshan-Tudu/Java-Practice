package org.example.generics;
import java.util.*;

class Student{
    private String name;
    private int id;
}

class Employee{
    private String name;
    private int id;
}

public class GenericsDemo {
    public static void main(String[] args) {

        //To achieved TypeSafety, we use Generics: <(type)>

        ArrayList<Integer> ar = new ArrayList();

        //ar.add("Suda");
        ar.add(26);
        ar.add(21);
        int a1 =ar.get(0);
        int a2 = ar.get(1);


        Student st1 = new Student();
        Student st2 = new Student();
        Student st3 = new Student();

        Employee e1 = new Employee();
        Employee e2 = new Employee();

        ArrayList<Student> arrayList = new ArrayList();
        arrayList.add(st1);
        arrayList.add(st2);
        //arrayList.add(e1);
    }
}
