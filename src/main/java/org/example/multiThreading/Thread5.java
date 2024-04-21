package org.example.multiThreading;
import java.util.Scanner;

//Creating Thread: By implements Runnable Interface.

class Cal implements Runnable{
    @Override
    public void run(){
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
}

class Print implements Runnable{
    @Override
    public void run() {
        System.out.println("Printing task started");
        for (int i=0; i<4; i++){
            System.out.println("*");
        }
        System.out.println("Printing task ended");
        System.out.println("-----------------------------------------------------");
    }
}

class Display implements Runnable{
    @Override
    public void run() {
        System.out.println("Displaying important message");
        for(int i=0; i<3; i++) {
            System.out.println("Never Loose Hope, Keep Struggling, Keep Enjoying");
        }
        System.out.println("Printing task ended");
        System.out.println("-----------------------------------------------------");
    }
}

public class Thread5 {
    public static void main(String[] args) {
        Cal t1 = new Cal();
        Print t2 = new Print();
        Display t3 = new Display();

        Thread a = new Thread(t1);
        Thread b = new Thread(t2);
        Thread c = new Thread(t3);

        a.start();
        b.start();
        c.start();
    }
}
