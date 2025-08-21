import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ByLength {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();

        list.add("java");
        list.add("is");
        list.add("and ");
        list.add("a");
        list.add("arogramming");
        list.add("language");
        list.add("and ");
        list.add("secure");
        list.add("javad");


        List<String> collect = list.stream().sorted(Comparator.comparing(String::toString).thenComparing(String::length)).collect(Collectors.toList());
        System.out.println(collect);
        List<String> collect1 = list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(collect1);
    }
}
