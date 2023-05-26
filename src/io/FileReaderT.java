package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderT {
    public static void main(String[] args) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("output.txt");
            char[] buffer = new char[1024];
            int cnt;
            while ((cnt = fileReader.read(buffer)) != -1) {
                System.out.println(new String(buffer, 0, cnt));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
