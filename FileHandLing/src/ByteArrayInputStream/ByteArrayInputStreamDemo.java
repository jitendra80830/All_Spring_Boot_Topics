package ByteArrayInputStream;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamDemo {
    public static void main(String[] args) {
        String message = "My name is jitendra kumar";
        byte[] bytes = message.getBytes();

        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        int c = 0;
        while ((c = bis.read()) != -1) {
            System.out.print((char) c);
        }
    }
}
