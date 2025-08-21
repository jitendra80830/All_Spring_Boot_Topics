package concurrentAPI.Executor;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorMain {
    public static void main(String[] args) {
        CountDownLatch latch1 = new CountDownLatch(5);
        CountDownLatch latch2 = new CountDownLatch(5);
        CountDownLatch latch3 = new CountDownLatch(5);
        CountDownLatch latch4 = new CountDownLatch(5);
        ExecutorService ex = Executors.newFixedThreadPool(2);

        ex.execute(new MyThread(latch1, "A"));
        ex.execute(new MyThread(latch2, "B"));
        ex.execute(new MyThread(latch3, "C"));
        ex.execute(new MyThread(latch4, "D"));

        try {
            latch1.await();
            latch2.await();
            latch3.await();
            latch4.await();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        ex.shutdown();
    }
}
