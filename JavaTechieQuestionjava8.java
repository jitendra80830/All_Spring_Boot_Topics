package streamApi;

//import loop.SumOfDigit;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaTechieQuestionjava8 {
    public static void main(String[] args) {

        //for Each
        List<Employ> employees = EmployeeDataBase.getAllEmploy();

        employees.forEach(e -> System.out.println(e.getName() + "---: " + e.getSalary()));
        employees.stream().forEach(System.out::println);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        //filter
        //collect
        Map<Integer, String> employeeWhoWorkOnDevelopmentDept = employees.stream()
                .filter(e -> e.getDept().equals("Development") && e.getSalary() > 80000)
                .collect(Collectors.toMap(Employ::getId, Employ::getName));

        System.out.println(employeeWhoWorkOnDevelopmentDept);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        //map
        List<String> department = employees.stream().map(Employ::getDept).distinct().collect(Collectors.toList());
        System.out.println(department);

        //tomap
        Map<String, Double> employeeSalaryMap = employees.stream().collect(Collectors.toMap(Employ::getName, Employ::getSalary));
        System.out.println("using to map :"+employeeSalaryMap);

        //get list of field
        List<Stream<String>> collect = employees.stream().map(e -> e.getProjects()
                .stream().map(p -> p.getName())).collect(Collectors.toList());

        //flatmap

        List<String> projects = employees.stream().flatMap(e -> e.getProjects().stream()
                .map(p -> p.getName())).collect(Collectors.toList());
        System.out.println(projects);

        //sorted

        List<Employ> sortedemp = employees.stream().sorted(Comparator.comparing(Employ::getSalary).reversed()).collect(Collectors.toList());
        System.out.println("Salary in dec ::"+sortedemp);
        
        //min max
        Optional<Employ> highestPaidEmployee = employees.stream().max(Comparator.comparingDouble(Employ::getSalary));
        System.out.println(highestPaidEmployee);

        Optional<Employ> lowestPaidEmployee = employees.stream().min(Comparator.comparingDouble(Employ::getSalary));
        System.out.println(lowestPaidEmployee);

        //groupingby gender
        Map<String, List<Employ>> employeeGroup = employees.stream().collect(Collectors.groupingBy(Employ::getGender));
        System.out.println(employeeGroup);

        //grouping by gender show name

        Map<String, List<String>> employeeGroupNames = employees.stream().collect(Collectors.groupingBy(Employ::getGender, Collectors.mapping(Employ::getName, Collectors.toList())));
        System.out.println(employeeGroupNames);

        //grouping by gender show name and count
        Map<String, Long> groupbycounting = employees.stream().collect(Collectors.groupingBy(Employ::getGender, Collectors.counting()));
        System.out.println(groupbycounting);

        //findFirst

        Optional<Employ> findFirst = employees.stream().filter(e -> e.getDept().equals("Development")).findFirst();
        if (findFirst.isPresent()) {
            System.out.println(findFirst.get());
        }
        findFirst.ifPresent(e -> System.out.println(e.getName()));


        //merge List into a single map

        List<String> keys = Arrays.asList("apple", "banana", "cherry");
        List<String> values = Arrays.asList("red", "yellow", "red");


        Map<String, String> result = IntStream.range(0, keys.size())
                .boxed()
                .collect(Collectors.toMap(keys::get, values::get));

        System.out.println(result);

        ///Given a list of Employee objects, group the employees first by their department, and then by their salary range (e.g., low, medium, high)

        Map<String, Map<String, List<Employ>>> result1 = employees.stream().collect(Collectors.groupingBy(Employ::getDept, Collectors.groupingBy(
                e -> {
                    if (e.getSalary() < 40000) return "low";
                    else if (e.getSalary()<= 80000) return "medium";
                    else return "high";
                }
        )));

        System.out.println(result1);

        //printing specific fields
        Map<String, Map<String, List<String>>> result2 = employees.stream().collect(Collectors.groupingBy(Employ::getDept, Collectors.groupingBy(
                e -> {
                    if (e.getSalary() < 40000) return "low";
                    else if (e.getSalary() <= 80000) return "medium";
                    else return "high";
                }, Collectors.mapping(e -> e.getName() + " :" + e.getSalary(), Collectors.toList())
        )));

        System.out.println(result2);


        ///  grouping with summarizing

        Map<String, DoubleSummaryStatistics> totalSalaryByDept = employees.stream().collect(Collectors.groupingBy(Employ::getDept, Collectors.summarizingDouble(Employ::getSalary)));

        System.out.println("total salary of dept"+" :"+totalSalaryByDept);

        //partioning

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        // Partitioning the numbers into even and odd
        Map<Boolean, List<Integer>> partitioned = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        System.out.println("Even numbers: " + partitioned.get(true));
        System.out.println("Odd numbers: " + partitioned.get(false));

        /// Grouping by department and mapping employee names to uppercase
        Map<String, List<String>> result3 = employees.stream()
                .collect(Collectors.groupingBy(
                        Employ::getDept,  // Grouping by department
                        Collectors.mapping(e -> e.getName().toUpperCase(), Collectors.toList())  // Mapping to uppercase names
                ));

        System.out.println(result3);

        //Group a List of Employees by Department and Find the Average Salary

        Map<String, Double> collect1 = employees.stream()
        		.collect(Collectors.groupingBy(Employ::getDept, Collectors.averagingDouble(Employ::getSalary)));

        collect1.forEach((depart,avgSalary)->System.out.println(depart+": "+avgSalary));

        System.out.println(collect1);

        //Find the Highest and Lowest Salary in the Company Using Collectors

        Employ maximumSalary = employees.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employ::getSalary))).orElseThrow(() -> new RuntimeException("No Employee"));
        System.out.println(maximumSalary.getName()+" :"+maximumSalary.getSalary());

        //Count the Occurrence of Each Element in a List Using


        Map<String, Long> countDept = employees.stream().collect(Collectors.groupingBy(Employ::getDept, Collectors.counting()));
        System.out.println(countDept);

        //Convert a List of Strings to Uppercase and Collect Into a Set

        Map<String, List<Employ>> collect2 = employees.stream().collect(Collectors.groupingBy(e -> e.getDept().toUpperCase(), Collectors.toList()));

        collect2.forEach((dep,nam)->{
            System.out.println(dep +" : "+nam);
            nam.forEach(e->{
                System.out.println(e.getDept()+"="+e.getName()+":"+e.getSalary());
            });
        });

        //Find the Maximum and Minimum Salary Using Collectors.reducing()

        Employ maxSalaryByReducing = employees.stream()
                .collect(Collectors.reducing((e1, e2) -> e1.getSalary() > e2.getSalary() ? e1 : e2)).orElseThrow(() -> new RuntimeException("No Employee"));
        Employ minSalaryByReducing = employees.stream()
                .collect(Collectors.reducing((e1, e2) -> e1.getSalary() < e2.getSalary() ? e1 : e2)).orElseThrow(() -> new RuntimeException("No Employee"));

        System.out.println("maxSalaryByReducing := "+maxSalaryByReducing.getSalary());
        System.out.println("minSalaryByReducing := "+minSalaryByReducing.getSalary());
        
        //Practice
         LinkedHashMap<String, Double> collect3 = employees.stream()
                .sorted(Comparator.comparing(Employ::getSalary)) // Sort by salary
                .collect(Collectors.toMap(Employ::getName, Employ::getSalary,(existing, replacement) 
                		-> existing,LinkedHashMap::new)); // Map names to salaries

            System.out.println(collect3);
            
            employees.stream()
            .sorted(Comparator.comparing(Employ::getSalary))  // Sort by salary
            .map(Employ::getSalary)  // Extract only the salaries
            .forEach(System.out::println);
            
            employees.stream()
            .sorted(Comparator.comparing(Employ::getSalary)) // Sort by name
            .forEach(e -> System.out.println(e.getName() + ": " + e.getSalary()));
            
            String str="1,2,3,4,5,6,7";
            
            int val = Arrays.stream(str.split(",")).mapToInt(Integer::parseInt).sum();
            System.out.println(val);
            
            String st="sanadeep";
            String string = Arrays.stream(st.split(""))
            		.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
            		.entrySet().stream().filter(e -> e.getValue()==1)
            		.map(Map.Entry ::getKey)
            		.findFirst().get();
            System.out.println(string);
            
            List<String> collect4 = Arrays.stream(st.split(""))
    		.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
    		.entrySet().stream().filter(e -> e.getValue()==1)
    		.map(Map.Entry ::getKey)
    		.collect(Collectors.toList());
            System.out.println(collect4);
            
            List<String> list= Arrays.asList("Kishor","Sandeep","Nareshverma");
            String string2 = list.stream().reduce((e1,e2)->e1.length()>e2.length()? e1:e2).get();
            System.out.println(string2);
            
            int[] ar= {10,60,2,3,5,6,7};
            int s=3;
            List<Integer> collect5 = Arrays.stream(ar).boxed().limit(s).sorted().collect(Collectors.toList());
            System.out.println(collect5);
            
            List<String> collect6 = Arrays.stream(ar).mapToObj(e -> e >=33 ? "Pass":"Fail").sorted().collect(Collectors.toList());
            System.out.println(collect6);
            
            //get name by get dept
            Map<String,List<String>> collect7 = employees.stream()
            		.collect(Collectors.groupingBy(Employ::getDept,Collectors.mapping(Employ::getName, Collectors.toList())));
            System.out.println(collect7);
            
            Map<String, Double> collect8 = employees.stream()
            		.collect(Collectors.groupingBy(Employ::getDept,Collectors.averagingDouble(Employ::getSalary)));
            collect8.forEach((depart,salary)->System.out.println(depart +"-"+salary));         

    }
}
