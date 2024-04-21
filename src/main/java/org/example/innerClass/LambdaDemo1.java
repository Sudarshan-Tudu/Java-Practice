package org.example.innerClass;

import java.util.*;

interface Human{
    void eat(String name);
}

public class LambdaDemo1 {
    public static void main(String[] args) {
//        Human h = new Human() {
//            @Override
//            public void eat() {
//                System.out.println("Human eat");
//            }
//        };

        //Human hu = ()-> System.out.println();

        Human h1 = a-> System.out.println("Human name: " + a);

        Human h = b-> System.out.println(b);
        h.eat("S");

        h1.eat("Sudarshan");

    }
}
