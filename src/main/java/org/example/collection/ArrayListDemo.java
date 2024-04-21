package org.example.collection;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList arr1 = new ArrayList();
        arr1.add(10);
        arr1.add(20.5);
        arr1.add("Sudarshan");
        arr1.add('h');
        arr1.add(true);
        System.out.println(arr1);
        ArrayList arr2 = new ArrayList();
        arr2.add(56);
        arr2.addAll(arr1);
        System.out.println(arr2);
        arr2.add(2,800);
        System.out.println(arr2);

        System.out.println("--------------------------------------------------------");

    }
}
