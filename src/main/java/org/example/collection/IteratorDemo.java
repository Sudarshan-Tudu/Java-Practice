package org.example.collection;

import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList arr3 = new ArrayList();
        arr3.add(25);
        arr3.add(15);
        arr3.add(50);
        arr3.add(10);

        Iterator itr = arr3.iterator();
        while (itr.hasNext()){
            int o=(int) itr.next();
            System.out.println(o);
        }

        //ListIterator for print in reverse
        ListIterator litr = arr3.listIterator(arr3.size());
        while (litr.hasPrevious()){
            System.out.println(litr.previous());
        }



//        //for loop
//        for(int i=0; i<arr3.size(); i++){
//            Object o= arr3.get(i);
//            //System.out.println(o);
//        }
//        System.out.println("-----------------");

//        //for-each loop
//        for(Object o:arr3){
//            //System.out.println(o);
//        }
//        int arr [][] = {
//                {2,5,7,9},
//                {4,7,0},
//                {2,3},
//                {2,5,7,9,8}
//        };
//        for(int a[]:arr){
//            for(int b:a){
//                System.out.print(b + " ");
//            }
//            System.out.println();
//        }
    }
}
