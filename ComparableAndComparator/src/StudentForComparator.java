public class StudentForComparator {
    private String name;
    private String phone;
    private Integer sId;

    public StudentForComparator(String name , String phone , Integer sId){
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
        return "StudentForComparator{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", sId=" + sId +
                '}';
    }
}
