package org.example.collectionsClass;
import java.util.*;

//Comparator vs Comparable Class.

class Student implements Comparable<Student>{
    String name;
    int age;
    int marks;

    public Student(String name, int age, int marks){
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getMarks() {
        return marks;
    }

    public String toString(){
        return name + "-" + age + "-" + marks;
    }

    //Comparable Class is: When we can modify Target Class(Student)
    public int compareTo(Student a){
        if (this.age>a.age) return 1;
        else return -1;
    }
}
//Comparator Class is Target Class(Student) Independent, when

class Alpha implements Comparator<Student> {
    public int compare(Student a, Student b){
        if (a.age > b.age) return 1;
        else return -1;
    }
}

public class CollectionsClass1 {
    public static void main(String[] args) {
        Student st1 = new Student("Rohit", 18, 50);
        Student st2 = new Student("Rohan", 17, 60);
        Student st3 = new Student("Virat", 20, 40);

        List<Student> ar = new ArrayList();

        ar.add(st1);
        ar.add(st2);
        ar.add(st3);

        System.out.println(ar);
        Collections.sort(ar, Student::compareTo);
        System.out.println(ar);


        //Comparator Class is Target Class(Student) Independent, when we can't modify Target Class
        //Inner Class, Lambda Expression revise Reqd.

//        Alpha alpha = new Alpha();
//        Collections.sort(ar,alpha);
//
//        Comparator comp = (Comparator<Student>) (a, b) -> {
//            if (a.age > b.age){
//                return 1;
//            }
//            else return -1;
//        };
//
//        System.out.println(ar);

    }
}
