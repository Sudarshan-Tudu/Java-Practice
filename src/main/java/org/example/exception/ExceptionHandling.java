package org.example.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
//        int x=0;
//        Scanner sc = new Scanner(System.in);
//        try {
//            x = sc.nextInt();
//        }
//        catch (InputMismatchException e){
//            System.out.println("Invalid input: " + e);
//        }
//        finally {
//            sc.close();
//        }
//        System.out.println(x);

//-------ArithmeticException, ArrayIndexOutOfBoundsException, Exception, Try-Catch--------//
        int x=6;
        int y=4;
        int result=0;
        int [] arr = {2,4,6,8};
        String str = "null";

        try {
            result = x/y;
            System.out.println(result);
            System.out.println(arr[5]);
            System.out.println(str.length());
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid input: " + e);
        }
        catch (ArithmeticException e) {
            System.out.println("Can't devide by zero: " + e);
        }
        catch (Exception e) {
            System.out.println("Something wrong");
        }

        System.out.println("Bye!");
    }
}
