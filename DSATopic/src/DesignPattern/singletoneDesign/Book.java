package DesignPattern.singletoneDesign;

public class Book {
    private static Book book = new Book();

    //Eagar way to create singleton object
    public static Book getBook(){
        return book;
    }
}
