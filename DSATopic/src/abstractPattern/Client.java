package abstractPattern;

public class Client {
    public static void main(String[] args) {

        Employee employee = EmployeeFactory.getEmployee(new WebFactory());
        System.out.println(employee.name());
        System.out.println(employee.salary());

        Employee employee1 = EmployeeFactory.getEmployee(new AndroidFactory());
        System.out.println(employee1.name());
        System.out.println(employee1.salary());
    }
}
