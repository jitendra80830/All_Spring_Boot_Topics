package streamApi.realObjectBase;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, 50000, "Amit", "Sharma"),
                new Employee(2, 70000, "Raj", "Verma"),
                new Employee(3, 40000, "Suresh", "Yadav"),
                new Employee(4, 70000, "Deepak", "Mishra"),
                new Employee(5, 60000, "Ankit", "Singh")
        );

       List<Employee> slary =  employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).toList();
        //System.out.println(slary);

        List<Employee> list = employees.stream().sorted((a, b) -> Double.compare(a.getSalary(), b.getSalary())).toList();
       // System.out.println(list);

        List<Employee> list1 = employees.stream().sorted((a, b) -> b.getFirstName().compareTo(a.getFirstName())).toList();
       // System.out.println(list1);

        Optional<Employee> first = employees.stream().sorted(Comparator.comparing(Employee::getSalary)).skip(2).findFirst();
        //System.out.println(first.get());


        List<Integer> list2 = Arrays.asList(2, 3, 4, 6, 7, 8);
        list2.stream().forEach(System.out::println);
        list2.stream().forEach(System.out::println);


    }
}
