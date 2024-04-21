package org.example.collectionsClass;
import java.util.*;

public class CollectionsClass {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(50);
        arr.add(100);
        arr.add(20);
        arr.add(5);
        arr.add(20);

        ArrayList<String> arr1 = new ArrayList<String>();
        arr1.add("ST");
        arr1.add("BT");
        arr1.add("MT");

//Collections is a Class, it has Static Methods, and using those methods we can manipulate the data and logic
        Collections.sort(arr);
        System.out.println(arr);

        System.out.println(Collections.frequency(arr,20));

        Collections.sort(arr1);
        System.out.println(arr1);

        System.out.println(Collections.binarySearch(arr1, "MT"));
    }
}
