package ashok.in.binding;

public class Student {

    private String name;

    private Integer sId;

    public Student() {

    }

    public Student(String name, Integer sId) {
        this.name = name;
        this.sId = sId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sId=" + sId +
                '}';
    }
}

