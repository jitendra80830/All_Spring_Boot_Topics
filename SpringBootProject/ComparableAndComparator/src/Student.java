public class Student implements Comparable<Student> {
    private String name;
    private String phone;
    private Integer sId;

    public Student(String name , String phone , Integer sId){
        this.name = name;
        this.phone = phone;
        this.sId = sId;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public Integer getsId() {
        return sId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", sId=" + sId +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.sId  - o.sId;
    }
}
