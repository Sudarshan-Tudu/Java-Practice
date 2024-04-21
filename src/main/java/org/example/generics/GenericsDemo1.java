package org.example.generics;
import java.util.*;

class Gen<K>{
    K obj;
    public Gen(K obj){
        this.obj = obj;
    }
    public void show(){
        System.out.println("The Type is: " + obj.getClass().getName());
    }

    public K getObj(){
        return obj;
    }
}

public class GenericsDemo1 {
    public static void main(String[] args) {

        Gen<Integer> g = new Gen(20);
        g.show();
        System.out.println(g.getObj());

        System.out.println("------------------------");

        Gen<String> g1 = new Gen("Test");
        g1.show();
        System.out.println(g1.getObj());




        ArrayList<Integer> al = new ArrayList();

        List<Integer> al1 = new ArrayList();

        Collection<Integer> al2 = new ArrayList();

        List<String> al3 = new ArrayList();
    }
}
