package streamApi;

public class Employee {
    private  int id;
    private String name;
    private int age;
    private int salary;
    private String dep;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", dep='" + dep + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    public Employee(int id, String name, int age, int salary, String dep) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.dep = dep;
    }

	public void display() {
		// TODO Auto-generated method stub
		
	}
}
