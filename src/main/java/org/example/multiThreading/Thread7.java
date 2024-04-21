package org.example.multiThreading;
//States of Thread
//A thread is a path of execution in a program that goes through the following states of a thread, the 5 threads are:-
// 1.New, 2.Runnable, 3.Running, 4.Blocked(Non-runnable state), 5.Dead

class Student implements Runnable{
    @Override
    public void run(){ //Running State
        System.out.println("Hello Student!!");

        try {
        Thread.sleep(3000); // Blocked State
        }
        catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}

public class Thread7 {
    public static void main(String[] args) {
        System.out.println("In main thread");

        Student st1 = new Student();

        Thread t1 = new Thread(st1); //New Stage
        t1.start(); //Runnable/Ready State
    }
}
