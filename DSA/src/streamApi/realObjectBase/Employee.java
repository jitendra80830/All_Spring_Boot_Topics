package streamApi.realObjectBase;

class Employee {
    private int id;
    private double salary;
    private String firstName;
    private String lastName;

    public Employee(int id, double salary, String firstName, String lastName) {
        this.id = id;
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return id + " - " + firstName + " " + lastName + " - Salary: " + salary;
    }
}