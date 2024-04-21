package org.example.api;

enum Result{
    PASS, FAIL, NR; //These are constants,
    //Behind the scene
    //public static final Result PASS = new Result();
    //public static final Result FAIL = new Result();
    //public static final Result NR = new Result();

    int marks;

    Result(){
        System.out.println("Constructor in Enum");
    }

     void setMarks(int marks){
        this.marks=marks;
    }

     int getMarks(){
        return this.marks;
    }

}

public class EnumDemo1 {
    public static void main(String[] args) {

        Result.PASS.setMarks(50);
        int marks1 = Result.PASS.getMarks();
        System.out.println(marks1);

        int marks2 = Result.FAIL.getMarks();

        System.out.println(marks2);

        Result.NR.setMarks(45);
        int marks3 = Result.NR.getMarks();
        System.out.println(marks3);

    }
}
