package org.example.innerClass;


interface Carr{ //interface is just a concept
    void drive();
    void run();
}

//class WagonR implements Carr{ // This class's purpose is only implementing the Interface, it could be Anonymous Inner Class of Interface
//    public void drive(){
//        System.out.println("Driving in WagonR");
//    }
//}


//Lambda Expression work only on Functional Interface.
public class AnonymousClass {
    public static void main(String[] args) {

        Carr anno = new Carr()  //Look, Carr is an Interface, and it is look like an Object,
           // This is Anonymous Inner Class(Outer Class of it --> AnonymousClass), & the Object is of it(Anonymous Inner Class).
         //This class has no name, that's why it's Anonymous. This class's purpose is only implementing the Interface
        {
            public void drive(){
                System.out.println("Driving in anno");
            }

            public void run(){
                System.out.println("Running in anno");
            }
        };
        anno.drive();
        anno.run();

//       Carr wagonR =new WagonR();
//       wagonR.drive();
    }
}
