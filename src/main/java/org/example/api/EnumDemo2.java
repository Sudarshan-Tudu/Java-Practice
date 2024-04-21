package org.example.api;

enum Result1{
    PASS, FAIL, NR
}

public class EnumDemo2 {
    public static void main(String[] args) {
        Result1 result = Result1.FAIL;

        switch (result) {
            case PASS:
                System.out.println("Passed!");
                break;

            case NR:
                System.out.println("No Result!");
                break;
            case FAIL:
                System.out.println("Failed!");
                break;

        }
    }
}
