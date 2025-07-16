package CuncurrentAPI.collable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SubmitWithRunnable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService ex = Executors.newSingleThreadExecutor();
        Runnable r = () ->{
            System.out.println("Waiting");
            try {
                Thread.sleep(3000);
                System.out.println("Task Completed");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        Future<?> future = ex.submit(r);
        //future.get();
        System.out.println("Task has been completed");
    }
}
