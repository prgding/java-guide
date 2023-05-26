package io;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class FileT {
    public static void main(String[] args) {
        File file = new File("/Users/dingshuai/abc.txt");
        System.out.println(file.exists());
    }
}
