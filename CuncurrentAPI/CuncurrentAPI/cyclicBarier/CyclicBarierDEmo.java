package CuncurrentAPI.cyclicBarier;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarierDEmo {
    public static void main(String[] args) {
        CyclicBarrier cb = new CyclicBarrier(3 ,() ->{
            System.out.println("Barrier Reached");
        });
        System.out.println("Starting.");
        new MyTread(cb , "A");
        new MyTread(cb , "B");
        new MyTread(cb , "C");


    }
}
