package org.example.file;

import java.io.*;

public class BufferdWrite {
    public static void main(String[] args) throws IOException {
        File dir = new File("JAVA");
        File f = new File(dir,"java.txt");
        FileWriter fw = new FileWriter(f);

        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(120);
        bw.newLine();
        bw.write("Hello!");
        bw.newLine();
        char ch [] = {'J', 'A', 'V', 'A'};
        bw.write(ch);
        bw.newLine();
        bw.flush();
        bw.close();
    }
}
