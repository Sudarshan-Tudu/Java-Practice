package org.example.multiThreading;

//MultiThreading using single run() method

import java.util.Scanner;

class MyThread1 extends Thread{

    public void run(){
       String name  =Thread.currentThread().getName();

       if (name.equals("CALC")) {
           calculator();
       }
       else
           printingMessage();
    }

    public void calculator(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculation task started");
        System.out.println("Pls enter the first number");

        int num1 = sc.nextInt();
        System.out.println("Pls enter the second number");
        int num2 = sc.nextInt();
        int result = num2 + num1;
        System.out.println("Result is: " + result);
        System.out.println("Calculation task ended");
        System.out.println("-----------------------------------------------------");
    }

    public void printingMessage(){
        System.out.println("Displaying important message");
        try {
            for (int i = 0; i < 3; i++) {
                System.out.println("Never Loose Hope, Keep Struggling, Keep Enjoying");
                sleep(4000);
            }
        }
        catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Printing task ended");
        System.out.println("-----------------------------------------------------");
    }
}

public class Thread6 {
    public static void main(String[] args) {
        MyThread1 mt1 = new  MyThread1();
        MyThread1 mt2 = new  MyThread1();

        mt1.setName("CALC");
        mt2.setName("PRINT");

        mt1.start();
        mt2.start();
    }
}
