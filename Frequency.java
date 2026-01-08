package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Frequency {
    public static void main(String[] args) {
        String str = "My name is jitendra kumar";
        List<String> list = Arrays.asList("Java","C","python0","Java","Python","C","C#","ReactJs");
       frequencyCharacter(str);
        frequencyElementFromArray(list);
    }

    private static void frequencyCharacter(String str) {
        Map<Character, Long> collect = str.chars().mapToObj(n -> (char) n).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
    }

    private static void frequencyElementFromArray(List<String> list) {
        Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);



    }
}
