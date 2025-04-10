package String;

public class ObjectToLitral {
    public static void main(String[] args) {
        String s1 = "jitendra";
        String s2 = new String("kumar");

        s1 = s2;
        System.out.println(s1);
    }
}
