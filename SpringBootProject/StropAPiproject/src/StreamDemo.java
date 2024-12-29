import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {

        List<Integer> list1 = List.of(2, 3, 4, 777, 8, 9, 9);
        // Arrays.asList(44,5,7,8,9,92);
        List newl = new ArrayList();
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) % 2 == 0) {
                newl.add(list1.get(i));
            }

        }
        System.out.println(newl);

        Stream<Integer> stream = list1.stream();

        List<Integer> list = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(list);

        List<Integer> collect = list1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);

        String[] list3 = {"jitendra", "Man", "Aman", "Rakesh", "Prakash"};
        Stream<String> stream1 = Stream.of(list3);
        stream1.forEach(e -> {
            System.out.println(e);
        });

        List<String> stringList = List.of("Jitendra", "Ramesh", "Prakash", "AMan", "Aman", "ARaj");
        List<String> stringList1 = stringList.stream().filter(i -> i.startsWith("A")).collect(Collectors.toList());

        Stream<List<String>> stringList11 = Stream.of(stringList1);
        stringList11.forEach(e -> {
            System.out.println(e);
        });

        List<Integer> integers = List.of(3, 4, 56, 6, 7, 8, 22, 33, 1, 55);

        List<Integer> integerList = integers.stream().map(i -> i * i).collect(Collectors.toList());
        integerList.forEach(e -> {
            System.out.println(e);
        });
        stringList.stream().forEach(e -> {
            System.out.println(e);
        });
        integerList.stream().forEach(System.out::println);
        integerList.stream().sorted().forEach(System.out::println);

    }
}
