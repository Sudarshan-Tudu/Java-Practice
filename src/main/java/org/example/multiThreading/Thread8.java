package org.example.multiThreading;
//join() & isAlive() methods in Thread,
//We use join() method to hold the task until it is fully executed,
//isAlive() method: to check whether thread got life or not to execution.

class Printing implements Runnable{
    @Override
    public void run() {
        try {
            for (int i = 0; i < 3; i++) {
                System.out.println("Never Give Up !!");
                Thread.sleep(3000);
            }
        }
        catch (Exception e){
            System.out.println("Error : " + e);
        }
    }
}

public class Thread8 {
    public static void main(String[] args) throws Exception {
        System.out.println("main Thread Started !");

        Printing p = new Printing();

        Thread t = new Thread(p);
        System.out.println(t.isAlive());
        t.start();
        System.out.println(t.isAlive());
        t.join(); //We use join() method to hold the task until it is fully executed,

        System.out.println("main method ended !");

    }
}
