package streamApi;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InterviewJava8 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Hello", "world", "of", "Java", "!");

 //concatenate all string into a single string
        String reduce2 = strings.stream().reduce(" ",(s1,s2)->s1+" "+s2);
        System.out.println("concatenate all string into a single string :"+reduce2);
        
        StringBuilder sb=new StringBuilder();
        for(String s:strings) {
        	sb.append(s+" ");
        	
        }
        System.out.println("append a string :"+sb);
        
//find the second smallest number in the array.
        int[] numbers = {5, 8, 3, 12, 7, 9, 6};
        int first = Arrays.stream(numbers).distinct().sorted().skip(1).findFirst().orElse(Integer.MIN_VALUE);

        Optional<Integer> first1 = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(" second highest: "+first1);
        System.out.println(first1.get());

//find the average of squares of even numbers in the list.
        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        double avg = numbers1.stream().filter(i -> i % 2 == 0).mapToInt(n -> n * n).average().orElse(0);
        System.out.println("average of even numbers :"+avg);

//find the longest string in the list.
        List<String> strings1 = Arrays.asList("apple", "banana", "orange", "grapefruit", "kiwi");
        String s = strings1.stream().reduce((s1, s2) -> s1.length() > s2.length() ? s1 : s2).get();
        System.out.println("longest string in list :"+s);

//Question: Given an array of integers, count the number of occurrences of a specific element in the
        //array.

        int[] numbers2 = {2, 5, 3, 2, 8, 2, 4, 2};
        int target = 2;

        long count = Arrays.stream(numbers2).filter(n -> n == target).count();
        System.out.println(count);

        Map<Integer, Long> collect = Arrays.stream(numbers2).boxed().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        System.out.println(collect);

        //convert all strings to uppercase.
        List<String> words = Arrays.asList("apple", "banana", "orange", "grape");

        List<String> collect1 = words.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collect1);

        //find the maximum number in the array.
        int[] numbers3 = {5, 8, 3, 12, 7, 9, 6};

        int i = Arrays.stream(numbers3).distinct().max().orElse(Integer.MAX_VALUE);
        System.out.println(i);

        //find the sum of all even numbers in the list.

        List<Integer> numbers4 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = numbers4.stream().filter(e -> e % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println(sum);

    }
}

