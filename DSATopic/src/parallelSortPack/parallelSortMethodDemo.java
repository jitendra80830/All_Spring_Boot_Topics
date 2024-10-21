package parallelSortPack;

import java.util.Arrays;
import java.util.stream.IntStream;

public class parallelSortMethodDemo {
    public static void main(String[] args) {
        int number[] = {3,5,1,0,6,4,9,7,6};

        System.out.println("UnSorted Array: ");

        IntStream intStream = Arrays.stream(number);

        intStream.forEach((n) -> System.out.print(n+" , "));
        System.out.println();

        Arrays.parallelSort(number);
        System.out.println("Sorted Array: ");


        Arrays.stream(number).forEach((n) -> System.out.print(n+" , "));


    }
}
