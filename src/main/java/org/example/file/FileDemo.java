package org.example.file;
import java.io.*;

public class FileDemo {
    public static void main(String[] args) throws IOException {

        File dir = new File("JAVA");
        //System.out.println(dir.isDirectory());
        dir.mkdir();
        System.out.println("File directory creation: " + dir.isDirectory());

        File file = new File(dir,"java.txt");
        //System.out.println(file.isFile());
        file.createNewFile();
        System.out.println("File creation: " + file.isFile());

    }
}
