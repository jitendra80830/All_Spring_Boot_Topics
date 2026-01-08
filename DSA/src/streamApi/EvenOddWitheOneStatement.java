package streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvenOddWitheOneStatement {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2, 3, 5, 7, 9, 11, 22, 55);
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        list.stream().forEach(n -> System.out.println(n + " is " + (n % 2 == 0 ? "Even" : "Odd")));


    }
}
