package concurrentAPI.CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class MyThread implements Runnable{

    private CountDownLatch latch;

    public MyThread(CountDownLatch latch){
        this.latch = latch;
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            latch.countDown(); // decrement count
        }

    }
}
