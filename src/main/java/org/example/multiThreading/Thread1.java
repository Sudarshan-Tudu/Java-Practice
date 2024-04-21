package org.example.multiThreading;
//Line of Execution/ Flow of Execution - is called Thread,
//For doing multiple task in one single process(), we need multiple threads to executing all independent tasks/activity.
//Here we see: needs of thread.
//Definition of Thread: A Thread is a very light-weighted process, or we can say the smallest part of the process-
// -that allows a program to operate more efficiently by running multiple tasks simultaneously.
//It's mean: within one application process are switching with each others,
//Thread Scheduler: If multiple threads are waiting to execute, then which thread will execute 1st is decided by Thread Scheduler, which is part of JVM.   In the case of MultiThreading we can't predict the exact output, only possible output we can expect.

import java.util.Scanner;

public class Thread1 {
    public static void main(String[] args) {
        System.out.println("Calculation task started");
        System.out.println("Pls enter the first number");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Pls enter the second number");
        int num2 = sc.nextInt();
        int result = num2 + num1;
        System.out.println("Result is: " + result);
        System.out.println("Calculation task ended");
        System.out.println("-----------------------------------------------------");


        System.out.println("Printing task started");
        for (int i=0; i<4; i++){
            System.out.println("*");
        }
        System.out.println("Printing task ended");
        System.out.println("-----------------------------------------------------");


        System.out.println("Displaying important message");
        for(int i=0; i<3; i++) {
            System.out.println("Never Loose Hope, Keep Struggling, Keep Enjoying");
        }
        System.out.println("Printing task ended");
        System.out.println("-----------------------------------------------------");
    }
}
