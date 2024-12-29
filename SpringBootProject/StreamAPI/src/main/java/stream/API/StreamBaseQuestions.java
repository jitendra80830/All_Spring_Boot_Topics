package stream.API;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamBaseQuestions {
    public static void main(String[] args) {
        List<String> colour = Arrays.asList("Red", "White", "BLuE", "BlacK", "PinK");
        convertStringListIntoUpperAndLowerCase(colour);

        List<Integer> list = Arrays.asList(22, 3, 2, 12, 12, 2, 5, 5, 11);
        //Calculate Average of Integers using Streams
        average(list);
        printSumOfEvenAndOddNumberFromList(list);
        removeDuplicate(list);
        countStringsStartingwithSpecificLetter(colour);
        SortListOfStringsInAscendingAndDescendingOrder(colour);
        FindSecondSmallestAndLargestElements(list);
    }

    private static void FindSecondSmallestAndLargestElements(List<Integer> list) {
        Integer SecondSmallestElement = list.stream().distinct().sorted().skip(1).findFirst().orElse(null);
        System.out.println("SecondSmallestElement : "+SecondSmallestElement);


        Integer SecondLargestElement = list.stream().
                distinct().
                sorted((a, b) -> Integer.compare(b, a)).
                skip(1).
                findFirst().
                orElse(null);
        System.out.println("SecondLargestElement : "+SecondLargestElement);

    }

    private static void SortListOfStringsInAscendingAndDescendingOrder(List<String> colour) {
        List<String> collect = colour.stream().sorted().collect(Collectors.toList());
        collect.forEach(s -> System.out.println("Ascending : "+s));
        List<String> descendingOrder = colour.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        descendingOrder.forEach(n -> System.out.println("DescendingOrder : "+n));
    }

    private static void countStringsStartingwithSpecificLetter(List<String> colour) {

        char startLetter  ='B';
        long count = colour.stream().filter(s -> s.startsWith(String.valueOf(startLetter))).count();
        System.out.println("Count of Start with B Letters :"+count);
    }

    private static void removeDuplicate(List<Integer> list) {
        Stream<Integer> distinct = list.stream().distinct();
        distinct.forEach(n -> System.out.println("distinct : "+n));
    }

    private static void printSumOfEvenAndOddNumberFromList(List<Integer> list) {

        int sum = list.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println("Sum of even number: " + sum);
        int oddSum = list.stream().filter(n -> n % 2 != 0).mapToInt(Integer::intValue).sum();
        System.out.println("Sum Of odd number: "+oddSum);
    }

    private static void average(List<Integer> list) {
        double averageVal = list.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
        System.out.println("Average Val: " + averageVal);
    }

    private static void convertStringListIntoUpperAndLowerCase(List<String> colour) {

        List<String> collect = colour.stream().map(String::toUpperCase).collect(Collectors.toList());
        collect.forEach(n -> System.out.println(n));
        System.out.println("=======================");
        colour.stream().map(String::toLowerCase).
                collect(Collectors.toList()).
                forEach(n -> System.out.println(n));
    }
}
