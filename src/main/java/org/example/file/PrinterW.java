package org.example.file;

import java.io.*;

public class PrinterW {
    public static void main(String[] args) throws IOException {
        File dir = new File("JAVA");
        File f = new File(dir,"java.txt");

        PrintWriter pw = new PrintWriter(f);
        pw.print(120);
        pw.println('c');
        pw.println("str");
        pw.println(true);
        pw.println(2.5);
        char ch []={'T','U','D','U'};
        pw.flush();
        pw.close();
    }
}
