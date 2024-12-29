package SerializationAndDeserializationDemo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
    public static void main(String[] args) throws IOException {
        Student student = new Student("Jitendra Kumar", "jitendra@gmail.com", 22, "Noida");

        FileOutputStream fos = new FileOutputStream("obj.txt");

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        //how to serialize
        oos.writeObject(student);

        oos.close();
        fos.close();
        System.out.println("Object state transferred to file!!");
    }

}
