package org.example.innerClass;

//Inner Class: Member, Static, Anonymous,

class A {

    public void show() {
        System.out.println("in show--A");
    }

    class B { //This is Member Class or non-Static Class
        public void show() {
            System.out.println("in show--B");
        }
    }

    static class C{ //This is Static Class (Static Class work only in Inner Class)
        public void show(){
            System.out.println("in show-- C");
        }
    }
}

public class InnerClassPractice {
    public static void main(String [] args) {

        A obj = new A();

        A.B obj1 = obj.new B();

        A.C obj2 = new A.C();

        obj2.show();
        obj1.show();
        obj.show();


    }
}
