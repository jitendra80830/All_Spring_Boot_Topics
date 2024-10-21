package DesignPattern.singletoneDesign;

public class SigletoneMain {
    public static void main(String[] args) {
        //new Samausa();
        Samausa samausa = Samausa.getSamausa();
        System.out.println(samausa.hashCode());

        Samausa samausa1 = Samausa.getSamausa();
        System.out.println(samausa1.hashCode());
        System.out.println(Book.getBook().hashCode());
    }
}
