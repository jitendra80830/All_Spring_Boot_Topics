package concurrentAPI;

import java.util.concurrent.Semaphore;

public class SemaphoreDemo {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);
        new Thread(new IncrementThread(semaphore ,"A")).start();
        new Thread(new DecrementThread(semaphore , "B")).start();
      /*  t1.start();
        t2.start();*/
    }
}
