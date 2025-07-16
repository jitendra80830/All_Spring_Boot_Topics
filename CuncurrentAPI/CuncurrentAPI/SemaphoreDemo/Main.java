package CuncurrentAPI.SemaphoreDemo;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);
        new IncrementCount(semaphore , "A");
        new DecreamentCount(semaphore , "B");
    }
}
