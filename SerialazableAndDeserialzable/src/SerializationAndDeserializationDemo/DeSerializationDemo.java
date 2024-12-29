package SerializationAndDeserializationDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("obj.txt");

        ObjectInputStream ois = new ObjectInputStream(fis);

        Student student =(Student) ois.readObject();
        student.displayName();
    }
}
