package org.example.api;

//Enum: it is pre-defined name(/Set of Values/ Value ) constant, Enum class is under lang package,
//We can use enum to define a group of named constants.
//By using enum we can define our own data types which are also come Enumerated data types.
//Example: DAY NAME, WEEK, MONTH NAME, COLOUR, DIRECTIONS(N-S-E-W),..
//Object can't be created of Enum.

enum Week{
    MON, TUE, WED, THU, FRI, SAT, SUN
}

 class EnumDemo {
    //Enum can be defined also inside a Class.
    enum Result{
        PASS, FAIL, NOR
    }

    public static void main(String[] args) {

       Result result1 =Result.NOR;
        System.out.println(result1);


        Week w1 = Week.SAT;
        System.out.println(w1);
        int index = w1.ordinal();
        System.out.println(index);

       Week weeks [] =Week.values();
       for(Week w :weeks) {
           System.out.println(w + ":--" + w.ordinal());
       }
    }
}
