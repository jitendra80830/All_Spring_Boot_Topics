package concurrentAPI.SemaphoreExample;

import java.util.concurrent.Semaphore;

public class DecreamentCount {
    private String name;
    private Semaphore sem;

    public DecreamentCount(String name , Semaphore sem){
        this.name = name;
        this.sem = sem;
        new Thread(r1).start();
    }
    Runnable r1 =  () ->{
        try {
            System.out.println(name + " is waiting for a permit");
            sem.acquire();
            System.out.println(name + " get a permit");
            for (int i = 5; i >= 1; i--) {
                Shared.count--;
                System.out.println(name + " : " + Shared.count);
                Thread.sleep(10);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println(name+ "release a permit");
        sem.release();
        
    };
}
