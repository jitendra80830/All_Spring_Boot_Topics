package threads.Test;

public class SequencePrintThreeThread {
    public static void main(String[] args) {
        Runnable task = new PrintNumber();
        Thread t1 = new Thread(task ,  "t1");
        Thread t2 = new Thread(task , "t2");
        Thread t3 = new Thread(task , "t3");
        t1.start();
        t2.start();
        t3.start();
    }
}
