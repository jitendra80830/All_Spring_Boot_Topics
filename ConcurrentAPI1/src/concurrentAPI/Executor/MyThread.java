package concurrentAPI.Executor;


import java.util.concurrent.CountDownLatch;

public class MyThread implements Runnable {
    private String name;
    private CountDownLatch latch;

    public MyThread(CountDownLatch latch, String name) {
        this.latch = latch;
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(this.name+ " : "+i);
            latch.countDown();
        }

    }
}
