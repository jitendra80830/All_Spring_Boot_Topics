package CuncurrentAPI.CountDownLatchDemo;

import java.util.concurrent.CountDownLatch;

public class Example {
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(3);
        for (int i = 0; i < 3; i++) {
            new Thread(() -> {

                System.out.println("Thread completed by " + Thread.currentThread().threadId());
                latch.countDown();
            }).start();
        }
        try {
            latch.await();
            System.out.println("All Task have been completed");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ;
    }
}