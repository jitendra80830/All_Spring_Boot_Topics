package streamApi;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ByLengthString {
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

        list.stream().sorted(Comparator.comparing(String::toString).thenComparing(String::length)).forEach(n -> System.out.print(n+" "));
        System.out.println();
        List<String> collect = list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(collect);
    }
}
