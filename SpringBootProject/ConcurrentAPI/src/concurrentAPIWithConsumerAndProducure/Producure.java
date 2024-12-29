package concurrentAPIWithConsumerAndProducure;

public class Producure implements Runnable {

    Q q;

    Producure(Q q) {
        this.q = q;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            q.put(i);
        }
    }
}
