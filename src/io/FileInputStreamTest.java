package io;

import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {
    public static void main(String[] args) {
        java.io.FileInputStream fis = null;
        try {
            fis = new java.io.FileInputStream("output.txt");
            byte[] bytes = new byte[10];
            int count;
            while ((count = fis.read(bytes)) != -1) {
                System.out.println(new String(bytes));
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
