import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(7);
        list.add(3);
        list.add(9);
        list.add(1);
        list.add(11);
        list.add(16);
        List<Integer> ans = list.stream().filter(n -> n %2 == 0).collect(Collectors.toList());
        int an = 0;
        List<Integer> an3 = new ArrayList<>();
        list.stream().forEach({


                
        });
        System.out.println(ans);

    }
}
