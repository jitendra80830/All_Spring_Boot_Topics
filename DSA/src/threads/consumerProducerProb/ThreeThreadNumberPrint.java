package threads.consumerProducerProb;

//Create 3 Thread and print 1 to 100 continuously without overlapping
public class ThreeThreadNumberPrint {
    public static void main(String[] args) {
        Runnable task = new NumberTask();

        Thread t1 = new Thread(task, "t1");
        Thread t2 = new Thread(task, "t2");
        Thread t3 = new Thread(task, "t3");
        t1.start();
        t2.start();
        t3.start();

    }
}
