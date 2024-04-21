package org.example.collection;

class Student{
    String name;
    int age;
    int rollNo;
    public void show(){
        System.out.println(name + " " + age + " " + rollNo);
    }
}

public class ArrayDQ {
    //Object:- Memory allocation Practice//
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.age = 20;
//        st1.name = "Sudarshan";
//        st1.rollNo = 100;

        System.out.println(st1.age);
        //st1.show();



        int b = 20;
        String str = "Hello";
    }
}
