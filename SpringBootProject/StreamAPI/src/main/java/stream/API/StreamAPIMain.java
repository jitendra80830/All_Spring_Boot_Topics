package stream.API;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPIMain {
    public static void main(String[] args) {

        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(11);
        myList.add(12);
        myList.add(13);
        myList.add(15);
        myList.add(2);
        myList.add(1);
        //myList.add(0);

        System.out.println("Original List: " + myList);

        //obtain the stream to the arraylist
        Stream<Integer> integerStream = myList.stream();
        Optional<Integer> minVal = integerStream.min(Integer::compare);
        if (minVal.isPresent()) {
            System.out.println("Min Value " + minVal.get());
        }

        integerStream = myList.stream();
        Optional<Integer> maxVal = integerStream.max(Integer::compare);

        if (maxVal.isPresent()) {
            System.out.println("Max Value " + maxVal.get());
        }

        Stream<Integer> sorted = myList.stream().sorted();

        sorted.forEach((n) -> System.out.println("Sorted Steam " + n));
        //sorted.forEach((n) -> System.out.println(n));

        Stream<Integer> filterStream = myList.stream().sorted().filter((n) -> (n % 2) == 1);
        Stream<Integer> stream2 = myList.stream();
        Stream<Integer> integerStream2 = stream2.sorted().filter((n) -> (n % 2 == 0));
        //integerStream2.forEach((n) -> System.out.println(n));
        //List<Integer> collect3 = integerStream2.collect(Collectors.toList());

        List<Integer> collect = filterStream.collect(Collectors.toList());
        collect.forEach((n) -> System.out.println(n));
        //sorted.close();

        //Display odd and >5
        System.out.println("Display odd and >5");
        Stream<Integer> integerStream1 = myList.stream().filter((n) -> (n % 2) == 1).filter((n) -> n > 5);
        integerStream1.forEach((n) -> System.out.println(n));

        //Use of reduce
        Optional<Integer> optional = myList.stream().reduce((a, b) -> a * b);

        if (optional.isPresent()) {
            System.out.println("Reduce " + optional.get());
        }
        Integer reduceInteger = myList.stream().reduce(1, (a, b) -> a * b);

        Integer reduce2 = myList.stream().reduce(1, (a, b) -> {
            if (b % 2 == 0) return a * b;
            else return a;
        });
        System.out.println("reduce2 " + reduce2);

        //Map
        ArrayList<Double> newMyList = new ArrayList<>();
        newMyList.add(8.1);
        newMyList.add(8.1);
        newMyList.add(2.3);
        newMyList.add(9.1);
        Stream<Double> aDouble = newMyList.stream().map((a) -> Math.sqrt(a));

        //Find Product of square root
        Double reduceDouble1 = aDouble.reduce(1.0, (a, b) -> a * b);

        System.out.println(" : " + reduceDouble1);

        //Here is an example that uses map( ) to create a new stream that contains only
        //selected fields from the original stream

        ArrayList<NamePhoneEmail> classList = new ArrayList<>();
        classList.add(new NamePhoneEmail("Jitendra", "1111111", "jitendra@gmail.com"));
        classList.add(new NamePhoneEmail("ram", "3333", "ram@gmail.ocm"));
        classList.add(new NamePhoneEmail("raj", "331133", "raj@gmail.ocm"));
        classList.add(new NamePhoneEmail("Jitendra", "331133343", "raj11@gmail.ocm"));

        System.out.println("Original lIst of class NamePhoneEmail: ");
        classList.stream().forEach((a) -> {
            System.out.println(a.name + " , " + a.phone + " , " + a.email);
        });
        System.out.println(".................................");
        //Map just the name nad phone to new stream
        Stream<NamePhone> namePhoneStream = classList.stream().map((a) -> new NamePhone(a.name, a.phone));

        //List of Name of phone number
        System.out.println("List of Name of phone number");
        namePhoneStream.forEach((a) ->
                System.out.println(a.name + " , " + a.phone)
        );

        // produce a new stream that contains only the name and phone
        //number of the elements with the name "jitendra":
        System.out.println("filter the elements with the name jitendra:");

        Stream<NamePhone> jitendra = classList.stream().filter((a) -> a.name.equals("Jitendra")).map((a) -> new NamePhone(a.name, a.phone));
        jitendra.forEach((a) -> System.out.println(a.name + " " + a.phone));


        System.out.print("Original List : ");
        newMyList.forEach((a) -> System.out.print(a + " "));
        System.out.println();
        // It then uses stream( ) followed by mapToInt( ) to create an
        //IntStream that contains the ceiling of each value.
        System.out.print("MapToInt List : ");
        IntStream mapToInt = newMyList.stream().mapToInt((a) -> (int) Math.ceil(a));
        mapToInt.forEach((a) -> System.out.print(a + " "));


        //Collecting
        //use collect to create list and a set from a stream.
        Stream<NamePhone> namePhoneStream1 = classList.stream().map((a) -> new NamePhone(a.name, a.phone));

        //Use collect to create list of name and phone
        System.out.println();
        System.out.println("namePhone list: ");

        List<NamePhone> collect1 = namePhoneStream1.collect(Collectors.toList());
        for (NamePhone namePhone : collect1) {
            System.out.println(namePhone.name + " " + namePhone.phone);
        }
        //namePhoneStream1.close();
        //Use collect to create set of name and phone
        Stream<NamePhone> namePhoneStream2 = classList.stream().map((a) -> new NamePhone(a.name, a.phone));
        System.out.println("Use collect to create set of name and phone");
        Set<NamePhone> namePhoneSet = namePhoneStream2.collect(Collectors.toSet());
        for (NamePhone namePhone : namePhoneSet) {
            System.out.println(namePhone.name + " " + namePhone.phone);
        }

        //Using the version of collect( ) just described, you could use a LinkedList as the
        //target in the preceding program, as shown here:

        Stream<NamePhone> namePhoneStream3 = classList.stream().map((a) -> new NamePhone(a.name, a.name));

        LinkedList<NamePhone> namePhoneLinkedList =
                namePhoneStream3.collect(
                        () -> new LinkedList<NamePhone>(),
                        (list, element) -> list.add(element),
                        (listA, ListB) -> listA.addAll(ListB));

        //e. For example, again assuming the preceding program, this
        //statement creates a Hash Set

        Stream<NamePhone> namePhoneStream4 = classList.stream().map((a) -> new NamePhone(a.name, a.phone));
        HashSet<Object> collect2 = namePhoneStream4.collect(HashSet::new, HashSet::add, HashSet::addAll);
        //collect2.forEach((a) -> System.out.println("collect2 "+a));

        ArrayList<String> newListString = new ArrayList<>();
        newListString.add("jItendra");
        newListString.add("Ram");
        newListString.add("Pan");
        newListString.add("Rakesh");

        Stream<String> stream = newListString.stream();
        Iterator<String> iterator = stream.iterator();

        while ((iterator.hasNext())) {
            System.out.println("iterator : " + iterator.next());
        }

        //Uses of Spliterator
        Stream<String> stream1 = newListString.stream();
        Spliterator<String> spliterator = stream1.spliterator();

        while (spliterator.tryAdvance((n) -> System.out.println(n))) ;

        Spliterator<String> spliterator1 = newListString.stream().spliterator();


        //split the first iterator
        Spliterator<String> stringSpliterator = spliterator1.trySplit();

        if (stringSpliterator != null) {
            System.out.println("");
            stringSpliterator.forEachRemaining((n) -> System.out.println("stringSpliterator " + n));
        }

        // Now use the spliterator1
        spliterator1.forEachRemaining((n) -> System.out.println("spliterator1 " + n));


        long count = newListString.stream().count();
        System.out.println("count " + count);


        List<String> list3 = new ArrayList<>();
        list3.add("abca");
        Set<Character> set = new HashSet<>();

        //List<String> collect3 = list3.stream().filter((n -> set.add(n.charAt())))

        //Find duplicate elements in a Stream
        List<Integer> integerList = Arrays.asList(2, 3, 4, 5, 5, 7, 8, 1, 2, 1);
        List<Integer> duplicateBySetAdd = findDuplicateBySetAdd(integerList);
        System.out.println("duplicateBySetAdd : ");
        duplicateBySetAdd.forEach((n) -> System.out.println(n));
        Set<Integer> duplicateByFrequency = findDuplicateByFrequency(integerList);
        System.out.println("findDuplicateByFrequency : ");
        duplicateByFrequency.forEach(n -> System.out.println(n));

        List<String> stringList = Arrays.asList("jitendra", "ram", "ram", "abc", "abc", "rat", "rat");

        Map<String, Long> collect3 = stringList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect3);

        String str1[] = {"a","b","c"};
        String str2[] = {"d","e","f"};

        StringJoiner stringJoiner = new StringJoiner(",");
        StringJoiner add = stringJoiner.add("abc").add("ddd").add("dddd");
        System.out.println(add);
        List<String> stringList2 = Arrays.asList("jitendra", "ram", "ram", "abc", "abc", "rat", "rat");
        String join = String.join(",", stringList2);
        System.out.println(join);
        String collect4 = stringList2.stream().collect(Collectors.joining(",","[", "]"));
        System.out.println(collect4);


    }

    private static Set<Integer> findDuplicateByFrequency(List<Integer> integerList) {
        Set<Integer> collect = integerList.stream().filter(i -> Collections.frequency(integerList, i) > 1).collect(Collectors.toSet());
        return collect;
    }

    private static List<Integer> findDuplicateBySetAdd(List<Integer> integerList) {

        Set<Integer> set = new HashSet<>();
        List<Integer> collect = integerList.stream().filter(n -> !set.add(n)).collect(Collectors.toList()); //// Set.add() returns false if the element was already in the set.
        return collect;

    }

}
