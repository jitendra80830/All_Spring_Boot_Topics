package in.ashokit.beans;

public class Library {
    private int book_Id;
    private String book_Name;
    private double book_Price;

    public int getBook_Id() {
        return book_Id;
    }

    public void setBook_Id(int book_Id) {
        this.book_Id = book_Id;
    }

    public String getBook_Name() {
        return book_Name;
    }

    public void setBook_Name(String book_Name) {
        this.book_Name = book_Name;
    }

    public double getBook_Price() {
        return book_Price;
    }

    public void setBook_Price(double book_Price) {
        this.book_Price = book_Price;
    }
}
