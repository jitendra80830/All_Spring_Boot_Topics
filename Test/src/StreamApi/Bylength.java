package StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Bylength {
public static void main(String[] args) {
	List<String> list=new ArrayList<>();
	
	list.add("java");
	list.add("is");
	list.add("and ");
	list.add("a");
	list.add("arogramming");
	list.add("language");
	list.add("and ");
	list.add("secure");
	
	List<String> collect = list.stream().sorted().collect(Collectors.toList());
	System.out.println(collect);
	List<String> collect1 = list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
	System.out.println(collect1);
	list.stream().sorted(Comparator.comparing(String::toString).thenComparing(String::length)).forEach(n -> System.out.println(n));
	
}
}
