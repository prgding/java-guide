package io;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("/Users/dingshuai/Downloads/buy.mov");
            fos = new FileOutputStream("this.mov");
            byte[] bytes = new byte[1024 * 1024];
            int count;
            while ((count = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, count);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
