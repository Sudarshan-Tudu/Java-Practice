package org.example.map;
import java.util.*;

public class HashT {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        //Descending Sorted Order ,Null value/key not acceptable,
        ht.put(2, "Suda");
        ht.put(3, "Tudu");
        ht.put(1, "Bir");
        ht.put(5,"Darshan");
        ht.put(0,"Mitali");
        ht.putIfAbsent(6,"Ball");
        ht.putIfAbsent(2, "Suda");
        //ht.put(1, null);
        System.out.println(ht);

        TreeMap tm = new TreeMap();
        //Ascending Sorted Order, Null value/key not acceptable,
        tm.put(2, "Suda");
        tm.put(3, "Tudu");
        tm.put(1, "Bir");
        tm.put(5,"Darshan");
        tm.put(0,"Mitali");
        System.out.println(tm);
    }
}
