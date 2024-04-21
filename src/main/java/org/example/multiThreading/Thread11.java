package org.example.multiThreading;
//interrupt() method: can't be executed when the code/task is in running, & it can be executed when the -
// code/task is in Block State (sleep(), wait(), ...)

class Demo implements Runnable{
    @Override
    public void run() {
        try {
            for (int i = 0; i < 3; i++) {
                System.out.println("Keep Focus on Your Goal");
                Thread.sleep(3000);
            }
        }
        catch (Exception e){
            System.out.println("Interrupting/Error: " + e);
        }
    }
}

public class Thread11 {
    public static void main(String[] args) {
        Demo demo = new Demo();

        Thread t1 = new Thread(demo);

        t1.start();
        t1.interrupt();

    }
}
