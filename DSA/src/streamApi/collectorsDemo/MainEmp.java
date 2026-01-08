package streamApi.collectorsDemo;

import java.util.*;
import java.util.stream.Collectors;

public class MainEmp {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", "HR", 50000, true),
                new Employee(2, "Bob", "IT", 70000, true),
                new Employee(3, "Charlie", "HR", 60000, false),
                new Employee(4, "David", "IT", 80000, true),
                new Employee(5, "Eve", "Finance", 90000, true),
                new Employee(6, "Frank", "Finance", 75000, false)
        );


        //Group employees by department
        Map<String, List<Employee>> groupByDept = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(groupByDept);

        //Count employees in each department

        Map<String, Long> countDept = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(countDept);

        //Average salary by department
        Map<String, Double> eveSalaryBYDept = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(eveSalaryBYDept);

        //Highest paid employee in each department

        Map<String, Optional<Employee>> highestPaidSalaryByDept = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
        System.out.println(highestPaidSalaryByDept);

        //Partition employees into Active and Inactive
        Map<Boolean, List<Employee>> partition = employees.stream().collect(Collectors.partitioningBy(Employee::isActive));
        System.out.println(partition);

        //Find total salary expense of company
        Double sumSalary = employees.stream().mapToDouble(Employee::getSalary).sum();
        System.out.println(sumSalary);

        //Join all employee names into a single String
        String joining = employees.stream().map(Employee::getDepartment).collect(Collectors.joining(","));
        System.out.println(joining);

        //Department → List of Employee Names (instead of whole object)
        Map<String, List<String>> collect = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getName, Collectors.toList())));
        System.out.println(collect);



    }
}
