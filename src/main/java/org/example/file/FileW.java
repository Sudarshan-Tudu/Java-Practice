package org.example.file;
import java.io.*;

public class FileW {
    public static void main(String[] args) throws IOException {
        File dir = new File("JAVA");
        //System.out.println(f.isDirectory());
        File f = new File(dir,"java.txt");
        //System.out.println(f1.isFile());

        FileWriter fw = new FileWriter(f,true);

        fw.write("Hello");
        fw.write("\n");
        fw.write(50);
        fw.write("\n");
        fw.write('S');
        fw.write("\n");
        fw.write('T');
        fw.write("\n");
        char ch [] = {'T', 'U', 'D', 'U'};
        fw.write(ch);
        fw.write("\n");
        fw.close(); //fw.flush();
    }
}
