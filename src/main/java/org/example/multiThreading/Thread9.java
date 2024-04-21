package org.example.multiThreading;
//Synchronized keyword uses: when there is only one resource and multiple user want to use that resource simultaneously,
//It can be used on method & block of code,

class Car implements Runnable {
    @Override
    public void run() {
        try{
            System.out.println(Thread.currentThread().getName() + " Enter the parking area");
            Thread.sleep(2000);

            synchronized(this)
            {
                System.out.println(Thread.currentThread().getName() + " Take Car for drive");
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + " Driving the Car");
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + " Parked the Car in parking area");
            }
        }
        catch (Exception e){
            System.out.println("Error: " + e);
        }
    }
}

public class Thread9 {
    public static void main(String[] args) {
        Car c = new Car();

        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);
        Thread t3 = new Thread(c);

        t1.setName("SON-1");
        t2.setName("SON-2");
        t3.setName("SON-3");

        t1.start();
        t2.start();
        t3.start();
    }
}
