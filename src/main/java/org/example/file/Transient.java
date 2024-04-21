package org.example.file;
import java.io.*;

// We use Transient for Selective Serialization

class Student1 implements Serializable{
    private String name;
    transient private int age;
    private int marks;

    public Student1(String name, int age, int marks){
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
    public void show(){
        System.out.println(name + " " + age + " " + marks);
    }
}

public class Transient {
    public static void main(String[] args) throws Exception {
//        Student1 st1 = new Student1("Mitali",21,75);
//        st1.show();

//----------De-serialization-------------------//
        FileInputStream fis = new FileInputStream("C:\\\\Users\\\\SUDARSHAN TUDU\\\\Desktop\\\\Test\\\\JAVA\\\\java.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student1 s =(Student1) ois.readObject();
        s.show();
        //((Student) ois.readObject()).show();




//----------Serialization-------------------//
//        FileOutputStream fos = new FileOutputStream("C:\\Users\\SUDARSHAN TUDU\\Desktop\\Test\\JAVA\\java.txt");
//        BufferedOutputStream bos = new BufferedOutputStream(fos);
//        ObjectOutputStream oos = new ObjectOutputStream(bos);
//
//        oos.writeObject(st1);
//        oos.flush();
//        oos.close();
    }
}
