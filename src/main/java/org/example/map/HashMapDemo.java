package org.example.map;
import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        //Hashtable ht = new Hashtable();
        LinkedHashMap lhm = new LinkedHashMap();
        //TreeMap tm = new TreeMap();

        HashMap hm1 = new HashMap();
        hm1.put(01,"Suda");
        hm1.put(02,"Mita");
        hm1.put(03,10);
        hm1.put("Tudu","Mitali");
        System.out.println(hm1);

        HashMap hm2 = new HashMap();
        hm2.put("Sudarshan", "Tudu");
        hm2.put("Mitali", "Tudu");
        hm2.put("Birbal", "Tudu");
        System.out.println(hm2);

        //LinkedHashMap(Sub-Class of HashMap): to maintain the order of insertion.
        lhm.put("Sudarshan", "Tudu");
        lhm.put("Mitali", "Tudu");
        lhm.put("Birbal", "Tudu");
        System.out.println(lhm);
    }
}
