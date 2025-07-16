package concurrentAPIWithConsumerAndProducure;

import java.util.concurrent.Semaphore;

public class Q {
    int n;

    //Start Consumer Semaphore unavailable
    static Semaphore semCon = new Semaphore(0);
    static Semaphore semProd = new Semaphore(1);

    public void put(int i) {
        try {
            semProd.acquire();
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        this.n = i;
        System.out.println("Put "+n);
        semCon.release();;
    }

    public void get() {
        try {
            semCon.acquire();
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Got "+n);
        semProd.release();
    }
}
