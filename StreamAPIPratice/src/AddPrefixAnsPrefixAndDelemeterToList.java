import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AddPrefixAnsPrefixAndDelemeterToList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java", "Python", "C", "C++", "C#");
        String s = list.stream().collect(Collectors.joining(",", "[", "]"));
        System.out.println(s);
    }
}
