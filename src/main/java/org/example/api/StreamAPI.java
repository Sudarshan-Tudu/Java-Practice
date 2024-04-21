package org.example.api;

import java.util.*;
import java.util.stream.*;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,1,3,7,4);

//        We use Stream for keep intact(immutable) the actual collection of data, and we can use Stream only once at a time
//         System.out.println(list.stream());
//        You can't use/consume the Stream object twice,

        Stream<Integer> dataStream =list.stream();

//      dataStream.forEach(n-> System.out.print(n + " "));

//        Stream<Integer> fiterStream =dataStream.filter(n->n%2==0); //Filter method, filtering even nums
//
//        Stream<Integer> sortedStream=fiterStream.sorted(); //sorted method
//
//        Stream<Integer> map=sortedStream.map(n->n*2); //map method
//

        Stream<Integer> finalStream = dataStream.filter(n->n%2==0).sorted().map(n->n*2); //All operations in one line, as those method's return type is same, that is called method chaining.

        finalStream.forEach(i-> System.out.print(i + " "));


    }
}
