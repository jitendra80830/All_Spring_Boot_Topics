package CuncurrentAPI.SemaphoreDemo;

import java.util.concurrent.Semaphore;

public class IncrementCount {
    private Semaphore semaphore;
    private String name;

    public IncrementCount(Semaphore semaphore , String name){
        this.name = name;
        this.semaphore  = semaphore;
        new Thread(r1).start();
    }
    Runnable r1 = () ->{
        System.out.println(name+" is waiting for permit..");
        try {
            System.out.println(name+ " is get permit..");
            semaphore.acquire();
            for (int i = 0; i < 5; i++) {
                Shared.count++;
                System.out.println(name+ " : "+Shared.count);
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(name+ " is released..");
        semaphore.release();;
    };
}
