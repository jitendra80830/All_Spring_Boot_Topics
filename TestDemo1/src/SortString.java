import java.util.*;

public class SortString {
    public static void main(String[] args) {
        String[] valuesTray1 = {"apple", "pear", "banana", "kiwi", "peach", "apricot"};
        List<String>  bb = Arrays.asList(valuesTray1);
        List<String> valuesTray = Arrays.asList("apple", "pear", "banana", "kiwi", "peach", "apricot");
        //Arrays.stream(valuesTray)
        Comparator<String> comparator = Comparator.comparingInt(String::length)
        .thenComparing(Comparator.naturalOrder());
        valuesTray.stream()
        .sorted(comparator).forEach(System.out::println);
        //sortString(valuesTray);
    }

   /* private static void sortString(String[] valuesTray) {
        List<String> list  = new ArrayList<>();
        for(String str : valuesTray){
            list.add(str);
        }
        Collections.sort(list , new Comparator<>() {

            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(list);
    }*/
   // Comparator<String> comparator = Comparator.comparingInt(String::length)
    // .thenComparing(Comparator.naturalOrder());valuesTray.stream()
    // .sorted(comparator)        .forEach(System.out::println);
}
