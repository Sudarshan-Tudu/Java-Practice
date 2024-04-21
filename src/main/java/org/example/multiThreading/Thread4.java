package org.example.multiThreading;
import java.util.Scanner;

//Creating Thread: By extending Thread Class.

class Calc extends Thread{
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

class PrintPattern extends Thread{
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

class DisplayMessage extends Thread{
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

public class Thread4 {
    public static void main(String[] args) {
        Calc calc = new Calc();
        PrintPattern printPattern = new PrintPattern();
        DisplayMessage displayMessage = new DisplayMessage();

        calc.start();
        printPattern.start();
        displayMessage.start();
    }
}
