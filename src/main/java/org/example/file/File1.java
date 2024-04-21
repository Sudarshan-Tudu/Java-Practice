package org.example.file;
import java.io.*;

public class File1 {
    public static void main(String[] args) {
        File file1 = new File("C:\\Users\\SUDARSHAN TUDU\\Desktop\\SQL");
        System.out.println(file1.isDirectory());

        int count=0;

        String[] str = file1.list();

        for (String s: str){
            count++;
            System.out.println("In 'SQL' path directory, Files are: " + s);
        }
        System.out.println("Count of file in Directory 'SQL'" + count);
    }
}
