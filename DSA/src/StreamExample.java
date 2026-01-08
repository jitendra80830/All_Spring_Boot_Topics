import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Company {
    private List<Department> departments;
    // constructor, getters, setters
    public Company(List<Department> departments) {
        this.departments = departments;
    }
    public List<Department> getDepartments() {
        return departments;
    }
}

class Department {
    private List<Team> teams;
    public Department(List<Team> teams) {
        this.teams = teams;
    }
    public List<Team> getTeams() {
        return teams;
    }
}

class Team {
    private List<Employee> employees;
    public Team(List<Employee> employees) {
        this.employees = employees;
    }
    public List<Employee> getEmployees() {
        return employees;
    }
}

class Employee {
    private String name;
    public Employee(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}


public class StreamExample {
    public static void main(String[] args) {
        // Sample data
        Employee e1 = new Employee("Alice");
        Employee e2 = new Employee("Bob");
        Employee e3 = new Employee("Charlie");

        Team team1 = new Team(List.of(e1, e2));
        Team team2 = new Team(List.of(e3));

        Department dept1 = new Department(List.of(team1, team2));
        Company company = new Company(List.of(dept1));

        // Stream API to get employee names
    //write the logic here
        List<List<Department>> list = Stream.of(company).map(n -> n.getDepartments()).toList();
        List<Department> list1 = list.stream().map(n -> n.get(0)).toList();
        List<List<Team>> team = list1.stream().map(Department::getTeams).toList();

        List<Team> list2 = team.stream().flatMap(List::stream).toList();
        List<List<Employee>> list3 = list2.stream().map(Team::getEmployees).toList();
        List<Employee> list4 = list3.stream().flatMap(List::stream).toList();
        List<String> list5 = list4.stream().map(Employee::getName).toList();
        System.out.println(list5);


    }
}