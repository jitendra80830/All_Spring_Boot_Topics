package concurrentAPI.CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(5);

        new Thread(new MyThread(latch)).start();
        try {
            latch.await();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Done");
    }
}
