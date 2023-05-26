package io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterT {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("output.txt", false);
            fileWriter.write("hello");
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
