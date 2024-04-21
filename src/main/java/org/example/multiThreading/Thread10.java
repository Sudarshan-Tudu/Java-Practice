package org.example.multiThreading;
//Dead Lock: happened here, cause of mutual dependencies of two users, & for this code will be stuck in Blocked State forever, & code can't be executed.

class Library implements Runnable{
    String res1 = new String("JAVA");
    String res2 = new String("SQL");
    String res3 = new String("DSA");

    @Override
    public void run() {
        String name = Thread.currentThread().getName();

        try{
            if (name.equals("STUDENT-1")){
                Thread.sleep(3000);
                synchronized (res1) {
                    System.out.println("STUDENT-1 has acquired book: " + res1);

                    Thread.sleep(3000);
                    synchronized (res2){
                        System.out.println("STUDENT-1 has acquired book: " + res2);

                        Thread.sleep(3000);
                        synchronized (res3){
                            System.out.println("STUDENT-1 has acquired book: " + res3);
                        }
                    }
                }
            }
            else {
                Thread.sleep(3000);
                synchronized (res3) {
                    System.out.println("STUDENT-2 has acquired book: " + res3);

                    Thread.sleep(3000);
                    synchronized (res2){
                        System.out.println("STUDENT-2 has acquired book: " + res2);

                        Thread.sleep(3000);
                        synchronized (res1){
                            System.out.println("STUDENT-2 has acquired book: " + res1);
                        }
                    }
                }
            }
        }
        catch (Exception e){
            System.out.println("Error: " + e);
        }
    }
}

public class Thread10 {
    public static void main(String[] args) {
        Library library = new Library();

        Thread t1 = new Thread(library);
        Thread t2 = new Thread(library);

        t1.setName("STUDENT-1");
        t2.setName("STUDENT-2");

        t1.start();
        t2.start();
    }
}
