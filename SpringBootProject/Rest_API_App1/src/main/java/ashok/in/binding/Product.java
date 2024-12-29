package ashok.in.binding;

public class Product {
    private String pname;

    private String pid;

    public Product(){

    }

    public Product(String pname, String pid) {
        this.pname = pname;
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pname='" + pname + '\'' +
                ", pid='" + pid + '\'' +
                '}';
    }
}
