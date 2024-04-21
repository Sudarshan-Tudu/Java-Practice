package org.example.exception;
//throw keyword and Custom Exception
import java.util.Scanner;

class MyException extends Exception{
    public MyException(){}

    public MyException(String msg){
        super(msg);
        //msg = "Pls input positive number";
    }
}

public class ExceptionHandling1 {
    public static void main(String[] args) {
        int x=6;
        int y=0;
        Scanner sc = new Scanner(System.in);
        y=sc.nextInt();

        try {
            if (y<0) {
                //Creating Custom Exception
                Exception er = new MyException("Negative Number");
                //Exception er= new ArithmeticException("Negative number");
                throw er;
                //System.out.println("Invalid input: ");
            }
            else {
                int result = x / y;
                System.out.println(result);
            }
        }
        catch(Exception er){
            System.out.println("Invalid input: " + er);
        }
    }
}




//-----Ducking vs handling an Exception, 'throws keyword'------//
//class Demo{
//    public void a() throws Exception {
//        b();
//    }
//    public void b() throws Exception{
//        int x=6;
//        int y=0;
//        int result=x/y;
//        System.out.println(result);
//    }
//}
//
//public class ExceptionHandling1 {
//    public static void main(String[] args) {
//        Demo demo = new Demo();
//
//        try {
//            demo.b();
//        }
//        catch (Exception e) {
//            System.out.println("Error: " + e.getMessage());
//        }
//    }
//}
