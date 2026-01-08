package streamApi;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;


public class java8 {
    public static void main(String[] args) {

        ArrayList<Employee> employee = new ArrayList<>();
        employee.add(new Employee(1, "kishor", 25, 25000, "IT"));
        employee.add(new Employee(2, "naveen", 26, 30000, "HR"));
        employee.add(new Employee(5, "manish", 40, 40000, "SALES"));
        employee.add(new Employee(3, "srishti", 42, 100000, "IT"));
        employee.add(new Employee(6, "mohit", 26, 10000, "SALES"));
        employee.add(new Employee(4, "mangal", 18, 3000, "HR"));

        //find nth salary using java 8
        Optional<Integer> first = employee.stream().map(e -> e.getSalary()).sorted(Comparator.reverseOrder()).
                skip(0).findFirst();
        System.out.println(first.get());


        //sum of two number
        BinaryOperator<Integer> add = (a, b) -> a + b;
        Integer apply = add.apply(2, 30);
        System.out.println(apply);

        //sum of list
        List<Integer> list = Arrays.asList(20, 10, 24, 15, 55);
        int sum = list.stream().mapToInt(e -> e).sum();
        System.out.println("Sum of list : " + sum);

        //distinct or unique element in arraylist
        List<Integer> number = Arrays.asList(20, 10, 24, 15, 55, 15, 20, 10);
        List<Integer> collect = number.stream().distinct().toList();
        System.out.println("unique element : " + collect);

        //find duplicate element in list
        List<Integer> number1 = Arrays.asList(20, 10, 24, 15, 55, 15, 20, 10);
        Set<Object> set = new HashSet<>();
        Set<Integer> collect1 = number1.stream().filter(e -> !set.add(e)).collect(Collectors.toSet());
        System.out.println("duplicate element : " + collect1);

        //example of functional interface
     /*   ExampleOfFunctionInterface interf=(a,b)->a+b;
        System.out.println("add through functional interface : "+interf.add(20,25));

        //example 2 of functional interface
        Example2OfFunctionalInterface mul=(a,b)->a*b;
        System.out.println("multiply using lambda expression :"+mul.multiply(15,4));*/

        //occurrence of word in string
        String str = "my name is kishor and kishor is very kind kishor";
        List<String> list1 = Arrays.asList(str.split(" "));
        Map<String, Long> collect2 = list1.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("occurence of word in string :" + collect2);

        //occurrence of character in string
        String name = "kishor kumar gautam";
        List<String> list2 = Arrays.asList(name.split(""));
        Map<String, Long> occurrenceOfCharacter = list2.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("occurence of character : " + occurrenceOfCharacter);

        //find all duplicate element in string

        List<String> collect3 = list2.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println("duplicate character : " + collect3);

        //unique element
        List<String> collect4 = list2.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println("unique element : " + collect4);

        //find first non repeat character in string
        String key = list2.stream().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() == 1).findFirst().get().getKey();
        System.out.println("non repeat character in string : " + key);

        //find second higest number in the given array
        int[] num = {5, 9, 11, 2, 8, 21, 1};
        List<Integer> secondHighestNumber = Arrays.stream(num).boxed().sorted(Collections.reverseOrder()).skip(1).limit(1).collect(Collectors.toList());
        System.out.println("Second Highest Salary : " + secondHighestNumber);

        //find longest String in given array
        String[] strArray = {"java", "microservices", "springboot", "jpa"};
        String s = Arrays.stream(strArray).reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2).get();
        System.out.println("longest string : " + s);

        //find element in Array Start with 1

        int[] numb = {1, 12, 21, 32, 41, 11, 17, 14};
        List<String> collect5 = Arrays.stream(numb).boxed().map(st -> st + "").filter(st -> st.startsWith("1")).collect(Collectors.toList());
        System.out.println("element start with 1: " + collect5);

        //string joinner
        List<String> list3 = Arrays.asList("1", "2", "3", "4", "5");
        String join = String.join("-", list3);
        System.out.println("String joinner: " + join);

        //select which employee whose age is greater than 20 and less than 40
        List<Employee> collect6 = employee.stream().filter(e -> e.getAge() > 20 && e.getAge() < 40).collect(Collectors.toList());
        System.out.println("employee whose age is greater than 20 and less than 40" + collect6);

        ///select which employee whose have in HR dep and then sort by their name
        List<Employee> it = employee.stream().filter(e -> e.getDep().equals("HR")).sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
        System.out.println("mployee whose have in HR dept and then sort by their name : " + it);

        //find all the department from employee
        List<String> collect7 = employee.stream().map(e -> e.getDep()).distinct().collect(Collectors.toList());
        System.out.println("All department in employee list : " + collect7);

        //group the employee by dept wise
        List<Map.Entry<String, List<Employee>>> collect8 = employee.stream().collect(Collectors.groupingBy(Employee::getDep))
                .entrySet().stream().collect(Collectors.toList());
        System.out.println(collect8);

        //count the employee by dept wise
        List<Map.Entry<String, Long>> collect9 = employee.stream().collect(Collectors.groupingBy(Employee::getDep, Collectors.counting()))
                .entrySet().stream().collect(Collectors.toList());
        System.out.println("counting employee department wise :" + collect9);

        //  highest salary in each department
        Map<String, Optional<Employee>> collect10 = employee.stream()
                .collect(Collectors.groupingBy(Employee::getDep, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
        System.out.println(collect10);

        // second highest salary

        Employee employee1 = employee.stream().sorted(Comparator.comparing(Employee::getSalary)).skip(2).findFirst().get();
        System.out.println(employee1);

        //highest frequency means come more time in list
        System.out.println("++++___++++++++______");

//        List<Employee> collect11 = employee.stream()
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//                .entrySet().stream()
//                .max(Map.Entry.comparingByValue()).stream().map(Map.Entry::getKey).
//                collect(Collectors.toList());
//        System.out.println(collect11);

    }
}
