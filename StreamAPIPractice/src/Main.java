import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee(1, "Amit", 80000, "IT",
                        List.of("Java", "Python", "SQL")),

                new Employee(2, "Rahul", 90000, "HR",
                        List.of("Java", "SQL")),

                new Employee(3, "Neha", 75000, "IT",
                        List.of("Java", "Kotlin", "SQL")),

                new Employee(4, "Priya", 95000, "Finance",
                        List.of("Python", "Java")),

                new Employee(5, "Raj", 85000, "IT",
                        List.of("Go", "Java", "Python"))
        );

        //Using Stream API, find all distinct programming languages used by all employees.
        List<String> distlang = employees.stream().map(Employee::getLanguages).flatMap(List::stream).distinct().toList();
//        System.out.println(distlang);

        //find the employee with the highest salary using Stream API
        Employee highestSlry = employees.stream().max(Comparator.comparing(Employee::getSalary)).get();
//        System.out.println(highestSlry);

        //find the names of all employees whose salary is greater than 80,000.
        List<String> namesEmp = employees.stream().filter(e -> e.getSalary() > 80000).map(Employee::getName).toList();
//        System.out.println(namesEmp);

        //find the average salary of all employees
        Double avgSlry = employees.stream().collect(Collectors.averagingDouble(Employee::getSalary));
//        System.out.println(avgSlry);

        //find the number of employees in each department.
        Map<String, Long> countEmpDtpWise = employees.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.counting()));
//        System.out.println(countEmpDtpWise);
//find the highest-paid employee from each department.
        Map<String, Employee> highPaidDeptWise = employees.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.collectingAndThen(
                Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)
                ), Optional::get)));
//        System.out.println(highPaidDeptWise);


        //Find the department-wise employee who has the highest number of programming languages.
       Map<String , Employee> highestLangDetpWise =  employees.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.collectingAndThen(
                Collectors.maxBy(Comparator.comparingInt(e -> e.getLanguages().size()))
                , Optional::get)));
//        System.out.println(highestLangDetpWise);

        //Find the most commonly used programming language among all employees.
          String mostLanUsed =  employees.stream().map(Employee::getLanguages).flatMap(List::stream).collect(Collectors
                .groupingBy(Function.identity() , Collectors.counting()))
                .entrySet().stream().max(Comparator.comparingLong(Map.Entry::getValue)).map(Map.Entry::getKey).get();
//        System.out.println(mostLanUsed);

        //Find the department whose employees have the highest average salary.
     String highestEveSlry =  employees.stream().collect(Collectors.groupingBy(Employee::getDept , Collectors.averagingDouble(Employee::getSalary)))
              .entrySet().stream().max(Comparator.comparingDouble(Map.Entry::getValue)).map(Map.Entry::getKey).get();
        System.out.println(highestEveSlry);
    }
}