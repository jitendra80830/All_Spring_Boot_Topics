package StringJoinerDemoTest;

import java.util.ArrayList;
import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Jitendra");
        list.add("Raaj");
        list.add("jhjdhjd");
        list.add("Rakesh");

        StringJoiner stringJoiner = new StringJoiner(",");
        stringJoiner.setEmptyValue("empty stringJoiner");
        System.out.println(stringJoiner);

        stringJoiner.add(list.get(0)).add(list.get(2));
        System.out.println(stringJoiner);

        System.out.println("stringJoiner length :" + stringJoiner.length());

        StringJoiner stringJoiner1 = new StringJoiner(":");

        stringJoiner1.add(list.get(2)).add(list.get(3));
        stringJoiner.merge(stringJoiner1);

        System.out.println(stringJoiner.toString());
        System.out.println("stringJoiner Length: " + stringJoiner.length());
    }
}
