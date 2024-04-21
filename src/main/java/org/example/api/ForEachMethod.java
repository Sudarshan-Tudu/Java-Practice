package org.example.api;
import java.util.*;
import java.util.function.Consumer;

public class ForEachMethod {
    public static void main(String[] args) {
        List list1 = new ArrayList();
        list1.add(1);
        list1.add(3);
        list1.add(4);
        System.out.println(list1);

        List<Integer> list2 = Arrays.asList(2,5,6,8,9);
        System.out.println(list2);

//forEach() method is method of Consumer Interface(Functional Interface)

//        Consumer<Integer> cons = new Consumer<Integer>() {
//            @Override
//            public void accept(Integer i) {
//                System.out.print(i + " ");
//            }
//        };

           //Consumer<Integer> cons = i -> System.out.print(i + " ");


        list1.forEach( o-> System.out.print(o + " ")
//                new Consumer() {
//                    @Override
//                    public void accept(Object o) {
//                        System.out.print(o + " ");
//                    }
//                }

        );

        System.out.println();

        list2.forEach(i-> System.out.print(i + " ")); //Need to give the implementation of Consumer Functional Interface.
    }
}
