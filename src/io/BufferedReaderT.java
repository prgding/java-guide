package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintStream;
import java.lang.invoke.VarHandle;

public class BufferedReaderT {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new FileReader("/Users/dingshuai/Dev/Code/Java/01-JavaSE/java-guide/src/pojo/Main1.java"));
        String line = reader.readLine();
        while (line != null) {
            System.out.println(line);
            line = reader.readLine();
        }
    }
}
