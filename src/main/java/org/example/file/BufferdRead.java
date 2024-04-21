package org.example.file;

import java.io.*;

public class BufferdRead {
    public static void main(String[] args) throws IOException {
        File dir = new File("JAVA");
        File file = new File(dir,"java.txt");

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        String line =br.readLine();
        while(line != null){
            System.out.println(line);
            line = br.readLine();
        }
    }
}
