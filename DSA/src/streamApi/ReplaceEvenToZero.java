package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReplaceEvenToZero {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 4, 5, 6, 7, 8, 1, 2, 8);
        List<Integer> even = list.stream().map(n -> n % 2 == 0 ? 0 : n).collect(Collectors.toList());
        System.out.println(even);
    }
}
