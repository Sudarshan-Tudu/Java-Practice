package org.example.file;
import java.io.*;

public class FileR {
    public static void main(String[] args) throws IOException {
        File dir = new File("JAVA");
        File f = new File(dir,"java.txt");

        FileReader fd = new FileReader(f);

        char ch[] = new char[(int)f.length()];
        fd.read(ch);

        for(char data:ch){
            System.out.print(data);
        }


//This below process is not acceptable for large amount of data
//        int i = fd.read();
//        while(i!=-1){
//            System.out.print(i + "--->");
//            System.out.println((char)i);
//            i = fd.read();  //How fileReader() method work ??
//        }
    }
}
