package CuncurrentAPI.SemaphoreDemo;

import java.util.concurrent.Semaphore;

public class DecreamentCount {
    private Semaphore semaphore;
    private String name;

    public DecreamentCount(Semaphore semaphore , String name){
        this.semaphore = semaphore;
        this.name = name;
        new Thread(r2).start();
    }
    Runnable r2 = () ->{
        System.out.println(name+ " is waiting for permit");
        try {
            System.out.println(name+ " is get permit");
            semaphore.acquire();
            for (int i = 0; i < 5; i++) {
                Shared.count--;
                System.out.println(name+ " : "+Shared.count);
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(name+ " is released");
        semaphore.release();

    };
}
