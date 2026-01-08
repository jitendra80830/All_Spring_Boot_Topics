package streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvenOrOdd {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 2, 4, 5, 6, 7, 8, 9, 1);
      list.stream().forEach(n -> System.out.println(n+" is "+((n%2==0)?"Even":"Odd")));
    }
}
