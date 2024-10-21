package abstractPattern;

public class WebDeveloper implements Employee{
    @Override
    public int salary() {
        System.out.println("Getting Web Developer Salary");
        return 90000;
    }

    @Override
    public String name() {
        System.out.println("Name of the WebDeveloper");
        return "WebDeveloper";
    }
}
