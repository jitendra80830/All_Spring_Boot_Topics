package concurrentAPI.SemaphoreExample;

import javax.lang.model.element.Name;
import java.util.concurrent.Semaphore;

public class IncreamentCount {
    private String name;
    private Semaphore sem;

    public IncreamentCount(String name , Semaphore sem){
        this.name = name;
        this.sem = sem;
        new Thread(r2).start();
    }
    Runnable r2 = () ->{
        try {
            System.out.println(name + " is waiting for a permit");
            sem.acquire();
            System.out.println(name + " is get pa permit");
            for (int i = 1; i <=5; i++) {
                Shared.count++;
                System.out.println(name + " : "+Shared.count);
                Thread.sleep(10);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println(name + "release a permit");
        sem.release();
    };
}
