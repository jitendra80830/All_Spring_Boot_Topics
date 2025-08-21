package CuncurrentAPI.collable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("Starting..");
        ExecutorService ex = Executors.newFixedThreadPool(3);
        Future<Integer> sum = ex.submit(new Sum(10));
        Future<Double> sq = ex.submit(new SquareRoot(44));
        Future<Integer> fact = ex.submit(new FactorialEx(5));
        System.out.println(sum.get());
        System.out.println(sq.get());
        System.out.println(fact.get());
        ex.shutdown();
        System.out.println("Completed..");

    }

}

