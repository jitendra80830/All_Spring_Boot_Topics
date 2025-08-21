import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class REverseOrder {
    public static void main(String[] args) {
        List<Double> list = Arrays.asList(11.2, 33.1, 22.3, 11.1, 98.6, 3.1);
        List<Double> collect = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(collect);
    }
}
