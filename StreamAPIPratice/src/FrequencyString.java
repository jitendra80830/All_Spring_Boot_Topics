import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java","C","python0","Java","Python","C","C#","ReactJs");
        Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
    }
}
