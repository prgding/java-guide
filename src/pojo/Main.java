package pojo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.invoke.VarHandle;

public class Main {
    public static void main(String[] args) throws Exception {
        Person person = new Person();
        Car car = new Car();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("person.txt"));
        objectOutputStream.writeObject(person);
        objectOutputStream.writeObject(car);
        objectOutputStream.flush();
        objectOutputStream.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.txt"));
        Object o = ois.readObject();
        System.out.println(o);
        ois.close();
    }
}
