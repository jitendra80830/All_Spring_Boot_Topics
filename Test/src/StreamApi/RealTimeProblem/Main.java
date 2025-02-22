package StreamApi.RealTimeProblem;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

		// How many male and female employees are there in the organization?

		Map<String, Long> countMaleFemale = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

		// Descending order based on Age(highest age will be top of the list and lower
		// age will be bottom of the list of employee)
		List<Employee> list = employeeList.stream().sorted((a, b) -> Integer.compare(b.getAge(), a.getAge()))
				.collect(Collectors.toList());
		// System.out.println(list);
		// list.forEach(n -> System.out.println(n.getName()+" "+n.getAge()));

		// Print the unique name of all departments in the organization?
		employeeList.stream().map(Employee::getDepartment).distinct().forEach(n -> System.out.println(n));

		// What is the average age of male and female employees?
		Map<String, Double> averageAgeOfMaleFemale = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
		// System.out.println(averageAgeOfMaleFemale);

		// Get the details of highest paid employee in the organization?
		Optional<Employee> higestPaidEmloyee = employeeList.stream()
				.collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
		// System.out.println(higestPaidEmloyee.get());

		// Get the names of all employees who have joined after 2015?
		employeeList.stream().filter(n -> n.getYearsOfExp() > 2015).map(Employee::getName)
				.forEach(n -> System.out.println(n));

		// Count the number of employees in each department?
		Map<String, Long> countEachDept = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println(countEachDept);

		// What is the average salary of each department?
		Map<String, Double> averageSalaryEachDepartment = employeeList.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		// System.out.println(averageSalaryEachDepartment);

		// Who has the most working experience in the organization?
		Optional<Employee> mostWorkingDay = employeeList.stream()
				.sorted(Comparator.comparingInt(Employee::getYearsOfExp)).findFirst();
		//System.out.println(mostWorkingDay.get());

		// What is the average salary of male and female employees?
		Map<String, Double> aveSalaryGender = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
		//System.out.println(aveSalaryGender);

		// List down the names of all employees in each department?
		Map<String, List<Employee>> dept = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));
		Set<Entry<String, List<Employee>>> entrySet = dept.entrySet();
		for (Entry<String, List<Employee>> entry : entrySet) {
			System.out.println("Name of Dempartment: " + entry.getKey());
			List<Employee> list1 = entry.getValue();
			for (Employee e : list1) {
				System.out.println("  "+e.getName());

			}
		}
		
		//What is the average salary and total salary of the whole organization?
		
			DoubleSummaryStatistics doubleSummaryStatistics = employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
			//System.out.println("Evarage Salary: "+doubleSummaryStatistics.getAverage());
			//System.out.println("Total Salary: "+doubleSummaryStatistics.getSum());
		
		
		//Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.
			
			
			//Who is the oldest employee in the organization? What is his age and which department he belongs to?
			Optional<Employee> max = employeeList.stream().max(Comparator.comparingInt(Employee::getAge));
			Employee employee = max.get();
			System.out.println("Name: "+employee.getName());
			System.out.println("Age: "+employee.getAge());
			System.out.println("Department: "+employee.getDepartment());

		// System.out.println(countMaleFemale);

	}

}
