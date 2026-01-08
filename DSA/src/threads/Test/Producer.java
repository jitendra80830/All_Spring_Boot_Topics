package threads.Test;

public class Producer extends Thread {

    private SharedResource sharedResource;

    public Producer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    public void run() {
        int value = 1;


        while (true) {
            sharedResource.produce(value++);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
