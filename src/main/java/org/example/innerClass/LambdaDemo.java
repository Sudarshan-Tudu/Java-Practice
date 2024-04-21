package org.example.innerClass;

@FunctionalInterface //Declaring as @FunctionalInterface for code safety
interface Car{   //interface is just a concept, like a Car
    void drive(int speed, int avgSpeed);
}

public class LambdaDemo {
    public static void main(String[] args) {
        Car car1 = (speed, avgSpeed)-> System.out.println("Driving Speed of Car1: " + speed + ", Avg Speed of Car1: " + avgSpeed);
        car1.drive(20,15);

        Car car2 = (a,b)-> System.out.println("Driving Speed of Car2: " + a + ", Avg Speed of Car2: " + b);
        car2.drive(40,35);

        car2.drive(60,55);
    }
}
