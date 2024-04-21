package org.example.multiThreading;

//Here we create thread,
//1.By extending Thread Class.  2.By Implementing Runnable Interface.
//In-build Class: Thread{run(), sleep(), wait(), start(), join(),..} is implementing Runnable Interface{void run()},
//By calling start() method - our thread will schedule at ThreadScheduler, & it manages the threads,
//or registering our threads in ThreadScheduler,

class MyThread extends Thread {
    public void run(){
        System.out.println("Child Thread");
    }
}

public class Thread3 {
    public static void main(String[] args) {
        System.out.println("main Thread");

        MyThread t1 = new MyThread();
        //using start() method we can invoke run() method,
        t1.start();
    }
}
