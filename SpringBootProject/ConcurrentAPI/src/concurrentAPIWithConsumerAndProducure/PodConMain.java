package concurrentAPIWithConsumerAndProducure;

public class PodConMain {
    public static void main(String[] args) {
        Q q = new Q();
        new Thread(new Consumer(q) , "Consumer").start();
        new Thread(new Producure(q) , "Producer").start();
    }
}
