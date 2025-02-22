package concurrentAPI.SemaphoreExample;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(1);
        new IncreamentCount("A" , sem);
        new DecreamentCount("B" , sem);
    }
}
