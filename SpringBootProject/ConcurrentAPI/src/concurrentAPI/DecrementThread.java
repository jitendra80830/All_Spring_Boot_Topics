package concurrentAPI;

import java.util.concurrent.Semaphore;

public class DecrementThread implements Runnable {
    String name;
    Semaphore semaphore;

    public DecrementThread(Semaphore s , String n){
        semaphore = s;
        name = n;
    }

    @Override
    public void run() {
        System.out.println("Starting..... "+name);

        try {
            //First get permit
            System.out.println(name+" is the waiting for the permit.");
            semaphore.acquire();
            System.out.println(name+ " gets the permit");

            //Now access the thread resource
            for (int i = 0; i < 5; i++) {
                Shared.count--;
                System.out.println(name+" : "+Shared.count);

                // Now , allow a context switch -- if possible
                Thread.sleep(10);
            }
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        //Release the permit
        System.out.println(name+" Release the permit.");
        semaphore.release();
    }

}
