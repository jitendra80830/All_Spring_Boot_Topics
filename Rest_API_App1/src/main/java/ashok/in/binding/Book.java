package ashok.in.binding;

public class Book {

    private Integer bid;

    private String bName;

    private Double bPrice;

    public Book(){

    }

    public Book(Integer bid, String bName, Double bPrice) {
        this.bid = bid;
        this.bName = bName;
        this.bPrice = bPrice;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public Double getbPrice() {
        return bPrice;
    }

    public void setbPrice(Double bPrice) {
        this.bPrice = bPrice;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bid=" + bid +
                ", bName='" + bName + '\'' +
                ", bPrice=" + bPrice +
                '}';
    }
}
