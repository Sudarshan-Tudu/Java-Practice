package org.example.api;
//In-build Annotation,

@FunctionalInterface
interface Demo{
    void disp();
    //void show();
}

class Plane{
    void flies(){
        System.out.println("Plane flying");
    }
}

@Deprecated
class CargoPlane extends Plane {
    //@Override
    void flies(){
        System.out.println("Cargo Plane flying at low");
    }
}

public class AnnotationDemo {
    public static void main(String[] args) {
        Plane cargoPlane = new CargoPlane();
        cargoPlane.flies();

        Plane plane = new Plane();
        plane.flies();
    }
}
