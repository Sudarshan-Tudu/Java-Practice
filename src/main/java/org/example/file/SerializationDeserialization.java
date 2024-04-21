package org.example.file;
import java.io.*;

//We use Serialization in data with converting in binary form(sequence of bytes) to make our data secure and make available in other network.
class Student implements Serializable{ //Serializable Interface is Marker Interface, it has zero abstract method
    private String name;
     private int age;
    private int marks;

    public Student(String name, int age, int marks){
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
    public void show(){
        System.out.println(name + " " + age + " " + marks);
    }
}
public class SerializationDeserialization {
    public static void main(String[] args) throws Exception {
//        Student student = new Student("Sudarshan",26,76);
//        student.show();

//----------De-serialization-------------------//
        FileInputStream fis = new FileInputStream("C:\\\\Users\\\\SUDARSHAN TUDU\\\\Desktop\\\\Test\\\\JAVA\\\\java.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student st =(Student) ois.readObject();
        st.show();
        //((Student) ois.readObject()).show();




//----------Serialization-------------------//
//        FileOutputStream fos = new FileOutputStream("C:\\Users\\SUDARSHAN TUDU\\Desktop\\Test\\JAVA\\java.txt");
//        BufferedOutputStream bos = new BufferedOutputStream(fos);
//        ObjectOutputStream oos = new ObjectOutputStream(bos);
//
//        oos.writeObject(student);
//        oos.flush();
//        oos.close();
    }
}
