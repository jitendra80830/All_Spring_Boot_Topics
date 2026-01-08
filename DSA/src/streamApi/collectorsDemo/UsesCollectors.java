package streamApi.collectorsDemo;

import java.util.*;
import java.util.stream.Collectors;

public class UsesCollectors {
    public static void main(String[] args) {

        //toList
        List<String> names = Arrays.asList("John", "Alice", "Bob");

        List<String> ans = names.stream().filter( n -> n.startsWith("A")).collect(Collectors.toList());
        System.out.println(ans);


        //toSet
        List<Integer> nums = Arrays.asList(1, 2, 2, 3);
        Set<Integer> removedDuplicate = nums.stream().collect(Collectors.toSet());
        System.out.println(removedDuplicate);

        //toMap
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        Map<String , Integer> map = words.stream().collect(Collectors.toMap(n -> n , String::length));
        System.out.println(map);

        //joining()

        String join = names.stream().collect(Collectors.joining(","));
        System.out.println(join);

        //counting()
        Long count = names.stream().collect(Collectors.counting());
        System.out.println(count);


        //summarizingInt() / summarizingDouble() / summarizingLong()

        IntSummaryStatistics ssum = nums.stream().collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println("max = "+ssum.getMax()+", sum = "+ssum.getSum()+" , min = "+ssum.getMin()+" , eve = "+ssum.getAverage());
        System.out.println(ssum.getCount());


        //averagingInt() / averagingDouble() / averagingLong()

        Double av = nums.stream().collect(Collectors.averagingInt(Integer::intValue));
        System.out.println(av);

        //summingInt() / summingDouble() / summingLong()
        Integer suming = nums.stream().collect(Collectors.summingInt(Integer::intValue));
        System.out.println(suming);

        //groupingBy(classifier)
        List<String> items = Arrays.asList("apple", "banana", "cherry", "apricot");
        Map<Character, List<String>> gorouping = items.stream().collect(Collectors.groupingBy(n -> n.charAt(0)));
        System.out.println(gorouping);

        //partitioningBy(Predicate)
        Map<Boolean, List<Integer>> partitioning = nums.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println(partitioning);

        //collectingAndThen(collector, finisher)
        List<String> collect = names.stream().collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));
        System.out.println(collect);

    }
}
