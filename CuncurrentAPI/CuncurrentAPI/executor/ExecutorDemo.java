package CuncurrentAPI.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newFixedThreadPool(3);
        for (int i = 1; i < 9; i++) {
            ex.execute(new MyThread(i));
        }
        ex.shutdown();
    }
}
