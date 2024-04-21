package org.example;

interface Animal {
    void eat();
    void walk();
}

class Tiger implements Animal {
    @Override
    public void eat() {
        System.out.println("Tiger eat");
    }
    @Override
    public void walk() {
        System.out.println("Tiger walk");
    }
    public void sleep(){
        System.out.println("Tiger sleep");
    }
}

class Monkey implements Animal {
    public void eat() {
        System.out.println("Monkey eat");
    }
    public void walk() {
        System.out.println("Monkey walk");
    }
}

class Jungle{
    void poly(Animal animal){
        animal.eat();
        animal.walk();
        System.out.println("----------------------------------------------");
    }
}

public class Polymorphisom {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Monkey monkey = new Monkey();
        Jungle jungle = new Jungle();
        jungle.poly(monkey);
        jungle.poly(tiger);
        tiger.sleep();
    }
}