package streamApi;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class JavaTechieJava8 {
    public static void main(String[] args) {

        ///occurence of each character in string
        String input="ilovejavatechie";
        //String[] split = input.split("");
        Map<String, Long> collect =
                Arrays.stream(input.split("")).
                        collect(Collectors.groupingBy(s->s, Collectors.counting()));
        System.out.println(collect);


        ///find all duplicate string from string;
        List<String> duplicate = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(duplicate);

        //unique
        List<String> unique = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
                .stream().filter(x -> x.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(unique);

        /// First non repeated element from the string

        Map.Entry<String, Long> firstnonReapeat = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting())).entrySet()
                .stream().filter(x -> x.getValue() == 1).findFirst().get();
        System.out.println(firstnonReapeat);

        //first repeated character
        Map.Entry<String, Long> firstReapeat = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting())).entrySet()
                .stream().filter(x -> x.getValue()>1).findFirst().get();
        System.out.println(firstReapeat);

        /// second higest number from an given array
        int[]num={5,9,11,2,8,21,1,11,2,11};
        Integer SecondHighest = Arrays.stream(num).boxed().sorted(Comparator.reverseOrder()).skip(1).distinct()
                .findFirst().get();
        System.out.println(SecondHighest);

        //Highest Frequency Means come max time
//        List<Integer> maxtimeoccur = Arrays.stream(num).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//                .entrySet().stream().max(Map.Entry.comparingByValue()).
//                stream().
//                map(Map.Entry::getKey).
//                collect(Collectors.toList());
//        System.out.println(maxtimeoccur);

        /// find Longest String from given Array
           String[] name={"kishor","naveenUpadhaya","tomar","ram","sarvapalliradhakrishna"};
        String longestString = Arrays.stream(name).reduce((o1, o2) -> o1.length() > o2.length() ? o1 : o2).get();
        System.out.println(longestString);

        //find element start with 1
        List<String> startwith1 = Arrays.stream(num).boxed().map(s -> s + "").filter(e -> e.startsWith("1")).collect(Collectors.toList());
        System.out.println(startwith1);

        //string join method
        List<String> strings = List.of("10", "20", "30", "40");
        String join = String.join("-", strings);
        System.out.println(join);

        //print number using java 8
        IntStream.range(1,10).skip(1).limit(8).forEach(System.out::print);

    }
}
