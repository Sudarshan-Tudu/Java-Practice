package org.example.api;
//Custom Annotation
//Annotation is an Information/ Metadata. It could be applied on Class,Variable,Method,Field,Parameter or others
// -program to provide additional information about the element.
//It is used by Java Compiler/Runtime,
//
//TYPE is Class, FIELD is Instance Variable



//import java.lang.annotation.ElementType;
//import java.lang.annotation.Retention;
//import java.lang.annotation.RetentionPolicy;
//import java.lang.annotation.Target;
import java.lang.annotation.*;


@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface CricketPlayer{ //If no value passes, then it is Marker Interface also
    String country() default "India";
    int age() default 34;
}


@CricketPlayer(country = "India", age = 34)
class Virat{

    private int innings;
    //@CricketPlayer
    private int runs;

    @CricketPlayer(country = "India")
    public int getInnings() {
        return innings;
    }

    public void setInnings(int innings) {
        this.innings = innings;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }
}

//@Component
//class Car{
//    void drive(){
//        System.out.println("Driving with Car");
//    }
//}

public class AnnotationDemo1 {
    public static void main(String[] args) {
        Virat virat= new Virat();

        virat.setInnings(200);
        virat.setRuns(10000);
        System.out.println(virat.getInnings());
        System.out.println(virat.getRuns());

        //Reflection API: using it we can get the Custom/Annotation's values

        Class c =virat.getClass();
        Annotation a =c.getAnnotation(CricketPlayer.class);
        CricketPlayer cp = (CricketPlayer)a;
        System.out.println(cp);

        System.out.println(cp.country());
        System.out.println(cp.age());


    }
}
