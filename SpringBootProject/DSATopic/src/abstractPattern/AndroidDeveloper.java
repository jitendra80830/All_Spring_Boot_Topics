package abstractPattern;

public class AndroidDeveloper implements Employee {
    @Override
    public int salary() {
        System.out.println("Getting Android Developer salary");
        return 3003;
    }

    @Override
    public String name() {
        System.out.println("Getting Android Developer name");
        return "AndroidDeveloper";
    }
}
