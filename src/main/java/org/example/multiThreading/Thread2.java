package org.example.multiThreading;

//Without thread no java program will execute,
//Default thread is : 'main', & it's priority is 5,

public class Thread2 {
    public static void main(String[] args) {

        System.out.println("Before Change");

        String name =Thread.currentThread().getName();
        System.out.println(name);
        System.out.println(Thread.currentThread().getPriority());

        System.out.println("After Change");

        Thread.currentThread().setName("ST");
        Thread.currentThread().setPriority(1);
        System.out.println("Name: " + Thread.currentThread().getName());
        System.out.println("Priority: " + Thread.currentThread().getPriority());


    }
}
