package ByteArrayInputStream;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOuputStreamDemo {
    public static void main(String[] args) throws IOException {
        String message = "This is my laptop";
        byte[] bytes = message.getBytes();

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        bos.write(bytes);
        System.out.println(bos.toString());

    }
}
