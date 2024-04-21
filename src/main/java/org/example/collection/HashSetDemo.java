package org.example.collection;

import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add(30);
        hs.add(50);
        hs.add(10);
        hs.add(100);
        hs.add(60);
        System.out.println(hs);

//LinkedHashSet(Syb-Class of HashSet): for follow the Insertion Order
        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add(30);
        lhs.add(50);
        lhs.add(10);
        lhs.add(100);
        lhs.add(60);
        System.out.println(lhs);
    }
}
