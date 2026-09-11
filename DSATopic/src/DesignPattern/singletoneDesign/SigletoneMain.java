package DesignPattern.singletoneDesign;

public class SigletoneMain {
    public static void main(String[] args) {
        //new Samausa();
        Samausa samausa = Samausa.getSamausa();
        System.out.println(samausa.hashCode());

        Samausa samausa1 = Samausa.getSamausa();
        System.out.println(samausa1.hashCode());
        System.out.println(Book.getBook().hashCode());
        Book book1 = Book.getBook();
        Book book2 = Book.getBook();

        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
    }
}
