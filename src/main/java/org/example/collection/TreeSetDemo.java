package org.example.collection;

import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add(50);
        ts.add(200);
        ts.add(30);
        ts.add(10);
        ts.add(100);
        ts.add(150);
        ts.add(80);
        System.out.println(ts);
        System.out.println(ts.higher(50));
        System.out.println(ts.lower(50));
        System.out.println("----------------------");

        System.out.println(ts.higher(40));
        System.out.println(ts.lower(40));
        System.out.println("----------------------");

        System.out.println(ts.ceiling(40));
        System.out.println(ts.floor(40));
        System.out.println("----------------------");

        System.out.println(ts.ceiling(50));
        System.out.println(ts.floor(50));
    }
}
